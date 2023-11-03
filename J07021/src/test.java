import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		while(true) {
			String s = sc.nextLine();
			if(s.compareTo("END")==0 ) {
				break;
			}
			s = s.toLowerCase() +" ";
			Vector<String>v = new Vector<String>();
			String tmp="";
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==' ') {
					if(tmp!="") {
						v.add(tmp);
						tmp = "";
					}
				}else {
					tmp+=s.charAt(i);
				}
			}
			for(int i=0;i<v.size();i++) {
				String x = v.get(i);
				x = x.substring(0,1).toUpperCase() + x.substring(1);
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}
