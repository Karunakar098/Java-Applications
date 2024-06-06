package list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		//push - adding or insert
		//pop - returns and removing from the top element
		// peek - returns the top element without removing
		Stack<String> bookStack = new Stack<>();
		bookStack.push("Java");
		bookStack.push("C");
		bookStack.push("C++");
		bookStack.push("C#");
		bookStack.push("Python"); // top element LIFO last in first out
		System.out.println(bookStack);
		
		//popping the top element from the stack
		String poppedBook = bookStack.pop();
		System.out.println(poppedBook);
		System.out.println(bookStack);
		
		//peak
		System.out.println(bookStack.peek());
		
		// particular search element
		System.out.println(bookStack.search(bookStack.peek()));
		
		//clear 
		// bookStack.clear();
		// System.out.println(bookStack);
	}

}
