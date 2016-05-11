package exceptions;

import static util.Print.print;

// Demonstrating the Exception Methods
// P459 Catching any exception
public class ExceptionMethods {
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			print("Caught Exception");
			print("getMessage():" + e.getMessage());
			print("getLocalizedMessage():" + e.getLocalizedMessage());
			print("toString():" + e);
			print("printStackTrace():");
			e.printStackTrace(System.out);
		}
	}
}
