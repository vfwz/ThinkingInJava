package strings;

// P505 Overloading ‘+’ vs. StringBuilder
public class Concatenation {
	public static void main(String[] args) {
		String mango = "mango";
		String s = "abc" + mango + "def" + 47;
		System.out.println(s);
	}
}
