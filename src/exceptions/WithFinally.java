package exceptions;

// Finally Guarantees cleanup.
// P474 What's finally for?
public class WithFinally {
	static Switch sw = new Switch();
	public static void main(String[] args) {
		try {
			sw.on();
			// Code that can throw exceptions...
			OnOffSwitch.f();
		} catch (OnOffException1 e) {
			System.out.println("OnException1");
		} catch (OnOffException2 e) {
			System.out.println("OnException2");
		} finally {
			sw.off();
		}
	}
}
