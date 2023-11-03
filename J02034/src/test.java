import java.util.HashSet;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [1000];
		HashSet<Integer>se = new HashSet<>();
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			se.add(a[i]);
		}
		int cnt=0;
		int max = a[n-1];
		Boolean flag = false;
		for(int i=1;i<=max;i++) {
			if(se.contains(i)) {
				cnt++;
			}
			else {
				System.out.println(i);
				flag = true;
			}
		}
		if(flag == false) {
			if(cnt==n){
				System.out.println("Excellent!");
			}
		}
	}
}
