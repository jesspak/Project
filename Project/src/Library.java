import java.util.ArrayList;
import java.util.Comparator;
import java.io.*; // JB
import java.util.Collections;

/**
 * one object of this class creates a library and has methods that adds, prints,
 * deletes, and retrieves the data.
 */
public class Library implements Serializable {

	private ArrayList<Media> library;
	private ObjectInputStream input;
	private ObjectOutputStream output;

	/**
	 * default constructor JP
	 */
	public Library() {
		library = new ArrayList<Media>();
	}

	/**
	 * adds a media object to the library JB
	 */
	public void add(Media m) throws IOException {
		if (m.getTitle().isEmpty()){//JB
			System.out.println("You must add a title.");//JB
			return;}
		library.clear();
		try{
			try{
				openReadFile();
				while (true){
					Media med = (Media) input.readObject();
					library.add(med);
				}
			}
			catch (EOFException endOfFileException){
				//Read passed end of file
			}
			catch (ClassNotFoundException classNotFoundException){
				System.out.println("Unable to create object");
			}
			catch (IOException ioException){
				// Read empty file
			}
			finally{
				closeReadFile();
			}
			openWriteFile();
			for(Media med: library){
				output.writeObject(med);
			}
			output.writeObject(m);
			closeWriteFile();
			library.clear();
		}
		catch (IOException ioException){
			throw new IOException("Error writing to file");
		}
	}
	/**
	 * sorts the all the entries in the list JP
	 */
	public void sort(){
		Collections.sort(library);
	}	
	/**
	 * opens a text file so objects may be read into it //JB
	 */

	public void openReadFile() throws IOException{
		try {
			input = new ObjectInputStream(new FileInputStream("library.ser"));
		}
		catch(IOException ioException){
			throw ioException;
		}
	}
	
	/**
	 * opens the text file so objects can be read from it and displayed //JB
	 */
	public void openWriteFile() throws IOException{
		try {
			output = new ObjectOutputStream(new FileOutputStream("library.ser"));
		}
		catch(IOException ioException){
			System.out.println("Error opening file.");
		}
	}
	
	/**
	 * closes text file after all objects have been added to it //JB
	 */
	public void closeReadFile(){
		try {
			if (input !=  null)
				input.close();
		}
		catch(IOException ioException){
			System.out.println("Error closing file.");
		}
	}
	
	/**
	 * closes text file after contents of file have been displayed //JB
	 */
	public void closeWriteFile(){
		try {
			if (output !=  null)
				output.close();
		}
		catch(IOException ioException){
			System.out.println("Error closing file.");
		}
	}
	
	/**
	 * Returns a string containing all the data stored in this object JB
	 */
	public String toString() {
		String result = "Library Contents:\n ";
		try{
			openReadFile();
			while (true){
				Media m = (Media)input.readObject();
				result += m.toString()+"\n";
			}
		}
		catch(EOFException endOfFileException){
			
		}
		catch(ClassNotFoundException classNotFoundException){
			System.out.println("Unable to create object");
		}
		catch (IOException ioException){
			
		}
		finally{
			closeReadFile();
		}
		return result;
	}
	/**
	 * takes in the title as a parameter and searches the list of that same
	 * title TB
	 */
	public String retrieveByTitle(String title) {
		String curMedia = "";
		for (int i = 0; i < library.size(); i++) {
			curMedia = library.get(i).getTitle();
			if (curMedia == title) {
				return curMedia;
			}
		}
		return curMedia;
	}

	/**
	 * takes in the media type and title as a parameter and searches the list of
	 * that same media type and title JP
	 */
	public Media retrieveByTitleAndMedia(Media tm) {
		return new Media();// JB
	}

	/**
	 * deletes an entry from an ArrayList TB
	 */
	public void deleteEntry(String title, String mediaType) { // JP
		int i = 0;
		for (i = 0; i < library.size(); i++) {
			String curMedia = library.get(i).getTitle();
			if (curMedia == title && library.get(i).isInstanceOfClass(mediaType) == true) {
				library.remove(i);
			}
		}

	}
}
