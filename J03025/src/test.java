import java.util.Scanner;

public class test {
	public static Boolean check(String s) {
		int n = s.length();
		int cnt=0;
		for(int i=0;i<n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-i-1)) {
				cnt++;
			}
		}
		if((n%2==0 && cnt==1) || (n%2==1 && cnt<=1)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			String s = sc.next();
			if(check(s)==true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
