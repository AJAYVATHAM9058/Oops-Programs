// Write a Java program to create a class called "Book" 
//with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book("ACCIDENTS DO NOT HAPPEN","Dr Sankar Rajeev","978-81-933904-8-1");
		Book book2 = new Book("PROPAGATION OF GLORY LILY","Dr S Anandhi","978-81-933904-6-7");
		Book.addBook(book1);
		Book.addBook(book2);
		
		ArrayList<Book> bookCollection = Book.getCollection();
		
		System.out.println("List of books ");
		for(Book b : bookCollection) {
			System.out.println("Name : "+b.getTitle()+",  Author : "+b.getAuthor()+", ISBN : "+b.getIsbn());
		}
		
		Book.removeBook(book1);
		System.out.println("After removing Book, \ntitle : "+book1.getTitle()+" , author : "+book1.getAuthor()+"  ISBN : "+book1.getIsbn());
		
		System.out.println("List of Books ");
		for(Book b : bookCollection) {
			System.out.println("Name : "+b.getTitle()+",  Author : "+b.getAuthor()+", ISBN : "+b.getIsbn());
		}
		
		
		
	}

}
