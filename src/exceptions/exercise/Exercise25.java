package exceptions.exercise;

class AException extends Exception {}
class BException extends AException {}
class CException extends BException {}

class A {
	void m() throws AException {
		throw new AException();
	}
}

class B extends A {
	void m() throws BException {
		throw new BException();
	}
}

class C extends B {
	void m() throws CException {
		throw new CException();
	}
}


public class Exercise25 {
	public static void main(String[] args) {
		A a = new C();
		try{
			a.m();
		} catch (AException e) {  // It cann't be CException
			System.out.println(e.getClass());
		}
	}

}
