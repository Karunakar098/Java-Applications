package Strings;

public class StringImmutableDemo {

	public static void main(String[] args) {

		String myString = "CodeGnan";
		myString.concat("Hyderabad"); // a new string object
		System.out.println(myString);

		// StringBuilder
		StringBuilder institute = new StringBuilder("CodeGnan");
		institute.append(" hyderabad");
		System.out.println(institute);

		// stringBuffer
		StringBuffer strBuffer = new StringBuffer("Hello ");
		strBuffer.append("world ");
		strBuffer.append("Welecome to new world!");
		System.out.println(strBuffer);

		System.out.println("CodeGnan \"is\" : " + strBuffer);
	}

}
