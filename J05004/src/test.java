import java.util.Scanner;
import java.util.Vector;

class SV {
	private String name,MSV,lop,date;
	private double gpa;
	private static int id=1;
	
	public SV(String name, String lop, String date, double gpa) {
		if(id<10) {
			this.MSV = "B20DCCN00";
			MSV+=Integer.toString(id++);
		}else if(id>=10 && id<=99) {
			this.MSV = "B20DCCN0";
			MSV+=Integer.toString(id++);
		}
		this.name = name;
		this.date = date;
		this.lop = lop;
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
	
//	Kết quả của .split("\\s+") là một mảng các chuỗi con, trong đó mỗi phần tử của mảng tương ứng với 
//	một "từ" trong chuỗi this.hoTen, sau khi loại bỏ các khoảng trắng ở đầu và cuối chuỗi và tách nó 
//	dựa trên khoảng trắng.
	
	public void chuanHoaTen() {
		String []arr = this.name.trim().split("\\s+");
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
		for(int i=1;i<=n;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			String lop  = sc.nextLine();
			String date = sc.nextLine();
			double gpa  = sc.nextDouble();
			SV sv = new SV(name,lop,date,gpa);
			sv.chuanHoaNgaySinh();
			sv.chuanHoaTen();
			System.out.println(sv);
		}
		
	}
}
