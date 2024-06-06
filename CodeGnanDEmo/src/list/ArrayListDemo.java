package list;

import java.util.ArrayList;
// import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Decleration
		 ArrayList<Integer> mylist = new ArrayList<>();
		// List mylist = new ArrayList();
		// ArrayList<String>mylist = new ArrayList<String>();
		
		// adding data into arraylist
		mylist.add(100);
		// mylist.add(10.5);
		// mylist.add("welcome");
		// mylist.add('A');
		// mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//size of arraylist
		System.out.println("size of an arraylist : "+mylist.size());
		
		//printing arraylist
		System.out.println("printing data from arraylist : "+mylist);
		
		//remove element from arraylist
		mylist.remove(5); // 5 is an index of element
		System.out.println("after removing element : "+mylist);
		
		//insert element in the arraylist
		// mylist.add(2,"Java");
		// System.out.println("After inserting : "+ mylist);
		
		//modify element in arraylist(modify/replace/change)
		// mylist.set(2, "python");
		// System.out.println("after replacing : "+mylist);
		
		// access specific element from arraylist
		System.out.println(mylist.get(3));
		
		//*****reading all the elements from arraylist
		
		// 1) using normal form
		 /* for(int i=0; i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		} */
		
		//2) using fdor each lop
		for(Object x: mylist) {
			System.out.println(x);
		} 
		
		//3) using iterator
		 /* Iterator it = mylist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		} */
		
		// checking arraylist is empty or not
		// System.out.println(mylist.isEmpty());
		System.out.println("Is arraylist empty? "+mylist.isEmpty());
		
		//remove all the elements from arraylist
		/* ArrayList mylist2 = new ArrayList();
		mylist2.add("a");
		mylist2.add("b");
		mylist2.add("x");
		System.out.println(mylist2);
		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements : "+mylist); */
		
		//remove all the elements / clear
		// mylist.clear();
		// System.out.println("Is arraylist empty? "+mylist.isEmpty());
		
		
	}
	

}
