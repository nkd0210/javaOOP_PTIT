import java.util.Scanner;

public class test {
	
	public static Long Convert(String s) {
		long ans = 0L;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1') {
				ans = ans*10+1;
			}
			else if(s.charAt(i) == '0' || s.charAt(i)=='8' || s.charAt(i)=='9') {
				ans = ans*10;
			}else {
				return -1L;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			Long n = sc.nextLong();
			Long ans = Convert(Long.toString(n));
			
			if(ans==0 || ans==-1L) {
				System.out.println("INVALID");
			}else {
				System.out.println(ans);
			}
		}
	}
}
