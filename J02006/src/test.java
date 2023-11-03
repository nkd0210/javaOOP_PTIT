import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x;
		int a[] = new int [1001];
		int b[] = new int [1001];
		for(int i=0;i<n;i++) {
			x = sc.nextInt();
			a[x] = 1;
		}
		for(int i=0;i<m;i++) {
			x = sc.nextInt();
			b[x] = 1;
		}
		for(int i=0;i<1000;i++) {
			if(a[i]!=0 || b[i]!=0) {
				System.out.printf(i + " ");
			}
		}
	}
}
