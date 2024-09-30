package Frm7_4;

public class Dog {
	
	private String name;
	
	public Dog() {}
	
	public Dog(String name) {
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
