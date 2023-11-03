import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			double n = sc.nextDouble();
			double h = sc.nextDouble();
			for(int i=1;i<n;i++) {
				double k = Math.sqrt(i/n)*h;
				System.out.printf("%.6f " , k);
			}
			System.out.println();
		}
	}
}
