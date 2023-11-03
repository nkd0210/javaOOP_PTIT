import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			Boolean flag = true;
			for(int i=0;i<n/2;i++) {
				if(a[i] != a[n-i-1]) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
