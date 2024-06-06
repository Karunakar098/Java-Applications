package list;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		library.addBook(new Book("Java", "James Goslingh", "Technical10", 2005));
		library.addBook(new Book("Midnight Children", "Salman Rushdie", "Fiction", 2005));
		System.out.println("Retriving the book list from library");
		library.displayAllBooks();
	}

}
