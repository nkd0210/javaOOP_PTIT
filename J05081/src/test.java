import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

class matHang {
	static int id=1;
	String maMatHang;
	String tenMatHang;
	String donViTinh;
	int giaMua;
	int giaBan;
	int loiNhuan;
	
	void input(Scanner sc) {
		if(id<10) {
			maMatHang = "MH00";
		}else if(id<100) {
			maMatHang = "MH0";
		}else {
			maMatHang = "MH";
		}
		maMatHang += Integer.toString(id++);
		sc.nextLine();
		tenMatHang = sc.nextLine();
		donViTinh = sc.nextLine();
		giaMua = sc.nextInt();
		giaBan = sc.nextInt();
		loiNhuan = giaBan - giaMua;
	}
	
	void output() {
		System.out.printf("%s %s %s %d %d %d\n", maMatHang, tenMatHang, donViTinh, giaMua, giaBan, loiNhuan);
	}
}
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Vector<matHang>v = new Vector<>();
		for(int i=0;i<T;i++) {
			matHang x = new matHang();
			x.input(sc);
			v.add(x);
		}
		Collections.sort(v, new Comparator<matHang>(){
			@Override
			public int compare(matHang a, matHang b) {
				if(a.loiNhuan == b.loiNhuan) {
					if(a.maMatHang.compareTo(b.maMatHang) >0) {
						return 1;
					}else {
						return -1;
					}
				}else if(a.loiNhuan > b.loiNhuan) {
					return -1;
				}else {
					return 1;
				}
			}
		});
		for(int i=0; i<T;i++) {
			v.get(i).output();
		}
	}
}
