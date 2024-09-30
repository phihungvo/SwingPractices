package thucHanh;

import thucHanh.LopNgoai.LopTrong;

class LopNgoai2{
private int a = 1;
	
	public void xuatNgoai() {
		
		class LopTrong{
			private int b = 2;
			
			public void xuatTrong() {
				int c = 3;
				System.out.println(String.format("a = %d, b = %d, c = %d", a , b, c));
			}	
		}
		
		LopTrong lt = new LopTrong();
		lt.xuatTrong();
	}
}
public class LopLongCapHam {

	public static void main(String[] args) {
		LopNgoai2 ln2 = new LopNgoai2();
		ln2.xuatNgoai();
		
		LopNgoai.LopTrong lt = new LopNgoai().new LopTrong();
		lt.xuatTrong();
		
	}
}
