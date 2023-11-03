import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		while(true) {
			int n = s.length();
			Boolean flag = true;
			for(int i=1;i<n;i++) {
				if(s.charAt(i)==s.charAt(i-1)) {
					flag = false;
					s = s.substring(0,i-1) + s.substring(i+1);
					break;
				}
			}
			if(flag==true) {
				break;
			}
		}
		if(s.length()==0) {
			System.out.println("Empty String");
		}else {
			System.out.println(s);
		}
	}
}
