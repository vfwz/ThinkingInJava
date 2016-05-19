package exceptions.exercise;

/*  
Add a class with a dispose() method to the previous exercise. Modify FailingConstructor so that
the constructor creates one of these disposable objects as a member object, after which the 
constructor might throw an exception, after which it creates a second disposable member object.
Write code to properly guard against failure, and in main() verify that all possible failure 
situations are covered.
*/

class ConstructionFailException2 extends Exception {}

class DisposableClass {
	public void dispose() {
		System.out.println("Disposable class disposed");
	}
}

class FailingConstructor2 {
	
	DisposableClass member1, member2; 
	
	FailingConstructor2() throws ConstructionFailException2 {
		member1 = new DisposableClass();
		try {
			//... Exception might been thrown
		} catch(Exception e){
			member1.dispose();
			System.out.println("An exception been thrown in FailingConstructor2 construction");
		}
		member2 = new DisposableClass();
		
	}
}

public class Exercise23 {

public static void main(String[] args) { 
	try {
		FailingConstructor2 fc = new FailingConstructor2();
		
	} catch (ConstructionFailException2 e) {
		System.out.println("Initiate FailingConstructor fail");
	}
}

}
