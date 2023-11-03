import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int n = sc.nextInt();
			int k = (int)Math.sqrt(n);
			if(k*k==n) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
