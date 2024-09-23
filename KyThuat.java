package Bt6_2;

public class KyThuat extends NhanVien{
	
	double soDuAn;
	
	public KyThuat() {}
	
	public KyThuat(double heSoLuong, double soDuAn) {
		super(heSoLuong);
		this.soDuAn = soDuAn;
	}

	
	
	public double getSoDuAn() {
		return soDuAn;
	}

	public void setSoDuAn(double soDuAn) {
		this.soDuAn = soDuAn;
	}

	@Override
	public double tinhLuong() {
		return super.tinhLuong() + (this.soDuAn * 1000000);
	}

}
