package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkedList marksList = new LinkedList();
		List<Integer> marksList = new LinkedList<>();
		marksList.add(45);
		marksList.add(50);
		marksList.add(87);
		System.out.println(marksList);
		marksList.remove(1);
		System.out.println(marksList);
		
		// using iterator 
		Iterator<Integer> it = marksList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
