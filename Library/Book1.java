
public class Book1 {

	private String title,author;
	private int price;
	
	public Book1(String title,String author,int price) {
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
