import java.util.Scanner;

class Employee {
	String name,gender,date,address,tax,dateContract;
	 void input(Scanner sc) {
		 this.name = sc.nextLine();
		 this.gender = sc.nextLine();
		 this.date = sc.nextLine();
		 this.address = sc.nextLine();
		 this.tax = sc.nextLine();
		 this.dateContract = sc.nextLine();
	 }
	 
	 void output() {
		 System.out.printf("00001 %s %s %s %s %s %s",name,gender,date,address,tax,dateContract);
	 }
}

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee A = new Employee();
		A.input(sc);
		A.output();
	}
}
