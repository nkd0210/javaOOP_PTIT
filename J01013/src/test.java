import java.util.Scanner;

public class test {
	
	private static int[]a = new int[2000001];
	
	public static void sieve() {
		for(int i=0;i<=2000000;i++) {
			a[i] = i;
		}
		for(int i=2;i<=Math.sqrt(2000000);i++) {
			if(a[i]==i) {
				for(int j=i*i;j<=2000000;j+=i) {
					a[j] = i;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sieve();
		int T = sc.nextInt();
		long sum = 0L;
		while(T-->0) {
			int n = sc.nextInt();
			while(n!=1) {
//				System.out.println(n);
//				System.out.println(a[n]);
				sum+=a[n];
				n/=a[n];
			}
		}
		System.out.println(sum);
	}
}
