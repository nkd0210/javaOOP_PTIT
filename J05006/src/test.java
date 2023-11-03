import java.util.Scanner;

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
	
	@Override
	public String toString() {
		return this.MNV+" "+this.name+" "+this.gender+" "+this.date+" "+this.address+" "+this.tax+" "+this.contract;
	}
}


public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-->0) {
			String name = sc.nextLine();
			String gender = sc.nextLine();
			String date = sc.nextLine();
			String address = sc.nextLine();
			String tax = sc.nextLine();
			String contract = sc.nextLine();
			NV nv = new NV(name,gender,date,address,tax,contract);
			System.out.println(nv);
		}
		
	}
}
