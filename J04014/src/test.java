import java.util.Scanner;


class PhanSo {
	long tuso, mauso;
	
	void input(Scanner sc) {
		tuso = sc.nextLong();
		mauso = sc.nextLong();
	}
	
	long gcd(long a, long b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	
	void rutgon() {
		long uoc = gcd(tuso, mauso);
		tuso /= uoc;
		mauso /= uoc;
	}
	
	void output(PhanSo B) {
		PhanSo C = new PhanSo();
		PhanSo D = new PhanSo();
		
		C.tuso = tuso*B.mauso + B.tuso*mauso;
		C.mauso = mauso * B.mauso;
		C.rutgon();
		C.tuso *= C.tuso;
		C.mauso *= C.mauso;
		
		D.tuso = tuso * B.tuso * C.tuso;
		D.mauso = mauso * B.mauso * C.mauso;
		D.rutgon();
		
		System.out.printf("%d/%d ", C.tuso, C.mauso);
		System.out.printf("%d/%d\n", D.tuso, D.mauso);
	}
}

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			PhanSo A = new PhanSo();
			PhanSo B = new PhanSo();
			A.input(sc);
			B.input(sc);
			A.output(B);
		}
	}
}
