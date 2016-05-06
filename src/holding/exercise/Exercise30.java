package holding.exercise;

import holding.InterfaceVsIterator;

import java.util.Collection;
import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

// P30
public class Exercise30 implements Collection{
	
	private Pet[] pets = Pets.createArray(8);

	@Override
	public int size() {
		return pets.length;
	}
	
	@Override
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>(){
			private int index = 0;
				
			@Override
			public boolean hasNext() {
				return index < pets.length;
			}

			@Override
			public Pet next() {
				return pets[index++];
			}

			@Override
			public void remove(){ // Not implemented
				throw new UnsupportedOperationException();  // 为什么方法声明不需要加上throws
			}
			
		};
	}
	
	public static void main(String[] args) {
		Exercise30 c = new Exercise30();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}

	@Override
	public boolean isEmpty() {
		return pets == null || pets.length == 0;
	}

	@Override
	public boolean contains(Object o) {
		// o==null ? e==null : o.equals(e)
		for(Pet p : pets){
			if(o==null ? p==null : o.equals(p)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		return pets;
	}

	@Override
	public Object[] toArray(Object[] a) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean add(Object e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException();
		
	}
}
