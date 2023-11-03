import java.math.BigInteger;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger c = a.divide(b);
			BigInteger d = b.divide(a);
			if(a.compareTo(b.multiply(c)) == 0 || b.compareTo(a.multiply(d)) == 0){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
