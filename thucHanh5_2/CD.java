package thucHanh5_2;

public class CD {
	private int maCD;
	
	private String tenCD;
	
	private String tenCaSi;
	
	private int soBaiHat;
	
	private float giaThanh;
	
	public CD() {
		
	}

	public CD(int maCD, String tenCD, String tenCaSi, int soBaiHat, float giaThanh) {
		super();
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.tenCaSi = tenCaSi;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}

	public String getTenCD() {
		return tenCD;
	}

	public void setTenCD(String tenCD) {
		this.tenCD = tenCD;
	}

	public String getTenCaSi() {
		return tenCaSi;
	}

	public void setTenCaSi(String tenCaSi) {
		this.tenCaSi = tenCaSi;
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}

	public float getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(float giaThanh) {
		this.giaThanh = giaThanh;
	}

	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tenCD=" + tenCD + ", tenCaSi=" + tenCaSi + ", soBaiHat=" + soBaiHat
				+ ", giaThanh=" + giaThanh + "]";
	}
	
	
}
