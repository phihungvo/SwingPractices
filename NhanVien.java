package Bt6_2;

public class NhanVien {
	final double LUONGCOBAN = 1550000;
	double heSoLuong;
	
	public NhanVien() {}
	
	public NhanVien(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public double tinhLuong() {
		return this.LUONGCOBAN * this.heSoLuong;
	}
}
