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
		ArrayList<Media> bookList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if (library.get(i) instanceof Book){
				if (bookList.size() == 0) 
					bookList.add(library.get(i));
				else 
					for (int j = 0; j < bookList.size(); j++){
						if ((library.get(i).getTitle().compareTo(bookList.get(j).getTitle())) < 0){
							for (int g = bookList.size(); g > j; g--){
								if (g >= j){

										bookList.get(g) = bookList.size(bookList.size() - 1, g);
									
									}
								}
			bookList.add(j, library.get(i));
								
						}
					}
			}}
			

		ArrayList<Media> songList = new ArrayList<Media>();
		for (int i2=0; i2 < library.size(); i2++){
			if (library.get(i2) instanceof Song){
				songList.add(library.get(i2));
			}
		}

		ArrayList<Media> videoList = new ArrayList<Media>();
		for (int i3=0; i3 < library.size(); i3++){
			if(library.get(i3) instanceof Video){
				videoList.add(library.get(i3));
			}
		}

		ArrayList<Media> videoGameList = new ArrayList<Media>();
		for (int i4=0; i4< library.size(); i4++){
			if(library.get(i4)  instanceof VideoGame){
				videoGameList.add(library.get(i4));
			}
		}
		
		ArrayList<Media> sortedArrayList = new ArrayList<Media>();
			sortedArrayList.addAll(bookList);
			sortedArrayList.addAll(songList);
			sortedArrayList.addAll(videoList);
			sortedArrayList.addAll(videoGameList);
			
		library = sortedArrayList;

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
	
	
	public String retrieveByBook(){
		ArrayList<Media> bookList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instanceof Book){
				bookList.add(library.get(i));
			}
		}
		
		
		return toString(bookList);
	}
	
	public String retrieveBySong(){
		ArrayList<Media> songList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instanceof Song){
				songList.add(library.get(i));
			}
		}
		return toString(songList);
	}
	
	public String retrieveByVideo(){
		ArrayList<Media> videoList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instanceof Video){
				videoList.add(library.get(i));
			}
		}
		return toString(videoList);
	}
	
	public String retrieveByVideoGame(){
		ArrayList<Media> videoGameList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instanceof VideoGame){
				videoGameList.add(library.get(i));
			}
		}
		return toString(videoGameList);
	}
	
	/**
	 * takes in the title as a parameter and searches
	 * the list of that same title
	 * JP
	 */
	public String retrieveByTitle(String title){
		String curMedia = "";
		int i = 0;
		for (i = 0; i < library.size(); i++){
			curMedia = library.get(i).getTitle();
			if(curMedia == title){
				break;
			}
		}
		return curMedia;
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
	public String toString(ArrayList<Media> list){
		String finalList = "";
		for (int i = 0; i < list.size(); i++)
		finalList += list.get(i);
		return finalList;
	}
	
		}
