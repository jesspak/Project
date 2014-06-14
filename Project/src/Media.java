
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
<<<<<<< HEAD

	public Media(String title, String format, // JB
			String location, String notes) {// JP
			
		title = this.title;
		format = this.format;
		location = this.location;
		notes = this.notes;
	}
	

=======
	public Media(String newTitle, String newFormat, // JB
			String newLocation, String newNotes) {// JP
		title = newTitle;
		format = newFormat;
		location = newLocation;
		notes = newNotes;
	}
>>>>>>> origin/jess
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
<<<<<<< HEAD

	public void setTitle(String title) {// JB
		this.title = title;// JB
=======
	public void setTitle(String newTitle) {// JB
		title = newTitle;// JB
>>>>>>> origin/jess
	}
	/**
	 * sets the value of format to newFormat//JP
	 * 
	 * @param newFormat
	 *            //JP
	 */
<<<<<<< HEAD

	public void setFormat(String format) {// JP
		this.format = format;

=======
	public void setFormat(String newFormat) {// JP
		format = newFormat;// JP
	}
>>>>>>> origin/jess
	/**
	 * sets the value of location to newLocation//JP
	 * 
	 * @param newLocation
	 */
<<<<<<< HEAD

	public void setLocation(String location) {// JP
		this.location = location;// JP
=======
	public void setLocation(String newLocation) {// JP
		location = newLocation;// JP
>>>>>>> origin/jess
	}
	/**
	 * sets the value of notes to newNotes//JP
	 * 
	 * @param newNotes
	 */
<<<<<<< HEAD

	public void setNotes(String notes) {// JP
		this.notes = notes;// JP
=======
	public void setNotes(String newNotes) {// JP
		notes = newNotes;// JP
>>>>>>> origin/jess
	}
	/**
	 * Returns a String containing all the data stored in this object. JP
	 */
	public String toString() {// JP
		return "Title: " + this.getTitle() + "\n" + "Format: " + this.getFormat() + "\n"
				+ "Location: " + this.getLocation()// JB
				+ "\n" + "Notes: " + this.getNotes() + "\n" + "\n";// JP
	}

	/**
	 * Compares entries to allow them to be sorted.//JB
	 */
//	public int compareTo(Media m) {// JB
//		int compareQuantity = ((Media) compareTitle).getQuantity(); 
//		 
//		//ascending order
//		return this.quantity - compareQuantity;
//
//	}

}
