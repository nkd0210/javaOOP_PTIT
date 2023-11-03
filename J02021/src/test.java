import java.util.Scanner;

public class test {

	private static int n,k,cnt=0;
	private static int a[] = new int[20];
	
	
	public static void inkq() {
		for(int i=1;i<=k;i++) {
			System.out.printf(a[i]+"");
		}
	}
	
	public static void Try(int i) {
		for(int j=a[i-1]+1;j<=n-k+i;j++) {
			a[i] = j;
			if(i==k) {
				inkq();
				cnt++;
				System.out.printf(" ");
			}else {
				Try(i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		Try(1);
		System.out.println();
		System.out.println("Tong cong co " + cnt + " to hop");
	}
}

