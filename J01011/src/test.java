import java.util.Scanner;

public class test {
	
	public static long GCD(long a, long b) {
		if(b==0) {
			return a;
		}
		return GCD(b,a%b);
	}
	
	public static long LCM(long a, long b) {
		return (a*b)/GCD(a,b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long T = sc.nextLong();
		while(T-->0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			System.out.println(LCM(a,b) + " " + GCD(a,b));
		}
	}
}
