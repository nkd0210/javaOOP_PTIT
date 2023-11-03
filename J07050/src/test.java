import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.Vector;

class MatHang {
	static int id=1;
	String maHang,tenHang,nhomHang;
	double giaMua,giaBan,loiNhuan;
	
	void input(Scanner sc) {
		if(id<10) {
			maHang = "MH0";
		}
		else {
			maHang = "MH";
		}
		sc.nextLine();
		maHang+=Integer.toString(id++);
		tenHang = sc.nextLine();
		nhomHang = sc.nextLine();
		giaMua = sc.nextDouble();
		giaBan = sc.nextDouble();
		loiNhuan = giaBan - giaMua;
	}
	
	void output() {
		System.out.printf("%s %s %s %.2f\n", maHang, tenHang, nhomHang, loiNhuan );
	}
}

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MATHANG.in"));
		int T = sc.nextInt();
		Vector<MatHang>v = new Vector<>();
		for(int i=0;i<T;i++) {
			MatHang x = new MatHang();
			x.input(sc);
			v.add(x);
		}
		Collections.sort(v, new Comparator<MatHang>() {
			@Override
			public int compare(MatHang a, MatHang b) {
				if(a.loiNhuan > b.loiNhuan) {
					return -1;
				}else {
					return 1;
				}
			}
		});
		for(int i=0;i<T;i++) {
			v.get(i).output();
		}
	}
}
