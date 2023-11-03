import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NV {
	private String MNV,name,gender,date,address,tax,contract;
	private static int id=1;
	
	
	public NV(String name, String gender,String date,String address, String tax, String contract) {
		this.MNV = String.format("%05d", id++);
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.address = address;
		this.tax = tax;
		this.contract = contract;
	}
	
	public String getDate() {
		return date;
	}
	@Override
	public String toString() {
		return this.MNV+" "+this.name+" "+this.gender+" "+this.date+" "+this.address+" "+this.tax+" "+this.contract;
	}
}



public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<NV>list = new ArrayList<>();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String name = sc.nextLine();
			String gender = sc.nextLine();
			String date = sc.nextLine();
			String address = sc.nextLine();
			String tax = sc.nextLine();
			String contract = sc.nextLine();
			NV nv = new NV(name,gender,date,address,tax,contract);
			list.add(nv);
		}
		Collections.sort(list, new Comparator<NV>() {
			@Override
			public int compare(NV a, NV b) {
				String cmp1 = a.getDate().substring(6) + a.getDate().substring(3,5) + a.getDate().substring(0,2);
				String cmp2 = b.getDate().substring(6) + b.getDate().substring(3,5) + b.getDate().substring(0,2);
				if(cmp1.compareTo(cmp2) >0) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		for(NV x:list) {
			System.out.println(x);
		}
	}
}
