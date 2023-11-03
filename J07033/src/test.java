import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;

class Student {
	String MSV,name,lop,email;
	
	void input(Scanner sc) {
		MSV = sc.nextLine();
		name = convert(sc.nextLine());
		lop = sc.nextLine();
		email = sc.nextLine();
	}
	
	String convert(String s) {
		Vector<String>v = new Vector<String>();
		String x = "";
		s = s.toLowerCase()+ " ";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)== ' ') {
				v.add(x);
				x="";					
			}else {
				x+=s.charAt(i);
			}
		}
		x = "";
		for(int i=0;i<v.size();i++) {
			String k = v.get(i);
			if(!k.isEmpty()) {
				x += k.substring(0,1).toUpperCase() + k.substring(1) + " ";
			}
		}
		return x.substring(0,x.length()-1);
	}
	
	void output() {
		System.out.printf("%s %s %s %s\n", MSV, name, lop, email );
	}
}

public class test {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		int T = sc.nextInt();
		Vector<Student>v = new Vector<>();
		sc.nextLine();
		for(int i=0;i<T;i++) {
			Student x = new Student();
			x.input(sc);
			v.add(x);
		}
		
		Collections.sort(v, new Comparator<Student>(){
			@Override
			public int compare(Student A, Student B) {
				if(A.MSV.compareTo(B.MSV) > 0) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		for(int i=0;i<T;i++) {
			v.get(i).output();
		}
		
	}
}
