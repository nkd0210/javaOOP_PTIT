import java.util.Scanner;

public class test {
	
	public static Boolean test1(String s) {
		int m = s.length();
		long sum=0L;
		for(int i=0;i<m;i++) {
			sum+=s.charAt(i)-'0';
		}
		if(sum%10==0) {
			return true;
		}
		return false;
	}
	
	public static boolean test2(String s) {
		int m = s.length();
		for(int i=1;i<m;i++) {
			if(Math.abs(s.charAt(i) - s.charAt(i-1)) != 2) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			Long n = sc.nextLong();
			if(test1(Long.toString(n))==true && test2(Long.toString(n))==true ) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
