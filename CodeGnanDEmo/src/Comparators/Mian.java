package Comparators;

import java.util.ArrayList;
import java.util.Collections;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> a1 = new ArrayList<>();
		a1.add(new Student(101, "Vijay", 23));
		a1.add(new Student(106, "Ajay", 27));
		a1.add(new Student(105, "Jai", 21));
		System.out.println("sorting by name :  ");
		Collections.sort(a1, new NameComparator());
		System.out.println(a1);
		System.out.println();
		System.out.println("sorted by age");
		Collections.sort(a1, new AgeComaparator());
		System.out.println(a1);
		System.out.println();
		System.out.println("sorted by roll no");
		Collections.sort(a1, new RollComparator());
		System.out.println(a1);

	}

}
