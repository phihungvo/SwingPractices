package Bt;

public class Dictionary implements Comparable<Dictionary>{
	
	private String word;
	
	private String meaning;
	
	public Dictionary() {
		super();
	}

	public Dictionary(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	@Override
	public int compareTo(Dictionary o) {
		return this.word.compareTo(o.word);
	}

	@Override
	public String toString() {
		return word + ": " + meaning;
	}
	
	
}










