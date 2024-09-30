package thucHanh;

public class PhanSo implements Comparable<PhanSo>{
	private int tuSo;
	private int mauSo;
	
	public PhanSo() {
		tuSo = 0;
		mauSo = 1;
	}
	
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	
	public PhanSo(String tuSo, String mauSo) {
		this.tuSo = Integer.parseInt(tuSo);
		this.mauSo = Integer.parseInt(mauSo);
	}

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}
	
	public PhanSo cong(PhanSo ps) {
		PhanSo k = new PhanSo();
		k.tuSo = tuSo * ps.mauSo + ps.tuSo * mauSo;
		k.mauSo = mauSo * tuSo;
		return k;
	}
	
	public PhanSo nhan(PhanSo ps) {
		PhanSo k = new PhanSo();
		k.tuSo = tuSo * ps.tuSo;
		k.mauSo = mauSo * ps.mauSo;
		return k;
	}
	
	public PhanSo chia(PhanSo ps) {
		PhanSo k = new PhanSo();
		k.tuSo = tuSo * ps.mauSo;
		k.mauSo = mauSo * ps.tuSo;
		return k;
	}
	
	public String xuat() {
		return tuSo + "/" + mauSo;
	}
	
	@Override
	public String toString() {
		return xuat();
	}

	@Override
	public int compareTo(PhanSo o) {
		// TODO Auto-generated method stub
		if(tuSo * o.mauSo < o.tuSo * mauSo)
			return -1;
		else if(tuSo * o.mauSo == o.tuSo*mauSo)
			return 0;
		else
			return 1;
	}
	

}





