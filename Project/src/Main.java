import java.util.ArrayList;

/**
 * The creates a Media list and adds, deletes, change, and search the various
 * media types stored in the list.//JP
 */

public class Main {// JP
	private static GUI gui;//JB
	private static Library ourLibrary;//JB
	/**
	 * gets user input from the view and sets its values to  
	 * a new Book object and adds it to the library
	 */
	public static void gotNewBook(String authorInput, String title, 
			String format, String location, String notes){	
		Book newBook = new Book(authorInput, title, 
				format,location, notes);
		ourLibrary.add(newBook);
	}
	/**
	 * gets user input from the view and sets its values to  
	 * a new Song object and adds it to the library
	 */
	public static void gotNewSong(String artistInput, String title, String genre, 
			String format, String location, String notes){
		Song newSong = new Song(artistInput, title, genre, 
				format, location, notes);
		ourLibrary.add(newSong);
	}
	/**
	 * gets user input from the view and sets its values to  
	 * a new Video object and adds it to the library
	 */
	public static void gotNewVideo(String starInput, String title, 
			String format, String location, String notes){
		Video newVideo = new Video(starInput, title, format, location, notes);
		ourLibrary.add(newVideo);
	}
	/**
	 * gets user input from the view and sets its values to  
	 * a new VideoGame object and adds it to the library
	 */
	public static void gotNewVideoGame(String title, 
			String format, String location, String notes){
		VideoGame newVideoGame = new VideoGame(title, format, location, notes);
		ourLibrary.add(newVideoGame);
	}
	/**
	 * calls the Library's toString() and returns the entire 
	 * library to the view to be printed out.
	 * @return
	 */
	public static String printLibrary(){
		return ourLibrary.toString();
	}
	/**
	 * calls the library's retrieve by title function
	 * @param args
	 */
	public static String searchTitle(String title){
		return ourLibrary.retrieveByTitle(title);
	}
	/**
	 * calls the library's retrieve by media function
	 * @param args
	 */
	public static String searchMedia(String media){
		return ourLibrary.retrieveByTitle(media);
	}
	/**
	 * calls the library's retrieve by title function
	 * @param args
	 */
	public static String searchBoth(String title, String media){
		return ourLibrary.retrieveByTitleAndMedia(title, media);
	}
	/**
	 * calls the library's retrieve by title, media, or both function
	 * then deletes the specific entry.
	 */
	public static void deleteByTitle(String title){
		ourLibrary.deleteEntryByTitle(title);
	}
	/**
	 * our main function
	 * @param args
	 */
	public static void main(String[] args) {
		gui = new GUI();
		ourLibrary = new Library();
	}

}

