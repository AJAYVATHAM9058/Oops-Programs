/* Write a Java program to create a class called "MusicLibrary" with a 
 * collection of songs and methods to add and remove songs, and to play a random song. */

import java.util.ArrayList;

public class main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MusicLibrary ml = new MusicLibrary();
		
		 Song song1 = new Song("Jai Ho ","AR Rahman");
		 Song song2 = new Song("Enno Rathrulasthayi kani","Ilayaraja");
		 Song song3 = new Song("Vidhata thalapuna","Siri Vennela Sitharamasastri");
		 Song song4 = new Song("Jamol Jamolu","Bobby Deol");
		 Song song5 = new Song("Chinni chinni aasha","Arjith Singh");
		 
		 ml.addSong(song1);
		 ml.addSong(song2);
		 ml.addSong(song5);
		 ml.addSong(song3);
		 ml.addSong(song4);
		 
		 ArrayList<Song> songs = new ArrayList<Song>();
		 songs = ml.getSongs();
		 
		 for(Song ar:ml.getSongs()) {
			 System.out.println(ar.getTitle()+" by "+ar.getArtist());
		 }
		 
		 System.out.println("No of Songs available in Library : "+songs.size());
		 
		 ml.printSongs();
		 
		 System.out.println("Playing Random Song ");
		 ml.playRandomSong();
		 ml.playRandomSong();
		 
		 ml.removeSong(song5);
		 ml.playRandomSong();
		 ml.playRandomSong();
		 
	}

}
