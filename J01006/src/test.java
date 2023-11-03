import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a[] =  new long[100];
		a[0] = 0;
		a[1] = 1;
		a[2] = 1;
		for(int i = 3; i < 100; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		int T = sc.nextInt();
		while(T-- >0) {
			int n = sc.nextInt();
			System.out.println(a[n]);
		}
		
	}
}
