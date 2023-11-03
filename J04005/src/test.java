import java.util.Scanner;

class Student {
	String name,date;
	float diem1,diem2,diem3,sumPoint;
	
	void input(Scanner sc) {
		this.name = sc.nextLine();
		this.date = sc.next();
		this.diem1 = sc.nextFloat();
		this.diem2 = sc.nextFloat();
		this.diem3 = sc.nextFloat();
		sumPoint = diem1+diem2+diem3;
	}
	
	void output() {
		System.out.printf("%s %s %.1f",this.name,this.date,this.sumPoint);
	}

}

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student A = new Student();
		A.input(sc);
		A.output();
	}
}
