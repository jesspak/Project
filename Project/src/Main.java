import java.util.ArrayList;

/**
 * The creates a Media list and adds, deletes, change, and search the various
 * media types stored in the list.//JP
 */

public class Main {// JP
	public static void main(String[] args) {// JP
		Library libraryList = new Library();
	
		Media newMedia = new Media();// JP
		newMedia.setFormat(" ");// JP
		newMedia.setLocation(" ");// JP
		newMedia.setNotes(" ");// JP
		libraryList.add(newMedia);
		
		Book newBook = new Book();// JP
		newBook.setAuthor(" ");// JP
		libraryList.add(newBook);
		System.out.println(newBook);// JP
		
		Song newSong = new Song();// JP
		newSong.setArtist(" ");// JP
		newSong.setGenre(" ");// JP
		System.out.println(newSong);// JP
		Video newVideo = new Video();// JP
		newVideo.setStar(" ");// JP
		System.out.println(newVideo);// JP
		VideoGame newVideoGame = new VideoGame();// JP
		System.out.println(newVideoGame);// JP
	}

}

/*
Book:
Book Author
Title
Format
Location
Notes

Song:
Song Artist
Song Genre
Title
Format
Location
Notes

Video:
Video Star
Title
Format
Location
Notes

Video Game:
Title
Format
Location
Notes
*/