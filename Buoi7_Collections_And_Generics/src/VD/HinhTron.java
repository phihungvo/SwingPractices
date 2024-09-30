package VD;

public class HinhTron <T>{
	
	private T bk;
	
	public HinhTron() {
	}
	
	public HinhTron(T bk) {
		this.bk = bk;
	}
	
	public double chuVi() {
		double r = Double.parseDouble(bk.toString());
		return r * 2*Math.PI;
	}
	
	public double dienTich() {
		double r = Double.parseDouble(bk.toString());
		return r * r * Math.PI;
	}
	
	public static void main(String[] args) {
		HinhTron<Integer> ht1 = new HinhTron<>(5);
		System.out.println(String.format("Chu vi : %.2f,"
				+ "Dien tich: %.2f", ht1.chuVi(), ht1.dienTich()));
		
		
		HinhTron<Double> ht2 = new HinhTron<>(6.5);
		System.out.println(String.format("Chu vi : %.2f,"
				+ "Dien tich: %.2f", ht1.chuVi(), ht1.dienTich()));
		
		
	}
	

}
