import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		HashMap<Integer, Integer> mp = new HashMap<>();
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			if(mp.containsKey(n) == true) {
				mp.put(n, mp.get(n)+1);
			}else {
				mp.put(n,1);
			}
		}
		for(int i: mp.keySet()) {
			System.out.printf("%d %d\n", i, mp.get(i));
		}
	}
}
