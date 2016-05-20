package strings;

import static util.Print.print;

// P503 Immutable Strings
public class Immutable {
	public static String upcase(String s) {
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
		String q = "howdy";
		print(q); // howdy
		String qq = upcase(q);
		print(qq); // HOWDY
		print(q); // howdy 原来的字符串没有被变更
	}
}
