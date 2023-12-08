import java.util.*;
public class Movie {

	private String title,director;
	private ArrayList<String> actors;
	private ArrayList<Review> reviews;
	
	public Movie(String title,String director,ArrayList<String> actors){
		this.title = title;
		this.director = director;
		this.actors = actors;
		reviews = new  ArrayList<Review>();
	}
	
	public ArrayList<Review> getReviews(){
		return this.reviews;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void addReview(Review review) {
		reviews.add(review);
	}
	
	public ArrayList<String> getActors() {
		return this.actors;
	}
	
	public String getDirector() {
		return this.director;
	}
	
}
