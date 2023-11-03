import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class DN {
	private String maDN, tenDN;
	private int soSV;
	
	public DN(String maDN, String tenDN, int soSV) {
		this.maDN = maDN;
		this.tenDN = tenDN;
		this.soSV = soSV;
	}
	
	public int getSoSV() {
		return soSV;
	}
	
	public String getMaDN() {
		return maDN;
	}
	
	@Override
	public String toString() {
		return this.maDN+" "+this.tenDN+" "+this.soSV;
	}
}


public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<DN>list = new ArrayList<>();
		while(n-->0) {
			sc.nextLine();
			String maDN = sc.nextLine();
			String tenDN = sc.nextLine();
			int soSV = sc.nextInt();
			DN dn = new DN(maDN, tenDN, soSV);
			list.add(dn);
		}
		
		Collections.sort(list, new Comparator<DN>() {
			@Override
			public int compare(DN a, DN b) {
				if(a.getSoSV() == b.getSoSV()) {
					if(a.getMaDN().compareTo(b.getMaDN())>0) {
						return 1;
					}else {
						return -1;
					}
				}else if(a.getSoSV() > b.getSoSV()){
					return -1;
				}else {
					return 1;
				}
			}
		});
		int q=sc.nextInt();
		while(q-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+ a +" DEN "+ b +" SINH VIEN:");
			for(DN x:list) {
				if(x.getSoSV()>=a && x.getSoSV()<=b) {
					System.out.println(x);
				}
			}
		}
	}
}
