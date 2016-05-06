package holding;

import java.util.AbstractCollection;
import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CollectionSequence extends AbstractCollection<Pet>{
	
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
		CollectionSequence c = new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
		c.iterator().remove();
	}

	
}
