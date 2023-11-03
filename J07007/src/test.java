import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


class WordSet {
	Set<String>se;
	
	public WordSet(String fileName) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("VANBAN.in"));
		se = new TreeSet<>();
		while(sc.hasNext()) {
			se.add(sc.next().toLowerCase());
		}
	}
	
	public String toString() {
		String s = "";
		for(String i:se) {
			s+=i+ "\n";
		}
		return s;
	}
}

public class test {
	public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
