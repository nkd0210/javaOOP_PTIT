import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class BD {
	private String MSV, name, lop;
	private double d1,d2,d3;
	
	public BD(String MSV, String name, String lop, double d1, double d2, double d3) {
		this.MSV = MSV;
		this.name = name;
		this.lop = lop;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	
	public String getMSV() {
		return MSV;
	}
	
	@Override
	public String toString() {
		return this.MSV +" "+this.name+" "+this.lop+" "+this.d1+" "+this.d2+" "+this.d3;
	}
}



public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<BD>list = new ArrayList<>();
		while(n-->0) {
			sc.nextLine();
			String MSV = sc.nextLine();
			String name = sc.nextLine();
			String lop = sc.nextLine();
			double d1 = sc.nextDouble();
			double d2 = sc.nextDouble();
			double d3 = sc.nextDouble();
			BD bd = new BD(MSV, name, lop, d1, d2 , d3);
			list.add(bd);
		}
		Collections.sort(list, new Comparator<BD>() {
			@Override
			public int compare (BD a, BD b) {
				return a.getMSV().compareTo(b.getMSV());
			}
		});
		for(int i = 0; i < n; i++){
            System.out.print(i + 1 + " ");
            System.out.println(list.get(i));
        }
	}
}
