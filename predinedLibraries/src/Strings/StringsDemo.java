package Strings;

public class StringsDemo {

	public static void main(String[] args) {

		// String literals
		String myString1 = "CodeGnan";
		String myString2 = "Codegnan";

		// reference comparision
		System.out.println(myString1 == myString2); // false

		// content comparision
		System.out.println(myString1.equals(myString2)); // false

		// using a newe keyword
		String myString3 = new String("CodeGnan");
		String myString4 = new String("CodeGnan");

		System.out.println(myString3 == myString4); // false

	}

}
