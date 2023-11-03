import java.util.Scanner;
import java.util.Vector;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0) {
			String s = sc.nextLine();
			s = s.toLowerCase() +" ";
			String tmp = "";
			Vector<String>v = new Vector<>();			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) == ' ') {
					if(tmp!="") {
						v.add(tmp);
						tmp="";
					}
				}else {
					tmp+=s.charAt(i);
				}
			}
			
			for(int i=1;i<v.size();i++) {
				String m = v.get(i);
				if(i==v.size()-1) {
					System.out.print(m.substring(0,1).toUpperCase()+m.substring(1).toLowerCase() +", ");
				}else {
					System.out.print(m.substring(0,1).toUpperCase()+m.substring(1).toLowerCase() +" ");
				}
			}
			System.out.print(v.get(0).toUpperCase());
			System.out.println();
		}
	}
}
