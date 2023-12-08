import java.util.ArrayList;
import java.util.Random;


public class MusicLibrary {

	private ArrayList<Song> songs;
	public MusicLibrary() {
		songs = new ArrayList<Song>();
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
	public void removeSong(Song song) {
		songs.remove(song);
	}
	
	public ArrayList<Song> getSongs(){
		return songs;
	}
	
	public void playRandomSong() {
		int size = songs.size();
		if(size==0) {
			System.out.println("No songs in the library");
			return;
		}
		Random rn = new Random();
		int index = rn.nextInt(size);
		System.out.println("Now Playing "+songs.get(index).getTitle()+"  by "+songs.get(index).getArtist());
	}
	
	public void printSongs() {
		System.out.println("Available Songs are : ");
		for(Song ar: songs) {
			System.out.println(ar.getTitle()+"  by artist "+ar.getArtist());
		}
	}
}
