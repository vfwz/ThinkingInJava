package exceptions;

import static util.Print.print;

// Finally is always executed.
// P475 What's finally for?
class FourException extends Exception {}

public class AlwaysFinally {
	public static void main(String[] args) {
		print("Entering first try block");
		try {
			print("Entering second try block");
			try {
				throw new FourException();
			} finally { // 此处没有catch, finally仍旧执行
				print("finally in 2nd try block");
			}
		} catch(FourException e) {
			print("Caught FourException in 1st try block");
		} finally {
			print("finally in 1st try block");
		}
	}
}
