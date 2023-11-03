
import java.util.Scanner;

public class test {
	
	public static Boolean check(String s) {
		int n=s.length();
		for(int i=1;i<n;i++) {
			if(Math.abs(s.charAt(i) - s.charAt(i-1)) != 1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			long n = sc.nextLong();
			if(check(Long.toString(n))== true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
