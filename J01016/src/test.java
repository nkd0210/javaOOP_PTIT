import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		long cnt=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='4' || s.charAt(i)=='7') {
				cnt++;
			}
		}
		if((cnt==4) || (cnt==7)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
