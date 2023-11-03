import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class GV{
	private static int id=1;
	private String MGV, name, mon;
	
	public GV(String name, String mon) {
		if(id<10) {
			MGV = "GV0";
		}
		else if(id>=10 && id<=99) {
			MGV = "GV";
		}
		MGV+=Integer.toString(id++);
		this.name = name;
		this.mon = "";
		String arr[] = mon.split("\\s+");
		for(String x:arr) {
			this.mon += x.toUpperCase().substring(0,1);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getMGV() {
		return MGV;
	}
	
	public String getMon() {
		return mon;
	}
	
	@Override
	public String toString() {
		return this.MGV+ " "+ this.name+" "+this.mon;
	}
}



public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<GV>list = new ArrayList<>();
		while(n-->0) {
			String name = sc.nextLine();
			String mon = sc.nextLine();
			GV gv = new GV(name,mon);
			list.add(gv);
		}
		int q=sc.nextInt();
		sc.nextLine();
		while(q-->0) {
			String timMon = sc.nextLine().toUpperCase();
			String arr3 [] = timMon.split("\\s+");
			String tmp = "";
			for(int i=0;i<arr3.length;i++) {
				tmp+=arr3[i].substring(0,1);
			}
			System.out.println("DANH SACH GIANG VIEN BO MON "+tmp+":");
			for(GV x: list) {
				if(x.getMon().equals(tmp)) {
					System.out.println(x);
				}
			}
		}
	}
}
