import java.util.Scanner;

public class test {
	
	public static Boolean check8(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(0)!='8' && s.charAt(s.length()-1)!='8') {
				return false;
			}
		}
		return true;
	}
	
	public static Boolean checkSum(String s) {
		long sum=0;
		for(int i=0;i<s.length();i++) {
			sum += s.charAt(i) -'0';
		}
		if(sum%10!=0) {
			return false;
		}
		return true;
	}
	
	public static Boolean checkSTN(String s) {
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
			if(check8(n)==true && checkSTN(n)==true && checkSum(n)==true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
//			System.out.println(checkSum(n));
		}
	}
}
