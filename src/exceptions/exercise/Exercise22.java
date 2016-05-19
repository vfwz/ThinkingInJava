package exceptions.exercise;

/*  
    Create a class called FailingConstructor with a constructor that might
	fail partway through the construction process and throw an exception.
	In main(), write code that properly guards against this failure.
 */

class ConstructionFailException extends Exception {}

class FailingConstructor {
	FailingConstructor() throws ConstructionFailException {}
}

public class Exercise22 {
	
	public static void main(String[] args) {
		try {
			FailingConstructor fc = new FailingConstructor();
		} catch (ConstructionFailException e) {
			System.out.println("Initiate FailingConstructor fail");
		}
	}
	
}
