import java.util.Scanner;

class Point {
	double x,y;
	
	void input(Scanner sc) {
		x = sc.nextDouble();
		y = sc.nextDouble();
	}
	
	double distance( Point B) {
		double x0 = (this.x - B.x) * (this.x - B.x);
		double y0 = (this.y - B.y) * (this.y - B.y);
		return Math.sqrt(x0+y0);
	}
	
}


public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			Point A = new Point();
			A.input(sc);
			Point B = new Point();
			B.input(sc);
			Point C = new Point();
			C.input(sc);
			double a = A.distance(B);
			double b = B.distance(C);
			double c = C.distance(A);
			if(a+b<=c || b+c<=a || a+c<=b) {
				System.out.println("INVALID\n");
			}else {
				double S = (Math.sqrt((a+b+c)*(a+b-c)*(-a+b+c)*(a-b+c)))/4; 				
				double R = (a*b*c)/(4*S);
				double ans = Math.PI * Math.pow(R, 2);
				System.out.printf("%.3f\n", ans);
			}
		}
	}
}
