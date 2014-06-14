import java.io.Serializable;

/**
 * One object of class VideoGame stores the information of 
 * one video game. One video game consists of the information 
 * of the video game title, format, location, and notes
 * @author JessicaPak
 *
 */
public class VideoGame extends Media implements Serializable{ //JB JP

	/**
	 * default constructor JP
	 */
	public VideoGame(){
		super();
		
	}
	/**
	 * parameterized constructor JP
	 */
<<<<<<< HEAD
	public VideoGame(String title, String format,
			String location, String notes){
		super(title, format, location, notes);
=======
	public VideoGame(String newTitle, String newFormat,
			String newLocation, String newNotes){
		super(newTitle, newFormat, newLocation, newNotes);
>>>>>>> origin/jess
		
	}

	/**
	 * Returns a String containing all the data stored //JP in this object.
	 */

	public String toString() {// JB
		return "\t"+ "Video Game:" + "\n" + super.toString();// JB
	}
}
