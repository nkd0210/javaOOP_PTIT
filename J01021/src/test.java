import java.util.Scanner;

public class test {
	
	static Long mod = 1000000007L;
	
	public static Long pow(Long a, Long b) {
		if(b==0) {
			return 1L;
		}else {
			Long x = pow(a, b/2);
			x = (x*x)%mod;
			if(b%2==1) {
				return x*a;
			}else {
				return x;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			Long a = sc.nextLong();
			Long b = sc.nextLong();
			if(a==0 && b==0) {
				return;
			}else {
				System.out.println(pow(a,b));
			}
		}
	}
}
