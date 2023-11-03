import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class SV {
	private String MSV, name, lop, email;
	
	public SV(String MSV, String name, String lop, String email) {
		this.MSV = MSV;
		this.name = name;
		this.lop = lop;
		this.email = email;
	}
	
	public String getMSV(){
		return MSV;
	}
	
	@Override
	public String toString() {
		return this.MSV+" "+this.name+" "+this.lop+" "+this.email;
	}
}




public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SV>list = new ArrayList<>();
		while(sc.hasNext()) {
			String MSV = sc.nextLine();
			String name = sc.nextLine();
			String lop = sc.nextLine();
			String email = sc.nextLine();
			SV sv = new SV(MSV, name, lop, email);
			list.add(sv);
		}
		Collections.sort(list, new Comparator<SV>() {
			@Override
			public int compare(SV a, SV b) {
				if(a.getMSV().compareTo(b.getMSV()) >0) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		for(SV x:list) {
			System.out.println(x);
		}
	}
}
