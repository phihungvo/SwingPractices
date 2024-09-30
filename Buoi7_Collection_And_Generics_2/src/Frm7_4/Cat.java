package Frm7_4;

public class Cat {
	
	private String name;
	
	public Cat() {}
	
	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
