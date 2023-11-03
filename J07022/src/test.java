import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		Vector <String>v = new Vector<>();
		while(sc.hasNext()) {
			String s = sc.next();
			try {
				Integer.parseInt(s);
			}catch ( Exception x) {
				v.add(s);
			}
		}
		Collections.sort(v);
		for(String i:v) {
			System.out.print(i+" ");
		}
	}
}
