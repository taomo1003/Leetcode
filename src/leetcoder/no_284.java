package leetcoder;

import java.util.ArrayList;
import java.util.Iterator;

public class no_284 {
	public class PeekingIterator implements Iterator<Integer> {
		private Iterator<Integer> it;
		private int keep;
		private boolean hasNext;
		
		public PeekingIterator(Iterator<Integer> iterator) {
		    // initialize any member here.
		    it = iterator;
		    hasNext = it.hasNext();
		    if (it.hasNext())
		    	keep = it.next();  
		}

	    // Returns the next element in the iteration without advancing the iterator.
		public Integer peek() {
			if (hasNext) return keep;	  
			else return null;
		}

		// hasNext() and next() should behave the same as in the Iterator interface.
		// Override them if needed.
		@Override
		public Integer next() {
			if (hasNext){
			int temp = keep;
			hasNext = it.hasNext();
			if (it.hasNext())
				keep = it.next();	
		    return temp;}
			else return null;
		}

		@Override
		public boolean hasNext() {
		    return hasNext;
		}
	}
	
	public static void main(String[] args) {
		no_284 test = new no_284();
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		Iterator<Integer> iterator = arrayList.iterator();
		PeekingIterator pk = test.new PeekingIterator(iterator);
		
		System.out.println(pk.hasNext());
		System.out.println(pk.peek());
		System.out.println(pk.peek());
		System.out.println(pk.next());
		System.out.println(pk.hasNext());
		System.out.println(pk.peek());
		System.out.println(pk.peek());
		System.out.println(pk.next());
		System.out.println(pk.hasNext());
		System.out.println(pk.peek());
		System.out.println(pk.peek());
		System.out.println(pk.next());
		System.out.println(pk.hasNext());
		System.out.println(pk.peek());
		System.out.println(pk.peek());
		System.out.println(pk.next());
		
		
	}
}
