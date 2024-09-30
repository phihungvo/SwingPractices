package giaoTiep;

public class HinhChuNhat implements HinhHoc{
	
	private int chieuDai;
	private int chieuRong;
	
	public HinhChuNhat() {
		super();
	}

	public HinhChuNhat(int chieuDai, int chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return (chieuDai + chieuRong) * 2;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return chieuDai * chieuRong;
	}

	@Override
	public String tenHinh() {
		// TODO Auto-generated method stub
		return "Hình chữ nhật";
	}

	@Override
	public String xuat() {
		// TODO Auto-generated method stub
		return String.format("%s có chu vi: %.2f, diện tích: %.2f", tenHinh(), chuVi(), dienTich());
	}

}
