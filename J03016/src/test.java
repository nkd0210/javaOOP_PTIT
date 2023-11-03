import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			String s = sc.next();
			int cntOdd = 0;
			int cntEven = 0;
			for(int i=0;i<s.length();i++) {
				if(i%2==0) {
					cntEven+=s.charAt(i)-'0';
				}
				if(i%2!=0) {
					cntOdd+=s.charAt(i)-'0'; 
				}
			}
			if((cntEven-cntOdd)%11==0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
