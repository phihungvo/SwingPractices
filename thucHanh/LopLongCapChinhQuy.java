package thucHanh;


class LopNgoai{
private int a = 1;
	
	class LopTrong{
		private int b = 2;
		
		public void xuatTrong() {
			int c = 3;
			System.out.println(String.format("a = %d, b = %d, c = %d", a , b, c));
		}	
	}
	
	public void xuatNgoai() {
		LopTrong lt = new LopTrong();
		lt.xuatTrong();
	}
}


public class LopLongCapChinhQuy {	
	public static void main(String[] args) {
		LopNgoai ln = new LopNgoai();
		ln.xuatNgoai();
		
		LopNgoai.LopTrong lt = ln.new LopTrong();
		lt.xuatTrong();
	}

}
