import java.util.Scanner;
import java.math.BigInteger;
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			System.out.println(a.gcd(b));			
		}
	}
}
