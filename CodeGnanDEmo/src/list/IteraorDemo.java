package list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteraorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<>();
		ArrayList<String> marks1 = new ArrayList<>();
		marks.add(30);
		marks.add(20);
		marks.add(70);
		marks.add(50);
		marks1.add("welcome");
		System.out.println("before retriving data : " + marks + " " + marks1);
		// using iterator
		Iterator<Integer> iterator = marks.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
