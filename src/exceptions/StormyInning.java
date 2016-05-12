package exceptions;

// Overridden methods may throw only the exceptions specified in their base-class versions,
// or exceptions derived from the base-class exceptions

// P479 Exception restrictions
class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
	public Inning() throws BaseballException {}
	public void event() throws BaseballException {
		// Doesn't actually have to throw anything
	}
	public abstract void atBat() throws Strike, Foul;
	public void walk() {} // Throws no checked exceptions
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm{
	// OK to add new exceptions for constructors, but you must deal with the base constructor exceptions:
	// 在子类的构造方法中，基类抛出的异常必须处理 
	public StormyInning() throws RainedOut, BaseballException {}
	public StormyInning(String s) throws Foul, BaseballException {} // Foul是BaseballException的子类
	
	// Regular methods must conform to base class:
	// public void walk() throws PopFoul {} // Compile Error  Exception PopFoul is not compatible with throws clause in Inning.walk()
	
	// Interface CANNOT add exceptions to existing methods from the base class:
	// public void event() throws RainedOut {}  // Exception RainedOut is not compatible with throws clause in Inning.event()
	
	// If the method doesn't already exist in the base class, the exception is OK:
	public void rainHard() throws RainedOut {}
	
	// You can choose to not throw any exceptions, even if the base version does:
	public void event() {}
	
	// Overridden methods can throw inherited exceptions:
	public void atBat() throws PopFoul {}
	
	public static void main(String[] args) {
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch(PopFoul e) {
			System.out.println("Pop foul");
		} catch (RainedOut e) {
			System.out.println("Rained Out");
		} catch (BaseballException e) {
			System.out.println("Genric baseball exception");
		}
		// Strike not thrown in derived version.
		try {
			// What happens if you upcast?
			Inning i = new StormyInning();
			i.atBat();
			// You must catch the exceptions from the base-class version of the method:
		} catch(Strike e) {
			System.out.println("Strike");
		} catch (Foul e) {
			System.out.println("Foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}
}
