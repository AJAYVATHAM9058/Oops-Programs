import java.util.*;
public class Book {
	
		private String title,author;
		private String ISBN;
		private static ArrayList<Book> bookCollection = new ArrayList<Book>();
		
		Book(String title,String author,String ISBN){
			this.title = title;
			this.author = author;
			this.ISBN = ISBN;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public void setAuthor(String author) {
			this.author = author;
		}
		
		
		public String getIsbn() {
			return ISBN;
		}
		
		public void setIsbn(String ISBN) {
			this.ISBN = ISBN;
		}
		
		public static void addBook(Book B) {
			bookCollection.add(B);
		}
		
		public static void removeBook(Book b) {
			bookCollection.remove(b);
		}
	
		public static ArrayList<Book> getCollection(){
			return bookCollection;
		}
		
}
