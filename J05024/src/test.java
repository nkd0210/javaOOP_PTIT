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
	
	public String nganhHoc(){
	    String tmp = this.MSV.substring(5, 7);
	    if(this.lop.charAt(0) != 'E' && tmp.equals("CN"))
	        return "CONG NGHE THONG TIN";
	    if(tmp.equals("KT"))
	        return "KE TOAN";
	    if(this.lop.charAt(0) != 'E' && tmp.equals("AT"))
	        return "AN TOAN THONG TIN";
	    if(tmp.equals("VT"))
	        return "VIEN THONG";
	    if(tmp.equals("DT"))
	        return "DIEN TU";
	     return "";
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
		sc.nextLine();
		while(q-->0) {
			String nganh = sc.nextLine().toUpperCase();
			System.out.println("DANH SACH SINH VIEN NGANH " + nganh +":");
			for(SV x:list) {
				if(x.nganhHoc().equals(nganh)) {
					System.out.println(x);
				}
			}
			
		}
	}
}
