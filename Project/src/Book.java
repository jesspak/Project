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
         * calls super consturctor of Media class and passes paaramaters
         */
				 
		super(title, format, location, notes);
		
		/**
		 *passes author to setAuthor method to set the author of book
		 */
		setAuthor(author);
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
	public void setAuthor(String newAuthor){
		author = "Book Author";
	}

	/**
	 * Returns a String containing all the data stored 
	 * in this object.
	 * JP
	 */
	public String toString(){
		return "Book:" + "\n" + this.getAuthor()// JB
				+ "\n" + super.toString();// JB
	}
	
}
