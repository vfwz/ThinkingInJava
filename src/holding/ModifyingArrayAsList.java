package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// It's important to be aware that Arrays.asList() produces a List object 
// that uses the underlying array as its physical implementation
// P436
public class ModifyingArrayAsList {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] ia = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));
		System.out.println("Before shuffling: " + list1);
		Collections.shuffle(list1, rand);
		System.out.println("After shuffling: " + list1);
		System.out.println("array: " + Arrays.toString(ia));
		
		// 直接使用构造方法new ArrayList<T>(ia) , 此ia直接赋值给新List的成员变量数组
		List<Integer> list2 = Arrays.asList(ia);
		System.out.println("Before shuffling: " + list2);
		Collections.shuffle(list2, rand);
		System.out.println("After shuffling: " + list2);
		System.out.println("array: " + Arrays.toString(ia));
	}
}
