package exceptions;

// Programmatic access to stack trace information
// P460 The stack trace
public class WhoCalled {
	static void f() {
		// Generate the exception to fill in the stack trace
		try {
			throw new Exception();
		} catch (Exception e) {
			for(StackTraceElement ste : e.getStackTrace())
				System.out.println(ste.toString());
		}
	}
	static void g() { f(); }
	static void h() { g(); }
	public static void main(String[] args) {
		f();
		System.out.println("---------------------------------");
		g();
		System.out.println("---------------------------------");
		h();
	}
}
