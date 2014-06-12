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
		Arraylist<Media> bookList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instaceof Book.getClass()){
				bookList.add(library.get(i));
			}
		}

		Arraylist<Media> songList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instaceof Song.getClass()){
				sonList.add(library.get(i));
			}
		}

		Arraylist<Media> videoList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instaceof Video.getClass()){
				videoList.add(library.get(i));
			}
		}

		Arraylist<Media> videoGameList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instaceof VideoGame.getClass()){
				videoGameList.add(library.get(i));
			}
		}
		
		Arraylist<Media> sortedArrayList = new ArrayList<Media>();

	}

	/**
	 * takes in the media type as a parameter and searches
	 * the list of that same media type
	 * JP
	 */
	// public Media retrieveByMedia(Media m){
	// 	int i= 0;
	// 	Media curMedia;
	// 	for (i = 0; i < library.size(); i++){
	// 		curMedia = library.get(i);
	// 		if(curMedia == title){
	// 			break;
	// 		}
	// 	}
	// 	return curMedia;
	}
	
	public Media retrieveByBook(){
		Arraylist<Media> mediaList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instaceof Book.getClass()){
				mediaList.add(library.get(i));
			}
		}
		return mediaList;
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
	public void deleteEntry(Media title){ // JP
		int i = 0;
		for (i = 0; i < library.size(); i++){
			Media curMedia = library.get(i);
			if(curMedia == title){
				break;
			}
		}
		library.remove(i);
	}
	/**
	 * 
	 */
	public String toString(){
		return null;
	}
	
}
