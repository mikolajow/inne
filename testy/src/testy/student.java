package testy;

public class student {
	
	private int stypendium;
	private String imie;
	
	public student( String imie , int styp ) {
		this.imie = imie;
		this.stypendium  = styp;
	}

	public int getStypendium() {
		return stypendium;
	}

	public void setStypendium(int stypendium) {
		this.stypendium = stypendium;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	@Override
	public String toString() {
		return "student [stypendium=" + stypendium + ", imie=" + imie + "]";
	}
	
	
	
}
