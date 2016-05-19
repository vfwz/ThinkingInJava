package exceptions;

// Catching exception hierarchies
// P489 Exception matching

class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

public class Human {
	public static void main(String[] args) {
		// Catch the exact type:
		try {
			Annoyance a = new Sneeze();
			throw a;
		} catch(Sneeze s) {
			System.out.println("Caught Sneeze");
		} catch(Annoyance a) {
			System.out.println("Caught Annoyance");
		}
		// Catch the base type:
		try {
			throw new Sneeze();
		} catch(Annoyance a) {
			System.out.println("Caught Annoyance");
		}
	}
}
