import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int n = sc.nextInt();
			int a[] = new int [100001];
			int sum=0, pos=-1,x=0;
			for(int i=1;i<=n;i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			for(int i=1;i<=n;i++) {
				if(x*2+a[i] == sum) {
					pos = i;
					break;
				}
				x += a[i];
			}
			System.out.println(pos);
		}
	}
}
