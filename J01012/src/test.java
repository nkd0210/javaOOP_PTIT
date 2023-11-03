import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0) {
			long cnt = 0;
			long n = sc.nextLong();
			for(long i=1;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					if(i%2==0) {
						cnt++;
					} 
					if ((n/i)%2 == 0) {
						cnt++;
					}
					if (i*i==n && i%2==0) {
						cnt--;
					}
				}
				
			}
			System.out.println(cnt);
		}
	}
}
