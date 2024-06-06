package MethodReference;

interface Sayable {
	void say();
}

public class ReferenceStaticDemo {

	public static void saySomething() {
		System.out.println("Hello, this is static method");
	}

	public static void main(String[] args) {
		Sayable s1 = ReferenceStaticDemo::saySomething;
		s1.say();

	}

}
