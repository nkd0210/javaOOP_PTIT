import java.util.Scanner;

public class test {
	
	public static boolean ktraSNT(int n) {
		if(n<2) {
			return false;
		}else {
			for(int i=2;i <= Math.sqrt(n); i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0) {
			int n = sc.nextInt();
			if(ktraSNT(n)==true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
