package testy;

import java.util.Iterator;
import java.util.function.Predicate;

public class filterIterator<T> implements Iterator<T>{
	
	private Iterator iter;
	private Predicate pred;
	
	public filterIterator( Iterator<T> it, Predicate<T> pre) {
		super();
		this.pred = pre;
		this.iter = it;
		findNextValue();
	}
	
	private void findNextValue() {
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
