import java.util.Scanner;

class Point{
	double x,y;
	void input(Scanner sc) {
		x = sc.nextDouble();
		y = sc.nextDouble();
	}
	double distance(Point B) {
		double x0 = Math.pow((this.x-B.x), 2);
		double y0 = Math.pow((this.y-B.y), 2);
		return Math.sqrt(x0+y0);
	}
}

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			Point A = new Point();
			Point B = new Point();
			Point C = new Point();
			A.input(sc);
			B.input(sc);
			C.input(sc);
			double a = A.distance(B);
			double b = B.distance(C);
			double c = C.distance(A);
			if(a+b<=c || a+c<=b || b+c<=a) {
				System.out.println("INVALID");
			}
			else {
				double s = 0.25*Math.sqrt((a+b+c)*(a+b-c)*(-a+b+c)*(a-b+c));
				System.out.printf("%.2f\n",s);
			}
		}
	}
}
