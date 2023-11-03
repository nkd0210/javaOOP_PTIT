import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int [1000];
			int cnt=0;
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(a[i] + a[j] == k) {
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
