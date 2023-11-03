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
		Collections.sort(list, new Comparator<GV>() {
			@Override
			public int compare(GV a, GV b) {
				String arr1[] = a.getName().split("\\s+");
				String arr2[] = b.getName().split("\\s+");
				int n1 = arr1.length;
				int n2 = arr2.length;
				if(arr1[n1-1].compareTo(arr2[n2-1])==0) {
					if(a.getMGV().compareTo(b.getMGV())>0) {
						return 1;
					}else {
						return -1;
					}
				}else {
					return arr1[n1-1].compareTo(arr2[n2-1]);
				}
			}
		});
		for(GV x: list) {
			System.out.println(x);
		}
	}
}
