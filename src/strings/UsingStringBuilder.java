package strings;

import java.util.Random;

// P508 Overloading ‘+’ vs. StringBuilder
public class UsingStringBuilder {
	public static Random rand = new Random(47);
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for(int i = 0; i < 25; i++) {
			result.append(rand.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length() - 2, result.length()); // 删除掉最后一个逗号和空格
		result.append("]");
		return result.toString();
	}
	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}
}
