package baiTap;

public class GiftBox {
	
	public String hinhDang;
	
	public String mauSac;
	
	final int phiLamHop = 10000;

	public GiftBox(String hinhDang, String mauSac) {
		super();
		this.hinhDang = hinhDang;
		this.mauSac = mauSac;
	}
	
	class Gift{
		
		public String ten;
		
		public double trongLuong;
		
		final int donGia = 200;

		public Gift(String ten, double trongLuong) {
			super();
			this.ten = ten;
			this.trongLuong = trongLuong;
		}
		
		public Double tinhTienGui() {
			return trongLuong * donGia + phiLamHop;
		}
	}

}
