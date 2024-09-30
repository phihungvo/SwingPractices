package giaoTiep;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc[] hh = new HinhHoc[3];
		hh[0] = new HinhTron(7);
		hh[1] = new HinhChuNhat(8, 5);
		hh[2] = new HinhVuong(6);
		
		for(HinhHoc h : hh)
			System.out.println(h.xuat());

	}

}
