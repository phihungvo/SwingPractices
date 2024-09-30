package VD;

import java.util.Date;

public class genericType {
	
	public static <E> void printArray(E[] arr) {
		for(E element : arr) {
			System.out.println(String.valueOf(element));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] arrStr = {"hung", "phi", "vo"};
		Double[] arrDbl = {3.4, 7.4, 1.2, 8.4, 9.0};
		
		Sach s1 = new Sach(1, "MatBiet",new Date(), "Kim Dong"
				, 30000, 50);
		Sach s2 = new Sach(1, "Mai", new Date(), "Tran Thanh"
				, 40000, 150);
		Sach s3 = new Sach(1, "Bo Gia",new Date(), "Thu Trang"
				, 3000, 5);
		Sach s4 = new Sach(1, "Chau Tinh Tri",new Date(), "VTV"
				, 1000, 500);
		Sach s5 = new Sach(1, "Lat Mat 8",new Date(), "Ly Hai"
				, 65000, 1050);
		
		Sach[] arrSch = new Sach[]{s1, s2, s3, s4, s5};
		
		
		printArray(arrStr);
		printArray(arrDbl);
		printArray(arrSch);
		
		
		
		
		
	}
}
