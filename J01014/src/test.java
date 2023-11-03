import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			long n = sc.nextLong();
			long ans=0L;
			for(long i=2L;i*i<=n;i++) {
				if(n%i==0) {
					ans = i;
					while(n%i==0) {
						n/=i;
					}
				}
			}
			if(n>1) {
				ans = n;
			}
			System.out.println(ans);
		}
	}
}
