import java.io.Serializable;//JB

/**
 * One object of class Song stores the information of one song. One song
 * consists of the information of the artist, song title, genre, format,
 * location, and notes//JP
 */

public class Song extends Media implements Serializable {// JB
	private String artist;// JP
	private String genre;// JP

	/**
	 * default constructor//JP
	 */

	public Song() {// JP
		super();// JP
		
		this.artist = "artist";
		this.genre = "genre";
	}

	/**
	 * parameterized constructor//JP
	 */

	public Song(String artist, String title, String genre,
			String format, String location, String notes) {// JP
		super(title, format, location, notes);// JP
		
		this.artist = artist;
		this.genre = genre;
	}

	/**
	 * returns the current value of artist//JP
	 */

	public String getArtist() {// JP
		return artist;// JP
	}

	/**
	 * returns the current value of genre//JP
	 */

	public String getGenre() {// JP
		return genre;// JP
	}

	/**
	 * sets the value of songArtist to newSongArtist//JP
	 * @param newSongArtist
	 */

	public void setArtist(String artist) {// JP
		this.artist = artist;// JP
	}

	/**
	 * sets the value of songGenre to newSongGenre//JP
	 * @param newSongGenre           JP
	 */

	public void setGenre(String genre) {// JP
		this.genre = genre;// JP
	}

	/**
	 * Returns a String containing all the data stored //JP in this object.
	 */
	public String toString() {// JB
		return "Song:" + "\n" + this.getArtist() + "\n"// JB
				+ this.getGenre() + "\n" + super.toString();// JB
	}

}
