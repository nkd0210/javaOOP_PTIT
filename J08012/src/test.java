import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		for(int i=1;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[x]++;
			a[y]++;
		}
//		for(int i=1;i<=n;i++) {
//			if(a[i]!=1 && a[i]!=n-1) {
//				System.out.println("NO");
//			}
//		}
//		System.out.println("YES");
		boolean flag = false;
		for(int i=1;i<=n;i++) {
			if(a[i]==n-1) {
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}
