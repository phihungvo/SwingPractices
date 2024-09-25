package Bt6_3;

import java.util.Date;

public class Sach {
	
	int maSach;
	
	String tenSach;
	
	Date ngayNhap;
	
	String nhaXuatBan;
	
	double donGia;
	
	int soLuong;
	
	public Sach() {}

	public Sach(int maSach, String tenSach, Date ngayNhap, String nhaXuatBan, double donGia, int soLuong) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.ngayNhap = ngayNhap;
		this.nhaXuatBan = nhaXuatBan;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	public int getMaSach() {
		return maSach;
	}

	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public double tinhThanhTien() {
		return this.soLuong * this.donGia;
	}

	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", tenSach=" + tenSach + ", ngayNhap=" + ngayNhap + ", nhaXuatBan="
				+ nhaXuatBan + ", donGia=" + donGia + ", soLuong=" + soLuong + "]";
	}
	
	

}
