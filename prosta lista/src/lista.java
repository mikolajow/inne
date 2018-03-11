import java.util.Iterator;
import java.util.NoSuchElementException;

public class lista implements Iterable<student>{
	
	private student[] tab;
	private int ilosc;
	
	public lista( int rozmiar ) {
		this.tab = new student[rozmiar];
		this.ilosc = 0;
	}//koniec konstruktora
	
	public void add(student s) {
		tab[ilosc] = s;
		ilosc++;
	}

	@Override
	public Iterator<student> iterator() {
		// TODO Auto-generated method stub
		return new iterator();
	}
	
	private class iterator implements Iterator<student>{
		
		private int pozycja = 0;
		
		@Override
		public boolean hasNext() {
			return pozycja < ilosc;
		}//koniec hasNext

		@Override
		public student next() throws NoSuchElementException {
			if (hasNext()) {
				return tab[pozycja++];
			} else {
				throw new NoSuchElementException();
			}//koniec else
		}//koniec next
		
	}//koniec klasy iterator
	
}//koniec klasy






























