package Comparators;

import java.util.Comparator;

public class AgeComaparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {

	/*	if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else {
			return -1;
		} */
		return Integer.compare(s1.getAge(), s2.getAge());

	}

}
