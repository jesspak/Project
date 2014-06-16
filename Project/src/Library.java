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
		for (int i2=0; i2 < library.size(); i2++)
		{
			if (library.get(i2) instanceof Song)
			{
				if (songList.size() == 0) 
				songList.add(library.get(i2));
			else
				for (int j2 = 0; j2 < songList.size(); j2++)
				{
					if ((library.get(i2).getTitle().compareTo(songList.get(j2).getTitle())) < 0)
					{
						songList.add(j2, library.get(i2));
						break;
					}
						else
							songList.add(library.get(i2));

				}

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
		}


	/**
	 * takes in the media type as a parameter and searches the list of that same
	 * media type JP
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

	public String retriveByMedia(String type){

		if (type == "books")
			searchInBooks();
		else if (type == "songs")
			searchInSongs();
		else if (type == "videos")
			searchInVideos();
		else if (type == "video games")
			searchInVideogames();
		return null;
	}

	public String searchInBooks() {
		ArrayList<Media> bookList = new ArrayList<Media>();
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i) instanceof Book) {
				bookList.add(library.get(i));
			}
		}

		return bookList.toString();
	}

	public String searchInSongs() {
		ArrayList<Media> songList = new ArrayList<Media>();
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i) instanceof Song) {
				songList.add(library.get(i));
			}
		}
		return songList.toString();
	}

	public String searchInVideos() {
		ArrayList<Media> videoList = new ArrayList<Media>();
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i) instanceof Video) {
				videoList.add(library.get(i));
			}
		}
		return videoList.toString();
	}

	public String searchInVideogames() {
		ArrayList<Media> videoGameList = new ArrayList<Media>();
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i) instanceof VideoGame) {
				videoGameList.add(library.get(i));
			}
		}
		return videoGameList.toString();
	}

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
	public void deleteEntry(Media title) { // JP
		int i = 0;
		for (i = 0; i < library.size(); i++) {
			Media curMedia = library.get(i);
			if (curMedia == title) {
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
	    for (int i = 0; i < library.size(); i++) {
	        result += " " + library.get(i);
	    }
	    return result;
	}
}

