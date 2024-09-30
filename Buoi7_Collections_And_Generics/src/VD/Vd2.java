package VD;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Vd2 {
	public static void main(String[] args) {
		System.out.println("Danh sach LIST");
		List<Integer> ds1 = new LinkedList<>();
		ds1.add(10);
		ds1.add(3);
		ds1.add(4);
		ds1.add(5);
		ds1.add(6);
		
		System.out.println("Xuat LIST");
		for(int i : ds1)
			System.out.println(i);
		
		
		System.out.println("Danh sach SET");
		Set<String> st = new LinkedHashSet<>();
		st.add("dai");
		st.add("hoc");
		st.add("khtn");
		st.add("hoc");
		
		System.out.println("Xuat SET");
		for(String s : st)
			System.out.println(s);
		
		
		System.out.println("Danh sach MAP");
		Map<Integer, String> mp = new TreeMap<>();
		mp.put(4, "nguyen");
		mp.put(2, "tat");
		mp.put(1, "thanh");
		mp.put(3, "dai");
		mp.put(5, "hoc");
		
		System.out.println("Xuat MAP");
		for(Integer m : mp.keySet())
			System.out.println(m + " -> " +mp.get(m));
	}
}
