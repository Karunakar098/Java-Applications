package Comparators;

import java.util.Comparator;

public class RollComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		
		return Integer.compare(s1.getRollNo(), s2.getRollNo());
	}

}
