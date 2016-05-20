package strings;

import java.util.ArrayList;
import java.util.List;

// P510 Unintended recursion
public class InfiniteRecursion {
	@Override
	public String toString() {
		return " InfiniteRecursion address: " + this + "\n";
		// return " InfiniteRecursion address: " + super.toString() + "\n";   // repair, call the toString from Object to get the class address
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for(int i = 0; i < 10; i++)
			v.add(new InfiniteRecursion());
		System.out.println(v);
	}
}
