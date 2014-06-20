import java.util.ArrayList; // JB
import java.util.Collection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;//JB

/**
 * one object of this class creates a library and has methods that adds, prints,
 * deletes, and retrieves the data.
 */
public class Library implements Serializable  {
	
//	static File MasterDB_F = new File ("library.db");

	private ArrayList<Media> library;

	/**
	 * default constructor JP
	 */
	public Library() {

	}
	
	/**
	 * Loads object ContactList from file and returns it to the variable.
	 * @author TB
	 */
//	public static Library loadFromDisk() {
//		Library library = null;
//		System.out.println("Checking for previously saved library.");
//		try {
//			FileInputStream inFile = new FileInputStream("library");
//			ObjectInputStream inObject = new ObjectInputStream(inFile);
//			library = (Library) inObject.readObject();
//			inFile.close();
//			inObject.close();
//			System.out.println("**Library found and loaded**\n");
//		} 
//		catch (IOException ioe) {
//			System.out.println("Error reading from the file: " + ioe.getMessage());
//		} 
//		catch (ClassNotFoundException cnfe) {
//			System.out.println("Error in casting to Library: " + cnfe);
//		}
//		return library;
//	}
//	
//	/**
//	 * Saves object Library to the file.
//	 * @author TB
//	 */
//	public static void saveToDisk(Media library) {
//		try {
//			FileOutputStream outFileStream = new FileOutputStream("library");
//			ObjectOutputStream outObjectStream= new ObjectOutputStream(outFileStream);
//			outObjectStream.writeObject(library);
//			outFileStream.close();
//			outObjectStream.close();
//			System.out.println("Entry successfully saved to file");
//		} 
//		catch (IOException anIOException) {   
//		    System.out.println(anIOException);
//		}
//	}

	

	
	/**
	 * adds a form of media to the library TB
	 */
	public void add(Media m) {
		library.add(m);
		
//	    saveToDisk(m);
	}

	/**
	 * sorts the all the entries in the list TB
	 */
	


	/**
	 * takes in the media type as a parameter and searches the list of that same
	 * media type TB
	 */
	// public Media retrieveByMedia(Media m){
	// int i= 0;
	// Media curMedia;
	// for (i = 0; i < library.size(); i++){
	// curMedia = library.get(i);
	// if(curMedia == title){
	// break;
	// }
	// }
	// return curMedia;

	/**
	 * prints all entries in library
	 * @return library
	 */
	
	public String printLibrary(){
		return library.toString();
	}
	
	/**
	 * displays list of entries by media type TB
	 * @param type
	 */
	public void retriveByMedia(String type){

		if (type == "books")
			searchInBooks();
		else if (type == "songs")
			searchInSongs();
		else if (type == "videos")
			searchInVideos();
		else if (type == "video games")
			searchInVideogames();
		
	}
	/**
	 * displays list of book entries TB
	 * @return books 
	 */

	public String searchInBooks() {
		String result = "";
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i) instanceof Book) {
				result += library.get(i).toString();
			}
		}
		return result;
	}
	
	/**
	 * displays list of entries in songs TB
	 * @return songs 
	 */

	public String searchInSongs() {
		String result = "";
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i) instanceof Song) {
				result += library.get(i).toString();
			}
		}
		return result;
	}
	
	/**
	 * displays list of video entries TB
	 * @return videos 
	 */

	public String searchInVideos() {
		String result = "";
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i) instanceof Video) {
				result += library.get(i).toString();
			}
		}
		return result;
	}
	
	/**
	 * displays list of video game entries TB
	 * @return video games 
	 */

	public String searchInVideogames() {
		String result = "";
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i) instanceof VideoGame) {
				result += library.get(i).toString();
			}
		}
		return result;
	}

	/**
	 * takes in the title as a parameter and searches the list of that same
	 * title TB
	 */
	public String retrieveByTitle(String title) {
		String curMedia = "";
		int i = 0;
		for (i = 0; i < library.size(); i++) {
			curMedia = library.get(i).getTitle();
			if (curMedia == title) {
				curMedia = library.get(i).toString();
			}
		}
		return curMedia;
		
	}

	/**
	 * takes in the media type and title as a parameter and searches the list of
	 * that same media type and title TB
	 * @param m
	 * @return Media
	 */
	public String retrieveByTitleAndMedia(String mediaType, String title) {
		String curMedia = "";
		int i = 0;
		for (i = 0; i < library.size(); i++) {
			curMedia = library.get(i).getTitle();
			if (curMedia == title && library.get(i).isInstanceOfClass(mediaType) == true) {
				curMedia = library.get(i).toString();
			}
		}
		return curMedia;
	}

	/**
	 * deletes entry from library TB
	 * @param title
	 * @param mediaType
	 */
	public void deleteEntryByTitleAndMediaType(String title, String mediaType) { // JP
				library.remove(retrieveByTitleAndMedia(mediaType, title));
			}
	
	/**
	 * deletes entry from library TB
	 * @param title
	 */
	public void deleteEntryByTitle(String title){
		retrieveByTitle(title);
	}
	
	

	/**
	 * Returns a string containing all the data stored in this object TB
	 */
	public String toString(){
		String result = " ";
		for(int i = 0; i < library.size(); i++)
			result += " " + library.get(i);
		return result;
	}




		
	}

