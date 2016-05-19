package exceptions;

import java.io.File;

// Guaranteeing proper cleanup of a resource
// P486 Constructors
public class Cleanup {
	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("bin/exceptions/Cleanup.class");
			try {
				String s;
				int i = 1;
				while((s = in.getLine()) != null) {
					//Perform line-by-line processing here
				}
			} catch (Exception e) {
				System.out.println("Caught Exception in main");
				e.printStackTrace(System.out);
			} finally {
				in.dispose();
			}
		} catch (Exception e) {
			System.out.println("InputFile construction failed");
		}
	}
}
