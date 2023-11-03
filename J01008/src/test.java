import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int z=1;z<=T;z++){
			int n=sc.nextInt();
			System.out.printf("Test %d: ", z);
			for(int i=2;i*i<=n;i++) {
				int cnt=0;
				while(n%i==0) {
					cnt++;
					n/=i;
				}
				if(cnt > 0) {
					System.out.printf("%d(%d) ", i, cnt);
				}
			}
			if(n>1) {
				System.out.printf("%d(1) ", n);
			}
			System.out.println();
		}
	}
}
