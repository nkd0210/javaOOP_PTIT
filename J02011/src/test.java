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
			int minPos = i;
			for(int j=i+1;j<n;j++) {
				if(a[j] < a[minPos]) {
					minPos = j;
				}
			}
			int tmp = a[i];
				a[i] = a[minPos];
				a[minPos] = tmp;
			System.out.printf("Buoc %d: ",i+1);
			for(int k=0;k<n;k++) {
				System.out.printf(a[k] + " ");
			}
			System.out.println();
		}
	}
}
