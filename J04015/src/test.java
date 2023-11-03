import java.util.Scanner;

class Teacher {
	String maNgach;
	String name;
	int bacLuong;
	int luongCoBan;
	int phuCap;
	int thuNhap;
	
	void input(Scanner sc) {
		maNgach = sc.nextLine();
		name = sc.nextLine();
		luongCoBan = sc.nextInt();
		bacLuong = (maNgach.charAt(2)-'0')*10 + maNgach.charAt(3)-'0';
		if(maNgach.substring(0,2).compareTo("HT")==0) {
			phuCap = 2000000;
		}else if(maNgach.substring(0,2).compareTo("HP")==0) {
			phuCap = 900000;
		}else if(maNgach.substring(0,2).compareTo("GV")==0) {
			phuCap = 500000;
		}
		thuNhap = luongCoBan*bacLuong + phuCap;
		
	}
	
	void output() {
		System.out.printf("%s %s %d %d %d", maNgach, name, bacLuong, phuCap, thuNhap );
	}
	
}

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Teacher A = new Teacher();
		A.input(sc);
		A.output();
	}
}
