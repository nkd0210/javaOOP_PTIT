import java.util.*;
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum=1;
		long tmp=1;
		for(int i=2;i<=n;i++) {
			tmp = tmp*i;
			sum = sum + tmp;
		}
		System.out.println(sum);
	}
}
