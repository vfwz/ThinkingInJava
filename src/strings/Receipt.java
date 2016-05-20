package strings;

import java.util.Formatter;

// P517 Format specifiers
public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	public void printTitle() {
		// %-15s 宽度为10，不足补空，多出部分舍去，左对齐的字符串 
		// %5s   宽度为5，不足补空，多出部分舍去，右对齐的字符串
		f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
		f.format("%-15s %5s %10s\n", "----", "---", "-----");
	}
	public void print(String name, int qty, double price) {
		f.format("%-15.15s %5d %10.2f \n", name, qty, price);
		total += price;
	}
	public void printTotal() {
		// %10.2f，整数位为10，不足补空，多出照常显示， 小数位为2，多出部分四舍五入
		f.format("%-15s %5s %10.2f\n", "Tax", "", total*0.06);
		f.format("%-15s %5s %10s\n", "", "", "-----");
		f.format("%-15s %5s %10.2f\n", "Total", "", total*1.06);
	}
	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
}
