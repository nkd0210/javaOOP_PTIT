import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;
		while(n-->0) {
			int x=0;
			for(int i=0;i<3;i++) {
				int k = sc.nextInt();
				if(k==1) x++;
			}
			if(x>=2) cnt++;
		}
		System.out.println(cnt);
	}	
}
