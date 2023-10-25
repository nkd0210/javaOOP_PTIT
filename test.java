import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long T = sc.nextLong();
		while(T-- > 0) {
			long n = sc.nextLong();
			long sum = (n*(n+1) / 2);
			System.out.println(sum);
		}
	}
}
