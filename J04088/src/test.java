import java.util.Scanner;
import java.lang.Math;
class Point{
	double x,y;
	
	void input(Scanner sc) {
		this.x = sc.nextDouble();
		this.y = sc.nextDouble();
	}
	
	double distance(Point B) {
		double x0 = this.x - B.x;
		double y0 = this.y - B.y;
		return Math.sqrt(x0*x0 + y0*y0);
	}
	
	double checkTriangle(Point A, Point B) {
		double a = this.distance(A);
		double b = this.distance(B);
		double c = A.distance(B);
		if(a+b>c && a+c>b && b+c>a) {
			return a+b+c;
		}
		return -1;
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
			double k = A.checkTriangle(B,C);
			if(k==-1) {
				System.out.println("INVALID");
			}else {
				System.out.printf("%.3f\n",k);
			}
		}
	}
}
