
import java.io.Serializable;
/**
 * One object of class Media stores a list of the various
 * media types.
 * @author JessicaPak
 *
 */
public class Media implements Serializable, Cloneable  { //JB,JP
	private String title; // JB
	private String format; // JP
	private String location; //JP
	private String notes; //JP
	/**
	 * default constructor//JP
	 */

	public Media() {// JP
		title = "Title";// JB
		format = "Format";// JP
		location = "Location";// JP
		notes = "Notes";// JP
	}
	/**
	 * parameterized constructor//JP
	 * 
	 * @param newTitle
	 * @param newFormat
	 * @param newLocation
	 * @param newNotes
	 */

	public Media(String newTitle, String newFormat, // JB
			String newLocation, String newNotes) {// JP
	}

	/**
	 * returns the current value of title//JB
	 */

	public String getTitle() {// JB
		return title;// JB
	}

	/**
	 * returns the current value of format//JP
	 */

	public String getFormat() {// JP
		return format;// JP
	}

	/**
	 * returns the current value of location//JP
	 */

	public String getLocation() {// JP
		return location;// JP
	}

	/**
	 * returns the current value of notes//JP
	 */

	public String getNotes() {// JP
		return notes;// JP
	}

	/**
	 * sets the value of title to newTitle//JB
	 * 
	 * @param newTitle
	 *            //JB
	 */

	public void setTitle(String newTitle) {// JB
		title = "Title";// JB
	}

	/**
	 * sets the value of format to newFormat//JP
	 * 
	 * @param newFormat
	 *            //JP
	 */

	public void setFormat(String newFormat) {// JP
		format = "Format";// JP
	}

	/**
	 * sets the value of location to newLocation//JP
	 * 
	 * @param newLocation
	 */

	public void setLocation(String newLocation) {// JP
		location = "Location";// JP
	}

	/**
	 * sets the value of notes to newNotes//JP
	 * 
	 * @param newNotes
	 */

	public void setNotes(String newNotes) {// JP
		notes = "Notes";// JP
	}

	/**
	 * Returns a String containing all the data stored //JP in this object.
	 */

	public String toString() {// JP
		return this.getTitle() + "\n" + this.getFormat() + "\n"
				+ this.getLocation()// JB
				+ "\n" + this.getNotes() + "\n";// JP
	}

	/**
	 * Compares entries to allow them to be sorted.//JB
	 */
	public int compareTo(Object arg0) {// JB
		return 0;// JB
	}

}
