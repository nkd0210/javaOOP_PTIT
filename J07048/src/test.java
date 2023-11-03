import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.Vector;

class SanPham {
	String maSanPham, tenSanPham;
	int giaBan, baoHanh;
	
	void input(Scanner sc) {
		sc.nextLine();
		maSanPham = sc.nextLine();
		tenSanPham = sc.nextLine();
		giaBan = sc.nextInt();
		baoHanh = sc.nextInt();
	}
	
	void output() {
		System.out.printf("%s %s %d %d\n", maSanPham, tenSanPham, giaBan, baoHanh);
	}
}

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SANPHAM.in"));
		int T = sc.nextInt();
		Vector<SanPham>v = new Vector<>();
		for(int i=0;i<T;i++) {
			SanPham x = new SanPham();
			x.input(sc);
			v.add(x);
		}
		Collections.sort(v, new Comparator<SanPham>() {
			@Override 
			public int compare(SanPham a, SanPham b) {
				if(a.giaBan == b.giaBan) {
					if(a.maSanPham.compareTo(b.maSanPham) >0) {
						return 1;
					}else {
						return -1;
					}
				}else if(a.giaBan > b.giaBan) {
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
