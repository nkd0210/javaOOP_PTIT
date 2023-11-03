import java.math.BigInteger;
import java.util.Scanner;

public class test {
	
	public static Long GCD(long a, long b) {
		BigInteger m = BigInteger.valueOf(a);
		BigInteger n = BigInteger.valueOf(b);
		BigInteger gcd = m.gcd(n);
		return gcd.longValue();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			Long n = sc.nextLong();
			Long s = 1L;
			for(Long i=1L;i<=n;i++) {
				s = i*s/GCD(i,s);
			}
			System.out.println(s);
		}
	}
}
