/* Write a Java program to create a class called "Library" with a collection of books
 *  and methods to add and remove books. */

public class main6 {

	public static void main(String args[]) {
		
		Book1 book1 = new Book1("Rich Dad Poor Dad","Robert T kiyosaki",350);
		Book1 book2 = new Book1("Game of Thrones","George R R Mart in",1500);
		Book1 book3 = new Book1("Wings Of Fire","APJ Abdul Kalam",250);
		Library library = new Library();
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		System.out.println("\nBooks in the library are ");
		for(Book1 b: library.getArrayBooks()) {
			System.out.println(b.getTitle()+"  | "+b.getAuthor()+" | "+b.getPrice());
		}
		
		library.removeBook(book2);
		
		System.out.println("\nAfter removing "+book2.getTitle()+"\n Available Books are ");
		for(Book1 b:library.getArrayBooks()) {
			System.out.println(b.getTitle()+"  | "+b.getAuthor()+"  | "+b.getPrice());
		}
		
		
	}
}
