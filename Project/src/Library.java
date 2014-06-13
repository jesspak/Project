import java.util.ArrayList; // JB
import java.io.Serializable;//JB
/**
 * one object of this class creates a library and has methods 
 * that adds, prints, deletes, and retrieves the data.
 */
public class Library implements Serializable{
	
	private ArrayList<Media> library;
	/**
	 * default constructor
	 *JP
	 */
	public Library(){
		library = new ArrayList<Media>();
	}
	/**
	 * adds a book to the library
	 * JB
	 */
	public void add(Media m){
		library.add(m);
	}
	
	/**
	 * sorts the all the entries in the list
	 * JP
	 */
	public void sort(){
		
	}

	/**
	 * takes in the media type as a parameter and searches
	 * the list of that same media type
	 * JP
	 */
	public Media retrieveByMedia(Media m){
		return new Media();//JB
	}
	/**
	 * takes in the title as a parameter and searches
	 * the list of that same title
	 * JP
	 */
	public Media retrieveByTitle(Media title){
		return new Media();//JB
	}
	/**
	 * takes in the media type and title as a parameter and searches
	 * the list of that same media type and title
	 * JP
	 */
	public Media retrieveByTitleAndMedia(Media tm){
		return new Media();//JB
	}
	/**
	 * deletes an entry from an ArrayList JB
	 */
	public void deleteEntry(){ // JP
		
	}
	/**
	 * 
	 */
	public String toString(){
		String result = " ";
		for(int i = 0; i < library.size(); i++)
			result += " " + library.get(i);
		return result;
	}
	
}
