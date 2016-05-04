package holding;

import java.util.ArrayList;

/**
 * @author zhenwei.liu
 * Simple container example (produce compiler warnings).
 * {ThrowException}
 * output {
 * Exception in thread "main" java.lang.ClassCastException: holding.Orange cannot be cast to holding.Apple
	at holding.ApplesAndOrangesWithoutGenerics.main(ApplesAndOrangesWithoutGenerics.java:31)
 * }
 */

class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() {
		return id;
	}
}

class Orange {
	
}

public class ApplesAndOrangesWithoutGenerics {
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i = 0; i < 3; i++) 
			apples.add(new Apple());
		// Not prevented from adding an Orange to apples:
		apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			((Apple)apples.get(i)).id();
			//Orange is deteced only at run time
		}
	}
}
