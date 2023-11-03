import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;


class SV{
	private String MSV,name,lop,date;
	private double gpa;
	private static int id=1;
	
	public SV(String name,String lop, String date, double gpa) {
		if(id<10) {
			this.MSV = "B20DCCN00";
		}else if(id>=10 && id<=99) {
			this.MSV = "B20DCCN0";
		}
		MSV+=Integer.toString(id++);
		this.name = name;
		this.lop = lop;
		this.date = date;
		this.gpa = gpa;
	}
	
	public double getGPA() {
		return gpa;
	}
	
	public void chuanHoaNgaySinh() {
		StringBuilder sb = new StringBuilder(this.date);
		if(sb.charAt(1)=='/') {
			sb.insert(0,"0");
		}
		if(sb.charAt(4)=='/') {
			sb.insert(3,"0");
		}
		this.date = sb.toString();
	}
	
	public void chuanHoaTen() {
		String arr[] = this.name.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(String x:arr) {
			x = x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase();
			sb.append(x);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		this.name = sb.toString();
	}
	
	@Override
	public String toString() {
		return this.MSV+" "+this.name+" "+this.lop+" "+this.date+" "+String.format("%.2f", this.gpa);
	}
	
}

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<SV>list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			String lop = sc.nextLine();
			String date = sc.nextLine();
			double gpa = sc.nextDouble();
			SV sv = new SV(name,lop,date,gpa);
			sv.chuanHoaNgaySinh();
			sv.chuanHoaTen();
			list.add(sv);
		}
		Collections.sort(list, new Comparator<SV>() {
			@Override
			public int compare(SV a, SV b) {
				if(a.getGPA() > b.getGPA()) {
					return -1;
				}else {
					return 1;
				}
			}
		});
		for(SV x:list) {
			System.out.println(x);
		}
	}
}
