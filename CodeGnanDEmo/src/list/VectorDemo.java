package list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<>();
		vector.add("Raj");
		vector.add("Sam");
		for(String name : vector) {
			System.out.println(name);
		}
		System.out.println("Iterator using Enumeration :");
		
		// using enumeration
		Enumeration<String> enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}
