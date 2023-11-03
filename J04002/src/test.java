import java.util.Scanner;

class Rectange {
	double width,height;
	String color;
	
	void input(Scanner sc) {
		this.width = sc.nextDouble();
		this.height = sc.nextDouble();
		this.color = sc.next();
		this.color = this.color.substring(0,1).toUpperCase() + this.color.substring(1).toLowerCase();
	}
	
	public String getColor() {
		return color;
	}
	
	double findArea() {
		return this.width*this.height;
	}
	
	double findPerimeter() {
		return (this.width + this.height)*2 ;
	}
	
	int check() {
		int w = (int)this.width;
		int h = (int)this.height;
		if(w<=0 || h<=0) {
			return 0;
		}
		return 1;
	}
}

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectange A = new Rectange();
		A.input(sc);
		if(A.check()==0) {
			System.out.println("INVALID");
		}else {
			String mau = A.getColor();
			
			System.out.println((int)A.findPerimeter()+ " " + (int)A.findArea() + " " + A.color);
		}
	}
}
