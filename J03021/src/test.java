import java.util.Scanner;

public class test {
	
	public static Boolean checkSTN(String s) {
		int n = s.length();
		for(int i=0;i<n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			String s = sc.next();
			s = s.toUpperCase();
			int n = s.length();
			String tmp = "";
			for(int i=0;i<n;i++) {
				if(s.charAt(i)=='A' || s.charAt(i)=='B' || s.charAt(i)=='C') {
					tmp += '2';
				}
				if(s.charAt(i)=='D' || s.charAt(i)=='E' || s.charAt(i)=='F') {
					tmp += '3';			
				}
				if(s.charAt(i)=='G' || s.charAt(i)=='H' || s.charAt(i)=='I') {
					tmp += '4';
				}
				if(s.charAt(i)=='J' || s.charAt(i)=='K' || s.charAt(i)=='L') {
					tmp += '5';
				}
				if(s.charAt(i)=='M' || s.charAt(i)=='N' || s.charAt(i)=='O') {
					tmp += '6';
				}
				if(s.charAt(i)=='P' || s.charAt(i)=='Q' || s.charAt(i)=='R' || s.charAt(i)=='S') {
					tmp += '7';
				}
				if(s.charAt(i)=='T' || s.charAt(i)=='U' || s.charAt(i)=='V') {
					tmp += '8';			
				}
				if(s.charAt(i)=='W' || s.charAt(i)=='X' || s.charAt(i)=='Y' || s.charAt(i)=='Z') {
					tmp += '9';
				}
			}
			if(checkSTN(tmp)==false) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
			
		}
	}
}
