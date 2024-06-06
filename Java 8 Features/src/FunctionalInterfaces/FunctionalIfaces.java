package FunctionalInterfaces;
@FunctionalInterface
interface FunctionalIfaces {
	
	public void doSomething();
	
	//public void test(); // here functional interface use only one abstract class excecuted remaining methods are not accepted
	
	// default methods  here no of default and static methods are accepted in funtional interface
 	// static methods
	
	default void myDefaultMethod() {
		System.out.println("this is my default method");
	}
	static void myStaticMethod() {
		System.out.println("this is my static method");
	}

}
