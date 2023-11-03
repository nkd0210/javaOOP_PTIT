import java.util.Scanner;

class SV {
	private static int id=1;
	private String name,lop,date,MSV;
	private double gpa;
	
	public SV(String name, String lop, String date, double gpa) {
		if(id<10) {
			this.MSV = "B20DCCN00";
			MSV+=Integer.toString(id++);
		}else if(id>=10 && id<=99) {
			this.MSV = "B20DCCN0";
			MSV+=Integer.toString(id++);
		}
		this.name = name;
		this.lop = lop;
		this.date = date;
		this.gpa = gpa;
	}
	
	public void chuanHoaNgaySinh() {
		StringBuilder sb = new StringBuilder(this.date);
		if(sb.charAt(1)=='/') {
			sb.insert(0, "0");
		}
		if(sb.charAt(4)=='/') {
			sb.insert(3, "0");
		}
		this.date = sb.toString();
	}
	
	@Override
	public String toString() {
		return this.MSV +" "+this.name+" "+this.lop+" "+this.date+" "+String.format("%.2f", this.gpa);
	}
	
}

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			String lop  = sc.nextLine();
			String date = sc.nextLine();
			double gpa  = sc.nextDouble();
			SV sv = new SV(name,lop,date,gpa);
			sv.chuanHoaNgaySinh();
			System.out.println(sv);
		}
	}
}
