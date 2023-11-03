import java.util.Scanner;

public class test {
	
	public static Boolean checkSNT(long k) {
		if(k<2) return false;
		else {
			for(int i=2;i<=Math.sqrt(k);i++) {
				if(k%i==0) {
					return false;
				}
			}
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
			Boolean flag = true;
			for(int i=0;i<n.length();i++) {
				if(checkSNT(n.charAt(i)-'0')==false) {
					flag = false;
				}
			}
			
			if(checkSTN(n)==false) {
				flag = false;
			}

			if(flag==true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
