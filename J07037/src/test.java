import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.Vector;

class DoanhNghiep {
	String maDoanhNghiep;
	String tenDoanhNghiep;
	int soSinhVien;
	
	void input(Scanner sc) {
		sc.nextLine();
		maDoanhNghiep = sc.nextLine();
		tenDoanhNghiep = sc.nextLine();
		soSinhVien = sc.nextInt();
	}
	
	void output() {
		System.out.printf("%s %s %d\n", maDoanhNghiep, tenDoanhNghiep, soSinhVien);
	}
}

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DN.in"));
		int T = sc.nextInt();
		Vector<DoanhNghiep>v = new Vector<>();
		for(int i=0;i<T;i++) {
			DoanhNghiep x = new DoanhNghiep();
			x.input(sc);
			v.add(x);
		}
		
		Collections.sort(v, new Comparator<DoanhNghiep>() {
			@Override
			public int compare(DoanhNghiep a, DoanhNghiep b) {
				if(a.maDoanhNghiep.compareTo(b.maDoanhNghiep) >0) {
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
