import java.util.Scanner;

class Point{
	
	double x;
	double y;
	
	void input(Scanner sc) {
		this.x = sc.nextDouble();
		this.y = sc.nextDouble();
	}
	
	double distance(Point p) {
		double x0 = this.x - p.x;
		double y0 = this.y - p.y;
		return Math.sqrt(x0*x0 + y0*y0);
	}
} 
	
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			Point A = new Point();
			Point B = new Point();
			
			A.input(sc);
			B.input(sc);
			System.out.printf("%.4f\n",A.distance(B));
		}
	}
}
