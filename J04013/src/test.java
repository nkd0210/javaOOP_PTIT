import java.util.Scanner;

class tuyenSinh {
	String MSV,name;
	double toan,ly,hoa;
	double tong1,tong2;
	String trangThai;
	double diemUuTien;
	
	void input(Scanner sc) {
		
		MSV = sc.nextLine();
		name = sc.nextLine();
		toan = sc.nextDouble();
		ly = sc.nextDouble();
		hoa = sc.nextDouble();
		sc.nextLine();
		tong1 = toan*2 + ly + hoa;
		if(MSV.substring(0,2).equals("KV")) {
			if(MSV.charAt(2)=='1') {
				diemUuTien = 0.5;
			}
			else if(MSV.charAt(2)=='2') {
				diemUuTien = 1;
			}
			else if(MSV.charAt(2)=='3') {
				diemUuTien = 2.5;
			}
		}
		tong2 = toan*2 + ly + hoa + diemUuTien;
		if(tong2 >= 24) {
			trangThai = "TRUNG TUYEN";
		}else {
			trangThai = "TRUOT";
		}
		int tmp = (int)tong1;
		if(tong1 - tmp == 0) {
			if(diemUuTien == 1.0) {
				diemUuTien = (int)diemUuTien;
				tong1 = (int)tong1;
			}else {
				tong1 = (int)tong1;
			}
		}else {
			if(diemUuTien == 1.0) {
				diemUuTien = (int)diemUuTien;
			}
		}
	}
	
	void output() {
		System.out.printf("%s %s %f %f %s\n", MSV, name, diemUuTien, tong1, trangThai);
	}
}


public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		tuyenSinh A = new tuyenSinh();
		A.input(sc);
		A.output();
				
	} 
}
