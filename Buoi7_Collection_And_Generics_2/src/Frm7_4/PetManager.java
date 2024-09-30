package Frm7_4;

import java.util.ArrayList;
import java.util.List;

public class PetManager <T> {
	
	private List<T> pets = new ArrayList<>();

	public List<T> getPets() {
		return pets;
	}

	public void setPets(List<T> pets) {
		if(this.pets == null) {
			pets = new ArrayList<>();
		}
		this.pets = pets;
	}
	
	
	
	
}
