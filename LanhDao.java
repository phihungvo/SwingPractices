package Bt6_2;

public class LanhDao extends NhanVien{
	
	
	public LanhDao() {}
	
	public LanhDao(double heSoLuong) {
		super(heSoLuong);
	}

	@Override
	public double tinhLuong() {
		double tongLuong = super.tinhLuong();
		return tongLuong + (tongLuong * 0.1);
	}

}
