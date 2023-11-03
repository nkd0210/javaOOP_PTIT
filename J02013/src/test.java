import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [1001];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			Boolean ok = false;
			for(int j=0;j<n-i-1;j++) {
				if(a[j] > a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					ok = true;
				}
			}
			if(ok==true) {
				System.out.printf("Buoc %d: ",i+1);
				for(int k=0;k<n;k++) {
					System.out.printf(a[k] + " ");
				}
				System.out.println();
			}
		}
	}
}
