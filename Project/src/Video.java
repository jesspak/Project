import java.io.Serializable; // JP JB
/**
 * One object of class Video stores the information of one video.
 * One video consists of the information of the title,
 * star, format, location, and notes
 * @author JessicaPak
 *
 */
public class Video extends Media implements Serializable{ // JP JB
	private String star;
	
	/**
	 * default constructor JP
	 */
	public Video(){
		super();
		star = "Star";
	}
	/**
	 * parameterized constructor
	 * @param newTitle
	 * @param newStar
	 * @param newFormat
	 * @param newLocation
	 * @param newNotes
	 * JP
	 */
	public Video(String newTitle, String newStar,
			String newFormat, String newLocation, String newNotes){
		super(newTitle, newFormat, newLocation, newNotes); //JP
		star = newStar;
	}

	/**
	 * returns the current value of videoStar
	 * JP
	 */
	public String getStar(){
		return star;
	}

	/**
	 * sets the value of videoStar to newVideoStar
	 * @param newVideoStar
	 * JP
	 */
	public void setStar(String newStar){
		star = newStar;
	}
	/**
	 * Returns a String containing all the data stored //JP in this object.
	 */

	public String toString() {// JB
		return "\t" + "Video:" + "\n" + "Star: " + this.getStar() + "\n" + super.toString();// JB
	}
}

