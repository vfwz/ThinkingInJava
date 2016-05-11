package exceptions.exercise;

/* 	P460
	(2) Create three new types of exceptions. Write a class with a method that throws all three. 
	In main(), call the method but only use a single catch clause that will catch all three types
	of exceptions.
 */

abstract class SuperException extends Exception{
	SuperException() {};
	SuperException(String msg) { super(msg); }
}

class MyException1 extends SuperException{
	MyException1() {};
	MyException1(String msg) { super(msg); }
}

class MyException2 extends SuperException{
	MyException2() {};
	MyException2(String msg) { super(msg); }
	
}

class MyException3 extends SuperException{
	MyException3() {};
	MyException3(String msg) { super(msg); }
	
}

class ThrowThreeException{
	void throwThree() throws MyException1,MyException2,MyException3 {
		throw new MyException1("Originates in MyExcpetion1");
		//throw new MyException2("Originates in MyExcpetion2");
		//throw new MyException3("Originates in MyExcpetion3");
	}
}

public class Exercise9 {
	
}
