package Bt6_3;

import java.util.Date;

public class SachGiaoKhoa extends Sach{
	
	boolean tinhTrang; // true is new, false is old

	public SachGiaoKhoa() {
		super();
	}

	public SachGiaoKhoa(int maSach, String tenSach, Date ngayNhap,
			String nhaXuatBan, double donGia, int soLuong, boolean tinhTrang) {
		super(maSach, tenSach, ngayNhap, nhaXuatBan, donGia,  soLuong);
		this.tinhTrang = tinhTrang;
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	@Override
	public double tinhThanhTien() {
		if(tinhTrang == true)
			return super.tinhThanhTien();
		else
			return super.tinhThanhTien() * 0.5;
	}

	@Override
	public String toString() {
		return "SachGiaoKhoa" + super.toString()+ "[tinhTrang=" + tinhTrang + "]";
	}
	
	
	
}








