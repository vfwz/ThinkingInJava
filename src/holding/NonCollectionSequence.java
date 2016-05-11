package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet>{
	
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
	
	public Iterable<Pet> reversed() {
		return new Iterable<Pet>() {
			@Override
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>(){
					int current = pets.length - 1;
					
					@Override
					public boolean hasNext() {
						return current > -1;
					}

					@Override
					public Pet next() {
						return pets[current--];
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
					
				};
			}
		};
	}
	
	public Iterable<Pet> randomized() {
		return new Iterable<Pet>() {
			public Iterator<Pet> iterator() {
				List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
				Collections.shuffle(shuffled, new Random(47));  // 乱序
				return shuffled.iterator();
			}
		};
	}
	
	
	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		InterfaceVsIterator.display(nc.iterator());
		display(nc.reversed());
		display(nc.randomized());
		display(nc); // NonCollectionSequence 需实现 Iterable接口
	}
	
	// to display a Iterable use foreach
	private static void display(Iterable<Pet> pets) {
		for(Pet p : pets) 
			System.out.print(p.id() + ":" + p + " ");
		System.out.println();
	}
	
}
