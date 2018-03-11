
public class student {
	
	private int id;
	
	public student(int id) {
		this.id = id;
	}

	public int getId() { return id;}
	public void setId(int id) { this.id = id;}

	@Override
	public String toString() {
		return "student " + id ;
	}
	
}//koniec klasy
