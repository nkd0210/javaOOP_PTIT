import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.Vector;

class Monhoc{
	String maMon;
	String tenMon;
	int soTinChi;
	
	void input(Scanner sc) {
		
		maMon = sc.nextLine();
		tenMon = sc.nextLine();
		soTinChi = sc.nextInt();
	}
	
	void output() {
		System.out.printf("%s %s %d\n", maMon, tenMon, soTinChi);
	}
}

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		int T = sc.nextInt();
		Vector<Monhoc>v = new Vector<>();
		for(int i=0;i<T;i++) {
			sc.nextLine();
			Monhoc x = new Monhoc();
			x.input(sc);
			v.add(x);
		}
		
		Collections.sort(v, new Comparator<Monhoc>() {
			@Override
			public int compare(Monhoc a, Monhoc b) {
				if(a.tenMon.compareTo(b.tenMon) >0) {
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
