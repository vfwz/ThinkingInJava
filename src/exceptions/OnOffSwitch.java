package exceptions;

//P473 What's finally for?
public class OnOffSwitch {
	private static Switch sw = new Switch();
	public static void f() throws OnOffException1, OnOffException2 {}
	public static void main(String[] args) {
		try {
			sw.on();
			// Code that can throw exceptions...
			f();
			sw.off();
		} catch(OnOffException1 e) {
			System.out.println("OnException1");
			sw.off();
		} catch(OnOffException2 e) {
			System.out.println("OnException2");
			sw.off();
		}
	}
}
