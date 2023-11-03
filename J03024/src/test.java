import java.util.Scanner;
import java.lang.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            int n = s.length();
            boolean ok=true;
            for (int i=0;i<n;i++){
                if (s.charAt(0)=='0' || (s.charAt(i)<'0' || s.charAt(i)>'9')){
                   ok=false;
                   break;
                }
            }
            if (!ok) System.out.println("INVALID");
            else{
                int cnt1=0,cnt2=0;//1: le, 2: chan
                for (int i=0;i<n;i++){
                    if ((s.charAt(i)-'0')%2==1) cnt1++;
                    else cnt2++;
                }
                if ((n%2==0 && cnt2>cnt1)||(n%2==1&&cnt1>cnt2)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}