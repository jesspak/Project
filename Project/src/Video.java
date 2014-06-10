import java.io.Serializable; // JP JB
/**
 * One object of class Video stores the information of one video.
 * One video consists of the information of the title,
 * star, format, location, and notes
 * @author JessicaPak
 *
 */
public class Video extends Media implements Serializable{ // JP JB
	private String videoStar;
	
	/**
	 * default constructor JP
	 */
	public Video(){
		super();
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
	public Video(String newTitle, String newVideoStar,
			String newVideoFormat, String newVideoLocation, String newVideoNotes){
		super(); //JP
	}

	/**
	 * returns the current value of videoStar
	 * JP
	 */
	public String getVideoStar(){
		return videoStar;
	}

	/**
	 * sets the value of videoStar to newVideoStar
	 * @param newVideoStar
	 * JP
	 */
	public void setVideoStar(String newVideoStar){
		videoStar = "Video Star";
	}
	/**
	 * Returns a String containing all the data stored //JP in this object.
	 */

	public String toString() {// JB
		return "Video:" + "\n" + this.getVideoStar() + "\n" + super.toString();// JB
	}
}

