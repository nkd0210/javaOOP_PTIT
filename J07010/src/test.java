import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class SinhVien {
	static int id=1;
	String MSV, name,lop,date;
	float gpa;
	
	void input(Scanner sc) {
		if (id < 10)
            MSV = "B20DCCN00";
        else if (id < 100)
        	MSV = "B20DCCN0";
        else
        	MSV = "B20DCCN";
		MSV += Integer.toString(id++);
		sc.nextLine();
		name = sc.nextLine();
		lop = sc.nextLine();
		date = sc.nextLine();
		if(date.charAt(1)=='/') {
			date = '0' + date;
		}
		if(date.charAt(4)=='/') {
			date = date.substring(0,3) + '0' + date.substring(3);
		}
		gpa = sc.nextFloat();
	}
	
	void output() {
		System.out.printf("%s %s %s %s %.2f\n", MSV, name, lop, date, gpa);
	}
}

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SV.in"));
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			SinhVien a = new SinhVien();
			a.input(sc);
			a.output();			
		}
	}
}
