import java.util.Scanner;

public class test {
	
	public static Boolean check1(String s) {
		for(int i=0;i<s.length();i++) {
			long tmp = (long)s.charAt(i);
			if(tmp %2 != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static Boolean check2(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			String n = sc.next();
			if(check1(n)==true && check2(n)==true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
//			System.out.println(check1(n));
		}
	}
}
