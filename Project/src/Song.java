import java.io.Serializable;//JB

/**
 * One object of class Song stores the information of one song. One song
 * consists of the information of the artist, song title, genre, format,
 * location, and notes//JP
 */

public class Song extends Media implements Serializable {// JB
	private String songArtist;// JP
	private String songGenre;// JP

	/**
	 * default constructor//JP
	 */

	public Song() {// JP
		super();// JP
	}

	/**
	 * parameterized constructor//JP
	 */

	public Song(String newSongArtist, String newSongTitle, String newSongGenre,
			String newSongFormat, String newSongLocation, String newSongNotes) {// JP
		super();// JP
	}

	/**
	 * returns the current value of songArtist//JP
	 */

	public String getSongArtist() {// JP
		return songArtist;// JP
	}

	/**
	 * returns the current value of songGenre//JP
	 */

	public String getSongGenre() {// JP
		return songGenre;// JP
	}

	/**
	 * sets the value of songArtist to newSongArtist//JP
	 * @param newSongArtist
	 */

	public void setSongArtist(String newSongArtist) {// JP
		songArtist = "Song Artist";// JP
	}

	/**
	 * sets the value of songGenre to newSongGenre//JP
	 * @param newSongGenre           JP
	 */

	public void setSongGenre(String newSongGenre) {// JP
		songGenre = "Song Genre";// JP
	}

	/**
	 * Returns a String containing all the data stored //JP in this object.
	 */
	public String toString() {// JB
		return "Song:" + "\n" + this.getSongArtist() + "\n"// JB
				+ this.getSongGenre() + "\n" + super.toString();// JB
	}

}