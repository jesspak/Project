
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
	 * @param title
	 * @param format
	 * @param location
	 * @param notes
	 */

	public Media(String title, String format, // JB
			String location, String notes) {// JP
			
		title = this.title;
		format = this.format;
		location = this.location;
		notes = this.notes;
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

	public void setTitle(String title) {// JB
		title = this.title;// JB
	}

	/**
	 * sets the value of format to newFormat//JP
	 * 
	 * @param newFormat
	 *            //JP
	 */

	public void setFormat(String format) {// JP
		format = this.format;

	/**
	 * sets the value of location to newLocation//JP
	 * 
	 * @param newLocation
	 */

	public void setLocation(String location) {// JP
		location = this.location;// JP
	}

	/**
	 * sets the value of notes to newNotes//JP
	 * 
	 * @param newNotes
	 */

	public void setNotes(String notes) {// JP
		notes = this.notes;// JP
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
