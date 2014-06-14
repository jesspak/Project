import java.io.Serializable; //JB
/**
 * One object of class Book stores the information of one Book.
 * One book consists of the information of the author,
 * title, format, location, and notes
 * @author JessicaPak
 *
 */
public class Book extends Media implements Serializable{ //JB
	private String author; //JP
	/**
	 * default constructor 
	 * JP
	 */ 
	public Book(){
		super();

		author = "Author";
	}
	/**
	 * parameterized constructor
	 * @param author
	 * @param title
	 * @param format
	 * @param location
	 * @param notes
	 *  JP
	 */
	public Book(String author, String title, 
			String format, String location, String notes){
	/**
         * calls super constructor of Media class and passes parameters
         */
		super(title, format, location, notes);

		/**
		 * sets the value this.author to author
		 */
		this.author = author;

	}
	/**
	 * returns the current value of bookAuthor
	 * JP
	 */ 
	public String getAuthor(){
		return author;
	}

	/**
	 * sets the value of author to newAuthor
	 * @param newAuthor
	 * JP
	 */
	public void setAuthor(String author){
		this.author = author;
	}

	/**
	 * Returns a String containing all the data stored 
	 * in this object.
	 * JP
	 */
	public String toString(){
		return "\t" +"Book:" + "\n" + "Author: " + this.getAuthor()// JB
				+ "\n" + super.toString();// JB
	}
}