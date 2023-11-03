import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;
public class test {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0) {
			String s = sc.nextLine();
			String tmp="";
			s+=" ";
			Vector<String>v = new Vector<>();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==' ') {
					v.add(tmp);
					tmp = "";
				}else {
					tmp+=s.charAt(i);
				}
			}
			for(String k:v) {
				for(int i=k.length()-1;i>=0;i--) {
					System.out.print(k.charAt(i));
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
