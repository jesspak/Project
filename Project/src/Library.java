import java.util.ArrayList; // JB
import java.io.Serializable;//JB

/**
 * one object of this class creates a library and has methods that adds, prints,
 * deletes, and retrieves the data.
 */
public class Library implements Serializable {

	private ArrayList<Media> library; 

	/**
	 * default constructor JP
	 */
	public Library() {
		library = new ArrayList<Media>();
	}

	/**
	 * adds a book to the library JB
	 */
	public void add(Media m) {
		library.add(m);
	}

	/**
	 * sorts the all the entries in the list JP
	 */
	public void sort(){
<<<<<<< HEAD
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

=======
		ArrayList<Media> bookList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++)
		{
			if (library.get(i) instanceof Book)
			{
				if (bookList.size() == 0) 
					bookList.add(library.get(i));
				else 
					for (int j = 0; j < bookList.size(); j++)
					{
						if ((library.get(i).getTitle().compareTo(bookList.get(j).getTitle())) < 0)
						{
							bookList.add(j, library.get(i));
							break;
						}
						else
							bookList.add(library.get(i));

					}
			}
		}
		
		ArrayList<Media> songList = new ArrayList<Media>();
		for (int i=0; i < library.size(); i++)
			if (library.get(i) instanceof Song)
			{
				if (songList.size() == 0) 
				songList.add(library.get(i));
			else
				for (int j = 0; j < songList.size(); j++)
				{
					if ((library.get(i).getTitle().compareTo(songList.get(j).getTitle())) < 0)
					{
						songList.add(j, library.get(i));
						break;
					}
						else
							songList.add(library.get(i));

				}

			}


		ArrayList<Media> videoList = new ArrayList<Media>();
		for (int i3=0; i3 < library.size(); i3++)
		{
			if(library.get(i3) instanceof Video)
			{
				if (videoList.size() == 0) 
					videoList.add(library.get(i3));
				else
					for (int j3 = 0; j3 < videoList.size(); j3++)
					{
						if ((library.get(i3).getTitle().compareTo(videoList.get(j3).getTitle())) < 0)
						{
							videoList.add(j3, library.get(i3));
							break;
							
						}
						else
							videoList.add(library.get(i3));
					}
			}
		}

		ArrayList<Media> videoGameList = new ArrayList<Media>();
		for (int i4=0; i4< library.size(); i4++)
		{
			if(library.get(i4)  instanceof VideoGame)
			{
				if (videoGameList.size() == 0) 
					videoGameList.add(library.get(i4));
				else
					for (int j4 = 0; j4 < videoGameList.size(); j4++)
					{
						if ((library.get(i4).getTitle().compareTo(videoGameList.get(j4).getTitle())) < 0)
						{
							videoGameList.add(j4, library.get(i4));
							break;
						}
						else
							videoGameList.add(library.get(i4));
					}
			}
		}

		ArrayList<Media> sortedArrayList = new ArrayList<Media>();
			sortedArrayList.addAll(bookList);
			sortedArrayList.addAll(songList);
			sortedArrayList.addAll(videoList);
			sortedArrayList.addAll(videoGameList);

		library = sortedArrayList;
>>>>>>> origin/jess
	}
	/**
	 * searches within the Book media type
	 * @return
	 */
	public String searchInBooks() {
		ArrayList<Media> bookList = new ArrayList<Media>();
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i) instanceof Book) {
				bookList.add(library.get(i));
			}
		}

		return bookList.toString();
	}
	/**
	 * searches within the song media type
	 * @return
	 */
	public String searchInSongs() {
		ArrayList<Media> songList = new ArrayList<Media>();
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i) instanceof Song) {
				songList.add(library.get(i));
			}
		}
		return songList.toString();
	}
	/**
	 * searches with in the video media type
	 * @return
	 */
<<<<<<< HEAD
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
		Arraylist<Media> bookList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instaceof Book.getClass()){
				bookList.add(library.get(i));
			}
		}
		return bookList;
	}
	
	public Media retrieveBySong(){
		Arraylist<Media> songList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instaceof Song.getClass()){
				songList.add(library.get(i));
			}
		}
		return songList;
	}
	
	public Media retrieveByVideo(){
		Arraylist<Media> videoList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instaceof Video.getClass()){
				videoList.add(library.get(i));
			}
		}
		return videoList;
	}
	
	public Media retrieveByVideoGame(){
		Arraylist<Media> videoGameList = new ArrayList<Media>();
		for (int i=0; i< library.size(); i++){
			if(library.get(i) instaceof VideoGame.getClass()){
				videoGameList.add(library.get(i));
			}
		}
		return videoGameList;
=======
	public String searchInVideos() {
		ArrayList<Media> videoList = new ArrayList<Media>();
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i) instanceof Video) {
				videoList.add(library.get(i));
			}
		}
		return videoList.toString();
>>>>>>> origin/jess
	}
	
	/**
	 * searches within the videogame media type
	 * @return
	 */
<<<<<<< HEAD
	public Media retrieveByTitle(Media title){
		int i = 0;
		for (i = 0; i < library.size(); i++){
			Media curMedia = library.get(i);
			if(curMedia == title){
				break;
			}
		}
		return library(i);
=======
	public String searchInVideogames() {
		ArrayList<Media> videoGameList = new ArrayList<Media>();
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i) instanceof VideoGame) {
				videoGameList.add(library.get(i));
			}
		}
		return videoGameList.toString();
>>>>>>> origin/jess
	}
	/**
	 * retrieves a media type according to the media type
	 * that was sent in through the parameter
	 */
	/** 
	public String retriveByMedia(String type){
		if (type == "book" || type == "Book")
				searchInBooks();
		else if (type == "song" || type == "Song")
			searchInSongs();
		else if (type == "video" || type == "Video")
			searchInVideos();
		else if (type == "video game" || type == Video Game)
			searchInVideogames();
	}
	*/
	/**
	 * takes in the title as a parameter and searches the list of that same
	 * title JP
	 */
	public String retrieveByTitle(String title) {
		String curMedia = "";
		int i = 0;
		for (i = 0; i < library.size(); i++) {
			curMedia = library.get(i).getTitle();
			if (curMedia == title) {
				break;
			}
		}
		return curMedia;
	}

	/**
	 * takes in the media type and title as a parameter and searches the list of
	 * that same media type and title JP
	 */
	public Media retrieveByTitleAndMedia(Media tm) {
		return new Media();// JB
	}

	/**
	 * deletes an entry from an ArrayList JB
	 */
<<<<<<< HEAD
	public void deleteEntry(Media title){ // JP
		int i = 0;
		for (i = 0; i < library.size(); i++){
			Media curMedia = library.get(i);
			if(curMedia == title){
=======
	public void deleteEntry(Media title) { // JP
		int i = 0;
		for (i = 0; i < library.size(); i++) {
			Media curMedia = library.get(i);
			if (curMedia == title) {
>>>>>>> origin/jess
				break;
			}
		}
		library.remove(i);
	}
	/**
	 * Returns a string containing all the data stored in this object JP
	 */
	public String toString(){
		String result = " ";
		for(int i = 0; i < library.size(); i++)
			result += " " + library.get(i);
		return result;
	}
	
}
