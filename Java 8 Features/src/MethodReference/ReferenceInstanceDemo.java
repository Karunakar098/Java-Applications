package MethodReference;

@FunctionalInterface
interface Sayable1 {
	public void say();
}

public class ReferenceInstanceDemo {

	public void saySomething() {
		System.out.println("Hello, this is non-static method");
	}

	public void doSomething() {
		System.out.println("Using doSomething  method ");
	}

	public static void main(String[] args) {
		Sayable1 s1 = () -> System.out.println("using Lambda function ");
		s1.say();

		// using method references
		ReferenceInstanceDemo rd = new ReferenceInstanceDemo();
		Sayable1 s2 = rd::saySomething;
		Sayable1 s3 = rd::doSomething;
		s2.say();
		s3.say();
	}

}
