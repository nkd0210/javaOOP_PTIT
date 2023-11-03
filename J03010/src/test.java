import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		sc.nextLine();
		while(T-->0) {
			String s = sc.nextLine();
			s = s.toLowerCase() +" ";
			int n = s.length();
			Vector<String>v = new Vector<>();
			String tmp = "";
			for(int i=0;i<n;i++) {
				if(s.charAt(i) == ' ') {
					if(tmp!="") {
						v.add(tmp);
						tmp="";
					}
				}else {
					tmp+=s.charAt(i);
				}
			}
			s = v.get(v.size()-1);
			for(int i=0;i<v.size()-1;i++) {
				s += v.get(i).substring(0,1);
			}
			if(map.containsKey(s)) {
				int cnt = map.get(s);
				++cnt;
				System.out.println(s+cnt+"@ptit.edu.vn");
				map.put(s, cnt);
			}else {
				System.out.println(s+"@ptit.edu.vn");
				map.put(s, 1);
				
			}
		}
	}
}
