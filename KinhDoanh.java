package Bt6_2;

public class KinhDoanh extends NhanVien{
	
	int soSanPham;
	
	public KinhDoanh() {}
	
	public KinhDoanh(double heSoLuong, int soSanPham) {
		super(heSoLuong);
		this.soSanPham = soSanPham;
	}

	
	public int getSoSanPham() {
		return soSanPham;
	}

	public void setSoSanPham(int soSanPham) {
		this.soSanPham = soSanPham;
	}

	@Override
	public double tinhLuong() {
		return super.tinhLuong() + (this.soSanPham * 20000);
	}

}
