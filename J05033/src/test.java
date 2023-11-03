import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

class Time {
	int h,m,s;
	
	void input(Scanner sc) {
		h = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();
	}
	void output() {
		System.out.printf("%d %d %d\n", h , m , s);
	}
}

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Vector<Time>v = new Vector<Time>();
		for(int i=0;i<T;i++) {
			Time x = new Time();
			x.input(sc);
			v.add(x);
		}
		
		Collections.sort(v, new Comparator<Time>() {
			@Override
			public int compare(Time a, Time b) {
				if(a.h==b.h) {
					if(a.m==b.m) {
						if(a.s > b.s) {
							return 1;
						}else {
							return -1;
						}
					}else if(a.m < b.m) {
						return -1;
					}else {
						return 1;
					}
				}else if(a.h > b.h) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		for(int i=0;i<T;i++) {
			v.get(i).output();
		}
	}
}
