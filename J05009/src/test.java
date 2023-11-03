import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;



class TS {
	private static int id=1;
	private String MSV,name,date;
	float d1,d2,d3,tong;
	
	public TS (String name, String date, float d1, float d2, float d3) {
		this.MSV = Integer.toString(id++);
		this.name = name;
		this.date = date;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.tong = d1 + d2 + d3;
	}
	
	
	@Override
	public String toString() {
		return this.MSV+" "+this.name+" "+this.date+" "+String.format("%.1f", this.tong);
	}
}


public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<TS>list = new ArrayList<>();
		float MAX=0;
		for(int i=0;i<n;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			String date = sc.nextLine();
			float d1 = sc.nextFloat();
			float d2 = sc.nextFloat();
			float d3 = sc.nextFloat();
			TS ts = new TS(name,date,d1,d2,d3);
			MAX = Math.max(MAX, ts.tong);
			list.add(ts);
		}
		for(TS x:list) {
			if(x.tong == MAX) {
				System.out.println(x);
			}
		}
		
	}
}
