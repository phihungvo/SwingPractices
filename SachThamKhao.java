package Bt6_3;

import java.util.Date;

public class SachThamKhao extends Sach{
	
	int thue;

	public SachThamKhao() {
		super();
	}

	public SachThamKhao(int maSach, String tenSach, Date ngayNhap,
			String nhaXuatBan, double donGia, int soLuong, int thue) {
		super(maSach, tenSach, ngayNhap, nhaXuatBan, donGia,  soLuong);
		this.thue = thue;
	}

	public int getThue() {
		return thue;
	}

	public void setThue(int thue) {
		this.thue = thue;
	}

	@Override
	public double tinhThanhTien() {
		return super.tinhThanhTien() + 
				(super.tinhThanhTien()* this.thue) / 100;
	}

	@Override
	public String toString() {
		return "SachThamKhao" + super.toString()+ " [thue=" + thue + "]";
	}
	
	
}
