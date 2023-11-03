import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;


class HS {
	private static int id = 1;
	private String MSV,name, rank;
	private double toan,van,anh,ly,hoa,sinh,su,dia,gdcd,congNghe;
	private double trungBinh;
	
	public HS(String name, double toan, double van, double anh, double ly, double hoa,double sinh, double su, double dia, double gdcd, double congNghe) {
		if(id<10) {
			this.MSV = "HS0";
		}else if(id<=99) {
			this.MSV = "HS";
		}
		MSV += Integer.toString(id++);
		this.name = name;
		this.toan = toan;
		this.van = van;
		this.anh = anh;
		this.ly = ly;
		this.hoa = hoa;
		this.sinh = sinh;
		this.su = su;
		this.dia = dia;
		this.gdcd = gdcd;
		this.congNghe = congNghe;
		trungBinh = (toan*2+van*2+anh+ly+hoa+sinh+su+dia+gdcd+congNghe)/12;
		if(trungBinh>=9) {
			rank = "XUAT SAC";
		}else if(trungBinh>=8) {
			rank = "GIOI";
		}else if(trungBinh>=7) {
			rank = "KHA";
		}else if(trungBinh>=5) {
			rank = "TB";
		}else if(trungBinh <5) {
			rank = "YEU";
		}
	}
	
	public double getTrungBinh() {
		return trungBinh;
	}
	
	public String getMSV() {
		return MSV;
	}
	
	@Override
	public String toString() {
		return this.MSV+" "+this.name+" "+Math.round(this.trungBinh*10.0)/10.0+" "+this.rank;
	}
}



public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<HS>list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double toan = sc.nextDouble();
			double van = sc.nextDouble();
			double anh = sc.nextDouble();
			double ly = sc.nextDouble();
			double hoa = sc.nextDouble();
			double sinh = sc.nextDouble();
			double su = sc.nextDouble();
			double dia = sc.nextDouble();
			double gdcd = sc.nextDouble();
			double congNghe = sc.nextDouble();
			HS hs = new HS(name,toan,van,anh,ly,hoa,sinh,su,dia,gdcd,congNghe);
			list.add(hs);
		}
		Collections.sort(list, new Comparator<HS>() {
			@Override
			public int compare(HS a, HS b) {
				if(a.getTrungBinh() > b.getTrungBinh()) {
					return -1;
				}else if(a.getTrungBinh() < b.getTrungBinh()) {
					return 1;
				}else {
					if(a.getMSV().compareTo(b.getMSV())>0) {
						return 1;
					}else {
						return -1;
					}
				}
			}
		});
		for(HS x:list) {
			System.out.println(x);
		}
	}
}
