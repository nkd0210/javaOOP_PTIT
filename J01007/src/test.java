import java.util.*;


public class test {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0) {
			long n = sc.nextLong();
			long a[] = new long[100];
			a[0] = 0;
			a[1] = 1;
			a[2] = 1;
			boolean flag = false;
			for(int i=3;i<100;i++) {
				a[i] = a[i-1] + a[i-2];
			}
			for(int i=0;i<100;i++) {
				if(a[i] == n) {
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
}
