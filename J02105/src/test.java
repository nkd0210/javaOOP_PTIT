import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int [n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=1;i<=n;i++) {
			System.out.printf("List(%d) = ",i);
			for(int j=1;j<=n;j++) {
				if(a[i][j] == 1) {
					System.out.print(j +" ");
				}
			}
			System.out.println();
		}
	}
}
