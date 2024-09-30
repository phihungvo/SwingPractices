package VD;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;

public class Vd1 {
	public static void main(String[] args) {
		System.out.println("Danh sach list");
		ArrayList ds1 = new ArrayList<>();
		ds1.add(1);
		ds1.add("abc");
		ds1.add(new Date());
		ds1.add(true);
		ds1.add(2.5);
		System.out.println("Xuat danh sach theo chi so");
		for(int i = 0; i < ds1.size(); i++)
			System.out.println(ds1.get(i));
		
		System.out.println("Xuat dang sach theo phan tu");
		for(Object o : ds1)
			System.out.println(o);
		
		System.out.println("Danh sach SET");
		HashSet hs1 = new HashSet<>();
		hs1.add(1);
		hs1.add("abc");
		hs1.add(new Date());
		hs1.add(true);
		hs1.add(2.5);
		
		System.out.println("Xuat dang sach theo phan tu");
		for(Object o : hs1)
			System.out.println(o);
		
		System.out.println("Danh sach MAP");
		Hashtable tb = new Hashtable();
		tb.put(1, "Mot");
		tb.put(2, "Hai");
		tb.put(3, "Ba");
		tb.put(4, "Bon");
		
		for(Object k : tb.keySet())
			System.out.println(k + " -> " + tb.get(k));
	}
}
