import java.util.Scanner;

public class test {
	
	public static Boolean check(String s) {
		int n = s.length();
		for(int i=0;i<n;i++) {
			if(s.charAt(i)!= '0' && s.charAt(i)!='1' && s.charAt(i)!='2') {
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
			if(check(Long.toString(n))==true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
