package giaoTiep;

public class HinhTron implements HinhHoc{
	
	private int banKinh;
	
	public HinhTron() {
		super();
	}

	public HinhTron(int banKinh) {
		super();
		this.banKinh = banKinh;
	}

	public int getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(int banKinh) {
		this.banKinh = banKinh;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return banKinh*2*Math.PI;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return banKinh*banKinh*Math.PI;
	}

	@Override
	public String tenHinh() {
		// TODO Auto-generated method stub
		return "Hình tròn";
	}

	@Override
	public String xuat() {
		// TODO Auto-generated method stub
		return String.format("%s có chu vi: %.2f, diện tích: %.2f", tenHinh(), chuVi(), dienTich());
	}

}
