package giaoTiep;

public class HinhVuong extends HinhChuNhat implements HinhHoc{
		
	public HinhVuong() {
		super();
	}

	public HinhVuong(int canh) {
		super(canh, canh);
	}

	@Override
	public String tenHinh() {
		return "Hình vuông";
	}

}
