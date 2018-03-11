
public class testMain {

	public static void main(String[] args) {
		
		lista l = new lista(22);
		student s = new student(22);
		
		l.add(s);
		l.add(new student(44));
		l.add(new student(22));
		l.add(new student(2));
		l.add(new student(434));
		l.add(new student(1));
		
		
		for ( student p : l ) {
			System.out.println(p);
		}
		
	}//koniec main

}//koniec klasy
