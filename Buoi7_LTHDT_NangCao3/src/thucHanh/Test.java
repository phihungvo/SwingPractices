package thucHanh;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		PhanSo[] ps = new PhanSo[5];
		
		ps[0] = new PhanSo(1, 5);
		ps[1] = new PhanSo(1, 3);
		ps[2] = new PhanSo(1, 2);
		ps[3] = new PhanSo(1, 4);
		ps[4] = new PhanSo(1, 6);
		
		System.out.println(Arrays.toString(ps));
		
		
		for(int i = 0; i < ps.length; i++) {
			for(int j = i + 1; j < ps.length; j++) {
				if(ps[i].getTuSo() * ps[j].getMauSo() > 
						ps[i].getMauSo() * ps[j].getTuSo()) {
					PhanSo tg = ps[i];
					ps[i] = ps[j];
					ps[j] = tg;
				}
			}
		}
		System.out.println(Arrays.toString(ps));
		
		Arrays.sort(ps);
		System.out.println(Arrays.toString(ps));
	}
}
