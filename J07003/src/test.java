import java.math.BigInteger;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		BigInteger n= sc.nextBigInteger();
		while(true) {
			String s = n.toString();
			if(s.length()==1) {
				break;
			}
			String a = s.substring(0,s.length()/2);
			String b = s.substring(s.length()/2);
			
			BigInteger n1 = new BigInteger(a);
			BigInteger n2 = new BigInteger(b);
			n = n1.add(n2);
			System.out.println(n);
		}
	}
}
