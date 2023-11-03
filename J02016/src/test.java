import java.util.Arrays;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int n = sc.nextInt();
			long a[] = new long [n];
			int ok=0;
			for(int i=0;i<n;i++) {
				a[i] = sc.nextLong();
			}
			Arrays.sort(a);
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					long k = (long) Math.sqrt(a[i]*a[i] + a[j]*a[j]);
					if(k*k != (a[i]*a[i] + a[j]*a[j])) {
						break;
					}
					if(Arrays.binarySearch(a, k)>j ) {
						ok = 1;
						break;
					}
				}
			}
			if(ok==1) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
	}
}
