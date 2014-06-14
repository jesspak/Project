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

<<<<<<< HEAD
	public Song(artist, genre, title, format, location, notes) {// JP
		super(title, format, location, notes);// JP
		
		setArtist(artist);
		setGenre(genre);
=======
	public Song() {// JP
		super();// JP
		artist = "Artist";
		genre = "Genre";
>>>>>>> origin/jess
	}

	/**
	 * parameterized constructor//JP
	 */

	public Song(String newArtist, String newTitle, String newGenre,
			String newFormat, String newLocation, String newNotes) {// JP
		super(newTitle, newFormat, newLocation, newNotes);// JP
		artist = newArtist;
		genre = newGenre;
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

	public void setArtist(String newArtist) {// JP
		artist = newArtist;// JP
	}

	/**
	 * sets the value of songGenre to newSongGenre//JP
	 * @param newSongGenre           JP
	 */

	public void setGenre(String newGenre) {// JP
		genre = newGenre;// JP
	}

	/**
	 * Returns a String containing all the data stored //JP in this object.
	 */
	public String toString() {// JB
		return "\t" + "Song:" + "\n" + "Artist: " + this.getArtist() + "\n"// JB
				+ "Genre: " + this.getGenre() + "\n" + super.toString();// JB
	}

}
