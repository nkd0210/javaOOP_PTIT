import java.util.Scanner;
import java.util.*;
import java.lang.*;

class PhanSo{
	private long tuSo;
	private long mauSo;
	
	void input(Scanner sc) {
		tuSo = sc.nextLong();
		mauSo = sc.nextLong();
	}
	
	long gcd(long a, long b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	
	void ans() {
		long div = this.gcd(this.tuSo,this.mauSo);
		System.out.printf("%d/%d",this.tuSo/div, this.mauSo/div);
	}
}

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo A = new PhanSo();
		A.input(sc);
		A.ans();
	}
}
