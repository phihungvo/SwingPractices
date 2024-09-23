package Bt6_2;

public class HanhChinh extends NhanVien{
	
	double phuCap;
	
	public HanhChinh() {}
	
	public HanhChinh(double heSoLuong, double phuCap) {
		super(heSoLuong);
		this.phuCap = phuCap;
	}

	public double getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	
	@Override
	public double tinhLuong() {
		return super.tinhLuong() + this.phuCap;
	}

}
