import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			String s1 = sc.next();
			String s2 = sc.next();
			int n1 = s1.length();
			int n2 = s2.length();
			if(s1.equals(s2)) {
				System.out.println("-1");
			}else {
				if(n1 < n2) {
					int c = n1;
					n1 = n2;
					n2 = c;
				}
				System.out.println(n1);
			}
		}
	}
}
