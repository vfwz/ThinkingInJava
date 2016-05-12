package exceptions;

// P479 pitfall: the lost exception
public class ExceptionSilencer {
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} finally {
			// Using 'return' inside the finally block will silence any thrown exception.
			return;
		}
	}
	
	static int f() {
		try {
			return 0;
			//throw new RuntimeException();
		} finally {
			return 99;
		}
	}
	
	/* 此程序会有警告 finally block does not complete normally
	
	http://blog.csdn.net/woshixuye/article/details/8529447
	
	  一、出现问题
	当finall块中包含return语句时，Eclipse会给出警告"finally block does not complete normally"
	
	
	二、分析原因
	1 finally块中的return语句会覆盖try块、catch块中的return语句
	2  如果finally块中包含了return语句，即使前面的catch块重新抛出了异常，则调用该方法的语句也不会获得catch块重新抛出的异常，而是会得到finally块的返回值，并且不会捕获异常
	
	
	三、结论
	finally内部使用 return 语句是一种很不好的习惯，如果try中还有return语句，它会覆盖了try 区域中 return语句的返回值，程序的可读性差。
	面对上述情况，其实更合理的做法是，既不在try block内部中使用return语句，也不在finally内部使用 return语句，
	而应该在 finally 语句之后使用return来表示函数的结束和返回。
	
	 */
	
}
