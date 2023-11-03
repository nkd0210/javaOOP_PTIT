import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;
import java.util.Comparator;
import java.util.Collections;

class monThi {
	String maMon,tenMon,hinhThucThi;
	void input(Scanner sc) {
		maMon = sc.nextLine();
		tenMon = sc.nextLine();
		hinhThucThi = sc.nextLine();
	}
	void output() {
		System.out.printf("%s %s %s\n", maMon, tenMon, hinhThucThi);
	}
}

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		int T = sc.nextInt();
		sc.nextLine();
		Vector<monThi> v = new Vector<>();
		for(int i=0;i<T;i++) {
			monThi x = new monThi();
			x.input(sc);
			v.add(x);
		}
		Collections.sort(v, new Comparator<monThi>() {
			@Override
			public int compare(monThi a, monThi b) {
				if(a.maMon.compareTo(b.maMon)>0) {
					return 1;
				}
					return -1;
			}
		});
		for(int i=0;i<T;i++) {
			v.get(i).output();
		}

	}
}
