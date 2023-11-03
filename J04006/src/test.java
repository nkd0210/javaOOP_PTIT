import java.util.Scanner;

class Student {
	String name,lop,date;
	float diem;
	
	void input(Scanner sc) {
		this.name = sc.nextLine();
		this.lop = sc.next();
		this.date = sc.next();
		if(date.charAt(1) == '/') {
			date = '0' + date;
		}
		if(date.charAt(4) == '/') {
			date = date.substring(0,3) + '0' + date.substring(3);
		}
		this.diem = sc.nextFloat();
	}
	
	void output() {
		System.out.printf("B20DCCN001 %s %s %s %.2f",this.name,this.lop,this.date,this.diem);
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
