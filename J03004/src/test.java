import java.util.Scanner;
import java.util.Vector;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0) {
			String s = sc.nextLine();
			s= s.toLowerCase() +" ";
			String tmp = "";
			Vector<String>v = new Vector<>();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) == ' ') {
					if(tmp!="") {
						v.add(tmp);
						tmp="";
					}
				} else {
					tmp+=s.charAt(i);
				}
			}
			for(String k:v) {
				System.out.print(k.substring(0,1).toUpperCase()+k.substring(1) +" ");
			}
			System.out.println();
		}
	}
}
