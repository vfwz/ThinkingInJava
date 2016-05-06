package holding.exercise;

import holding.InterfaceVsIterator;
import holding.NonCollectionSequence;

import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

/*
 Exercise 32: (2)Following the example of MultiIterableClass, add reversed()
 and randomized() methods to NonCollectionSequence.java, as well as making
 NonCollectionSequence implements Iterable, and show that all the approaches 
 work in foreach statements.
 */

class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}

public class Exercise32 extends PetSequence{
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;
			public boolean hasNext() {
				return index < pets.length;
			}
			public Pet next() {
				return pets[index++];
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	
	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		InterfaceVsIterator.display(nc.iterator());
	}
}
