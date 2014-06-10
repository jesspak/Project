import java.io.Serializable; //JB
/**
 * One object of class Book stores the information of one Book.
 * One book consists of the information of the author,
 * title, format, location, and notes
 * @author JessicaPak
 *
 */
public class Book extends Media implements Serializable{ //JB
	private String bookAuthor; //JP
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
	public Book(String newBookAuthor, String newTitle, 
			String newBookFormat, String newBookLocation, String newBookNotes){
		super();
	}
	/**
	 * returns the current value of bookAuthor
	 * JP
	 */ 
	public String getBookAuthor(){
		return bookAuthor;
	}
		
	/**
	 * sets the value of bookAuthor to newBookAuthor
	 * @param newBookAuthor
	 * JP
	 */
	public void setBookAuthor(String newBookAuthor){
		bookAuthor = "Book Author";
	}

	/**
	 * Returns a String containing all the data stored 
	 * in this object.
	 * JP
	 */
	public String toString(){
		return "Book:" + "\n" + this.getBookAuthor()// JB
				+ "\n" + super.toString();// JB
	}
	
}
