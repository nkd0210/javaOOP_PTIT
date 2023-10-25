import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float x = -b/a;
		
		if(a==0) {
			if(b==0) {
				System.out.println("VSN");
			}else if(b!=0) {
				System.out.println("VN");
			}
		}else {
			System.out.printf("%.2f", x);
		}
	}
}
