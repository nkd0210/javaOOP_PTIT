import java.util.Scanner;

class PhanSo{
	long tuSo,mauSo;
	
	void input(Scanner sc) {
		this.tuSo = sc.nextLong();
		this.mauSo = sc.nextLong();
	}
	
	void output() {
		System.out.printf("%d/%d",this.tuSo,this.mauSo);
	}
	
	long gcd(long a, long b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	
	PhanSo Add(PhanSo B) {
		PhanSo c = new PhanSo();
		c.mauSo = this.mauSo * B.mauSo;
		c.tuSo = this.tuSo*B.mauSo + this.mauSo*B.tuSo;
		long div = gcd(c.tuSo,c.mauSo);
		c.tuSo = c.tuSo / div;
		c.mauSo = c.mauSo / div;
		return c;
	}
}

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo A = new PhanSo();
		PhanSo B = new PhanSo();
		A.input(sc);
		B.input(sc);
		PhanSo C = A.Add(B);
		C.output();
	}
}
