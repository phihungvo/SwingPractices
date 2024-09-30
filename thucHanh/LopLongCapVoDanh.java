package thucHanh;

interface PhepTinh{
	double tinh(int a, int b);
}

//cach 1: xay dung lop thuc thi giao dien
class Cong implements PhepTinh{

	@Override
	public double tinh(int a, int b) {
		// TODO Auto-generated method stub
		return (double) a + b;
	}
	
}


public class LopLongCapVoDanh {
	
	public static void main(String[] args) {
	
	int a = 5, b = 4;
	double tong, hieu, tich, thuong;
	
	Cong cong = new Cong();
	
	tong = cong.tinh(a, b);
	System.out.println("tong = " + tong);
	
	
	//cach 2: lop lpng cap vo danh tu giao tiep
	PhepTinh phepTinh = new PhepTinh() {
		@Override
		public double tinh(int a, int b) {
			return a - b;
		}
	};
	hieu = phepTinh.tinh(a, b);
	System.out.println("hieu = " + hieu);
	
	
	//cach 3: lop long cap vo danh tu lop cha
	Cong nhan = new Cong() {
		@Override
		public double tinh(int a, int b) {
			return a * b;
		}
	};
	tich = nhan.tinh(a, b);
	System.out.println("tich = " + tich);
	
	}
}
