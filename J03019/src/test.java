import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int pos=0;
		int n = s.length();
		while(pos<n) {
			char tmp = s.charAt(pos);
			int last_pos = pos;
			for(int i=pos;i<n;i++) {
				if(s.charAt(i)>tmp) {
					tmp = s.charAt(i);
				}
			}
			for(int i=pos;i<n;i++) {
				if(s.charAt(i)==tmp) {
					System.out.print(s.charAt(i));
					last_pos = i;
				}
			}
			pos = last_pos + 1;
		}
	}
}
