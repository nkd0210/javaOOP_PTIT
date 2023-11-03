import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class MH {
	private static int id=1;
	private String MMH, ten, nhom;
	private float mua, ban, loiNhuan;
	
	public MH (String ten, String nhom, float mua, float ban) {
		this.MMH = Integer.toString(id++);
		this.ten = ten;
		this.nhom = nhom;
		this.mua = mua;
		this.ban = ban;
		loiNhuan = ban - mua;
	}
	
	public float getLoiNhuan() {
		return loiNhuan;
	}
	
	@Override
	public String toString() {
		return this.MMH+" "+this.ten+" "+this.nhom+" "+String.format("%.2f", this.loiNhuan);
	}
}




public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<MH>list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			sc.nextLine();
			String ten = sc.nextLine();
			String nhom = sc.nextLine();
			float mua = sc.nextFloat();
			float ban = sc.nextFloat();
			MH mh = new MH(ten,nhom,mua,ban);
			list.add(mh);
		}
		Collections.sort(list, new Comparator<MH>() {
			@Override
			public int compare(MH a, MH b) {
//				if(a.getLoiNhuan() < b.getLoiNhuan()) {
//					return 1;
//				}else {
//					return -1;
//				}
				return -1*Float.compare(a.getLoiNhuan(),b.getLoiNhuan());
			}
		});
		for(MH x:list) {
			System.out.println(x);
		}
	}
}
