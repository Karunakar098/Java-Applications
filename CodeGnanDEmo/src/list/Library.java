package list;

import java.util.ArrayList;

public class Library {
	 
	ArrayList<Book>books;
	 Library() {
		books = new ArrayList<>();
	}
	 public void addBook(Book book) {
		// books=new ArrayList<>();
		 books.add(book);
	 }
	 public void displayAllBooks() {
		 if(books.isEmpty())
		 {
			 System.out.println("No Books in the Library");
		 }
		 else {
			 System.out.println("Books List in the Library");
			 for(Book book : books) {
				 System.out.println(book);
			 }
		 }
	 }
	 

}
