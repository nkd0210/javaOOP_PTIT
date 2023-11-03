import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		
		int a1 = Math.min(x1,x3);
		int a2 = Math.min(y1, y3);
		int a3 = Math.max(x2, x4);
		int a4 = Math.max(y2, y4);
		
		int ans = Math.max((a3-a1), (a4-a2));
		System.out.println(ans*ans);
	}
}
