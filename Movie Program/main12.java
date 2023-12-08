
/*  Write a Java program to create a class called "Movie" 
 * with attributes for title, director, actors, and reviews, and 
 * methods for adding and retrieving reviews. */

import java.util.ArrayList;
import java.util.Arrays;

public class main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> actors = new ArrayList<String>();
		actors.add("Ranbir Kapoor");
		actors.add("Rashmika Mandanna");
		actors.add("Bobby Deol");
		actors.add("Tripti Dimri");
		
		Movie movie1 = new Movie("Animal","Sandeep Reddy Vanga",actors);
		
		
		Review rev1 = new Review("Excellent Movie","Ajay",4.5);
		Review rev2 = new Review("Good Movie","Anil",3.5);
		Review rev3 = new Review("Average movie","Sai Kumar",3.0);
		Review rev4 = new Review("Excellent Movie","Leo Das",4.0);
		Review rev5 = new Review("Not a family oriented movie","Tejaravi",4.5);
		Review rev6 = new Review("BlockBuster","Naveen",5.0);
		
		movie1.addReview(rev1);
		movie1.addReview(rev2);
		movie1.addReview(rev3);
		movie1.addReview(rev4);
		movie1.addReview(rev5);
		movie1.addReview(rev6);
		
		System.out.println("Reviews for "+movie1.getTitle()+" are : ");
		for(Review rev : movie1.getReviews()) {
			System.out.println(rev.getReviewText()+"  by  "+rev.getReviewerName()+" - "+rev.getRating());
		}
		System.out.println("\ncast and Crew for "+movie1.getTitle());
		for(String str:movie1.getActors()) {
			System.out.print(str+" ");
		}
		System.out.println("\n--Directed By "+movie1.getDirector());
	
	}

}
