import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


class SV {
	private String MSV, name, lop,email;
	
	public SV(String MSV, String name, String lop, String email) {
		this.MSV = MSV;
		this.name = name;
		this.lop = lop;
		this.email = email;
	}
	
	public String getMSV() {
		return MSV;
	}
	
	public String getLop() {
		return lop;
	}
	
	@Override
	public String toString() {
		return this.MSV+" "+this.name+" "+this.lop+" "+this.email;
	}
}



public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<SV>list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			String MSV = sc.nextLine();
			String name = sc.nextLine();
			String lop = sc.nextLine();
			String email = sc.nextLine();
			SV sv = new SV(MSV, name, lop, email);
			list.add(sv);
		}
	
		int q = sc.nextInt();
		while(q-->0) {
			String yearToFind = sc.next();
			System.out.println("DANH SACH SINH VIEN KHOA "+ yearToFind + ": ");
			for(SV x:list) {
				if(x.getLop().substring(1,3).equals(yearToFind.substring(2,4))) {
					System.out.println(x);					
				}
			}
		}
	}
}
