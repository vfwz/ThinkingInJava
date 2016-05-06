package holding;

import java.util.Arrays;

//  A foreach statement works with an array or anything Iterable, but that 
//	doesn't mean that an array is automatically an Iterable 

public class ArrayIsNotIterable {
	static <T> void test(Iterable<T> ib) {
		for(T t : ib ) 
			System.out.print( t + " ");
	}
	
	public static void main(String[] args) {
		test(Arrays.asList(1, 2, 3));
		String[] strings = { "A", "B", "C" };
		// An array works in foreach, but it's not Iterable
		// test(strings); //The method test(Iterable<T>) in the type ArrayIsNotIterable is not applicable for the arguments (String[])
		// You must explicitly convert it to an Iterable:
		test(Arrays.asList(strings));
	}
	
}
