/**
 * one object of this class creates a graphical user
 * interface 
 */
import java.awt.event.*;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.applet.Applet;

public class GUI extends JFrame implements ActionListener {
	private JLabel prompt; //JP
	private JButton addBook;//JP
	private JButton addSong;//JP
	private JButton addVideo;//JP
	private JButton addVideoGame;//JP
	
	private JButton searchByTitle; //JP
	private JButton searchByMedia; //JP
	private JButton searchByBoth; //JP
	
	private JButton displayAll; //JP
	private JButton delete; //JP
	
	private JTextField addType; //JP
	private JTextField title; //JP
	private JTextField author; //JP
	private JTextField format; //JP
	private JTextField location;
	private JTextField notes; //JP
	private JTextField artist; //JP
	private JTextField genre; //JP
	private JTextField star; //JP
	private JTextField resultField;
	private JTextField name;
	private String userInput;
	/**
	 * creates components and adds the components to the 
	 * frame
	 * JP
	 */
	private void initialize() {
		this.setLayout(new FlowLayout());
		this.setSize(900, 900);
		
		addBook = new JButton("Add Book");
		this.add(addBook);
		addBook.addActionListener(this);

		addSong = new JButton("Add Song");
		this.add(addSong);
		addSong.addActionListener(this);
		
		addVideo = new JButton("Add Video");
		this.add(addVideo);
		addVideo.addActionListener(this);
		
		addVideoGame = new JButton("Add Video Game");
		this.add(addVideoGame);
		addVideoGame.addActionListener(this);
		
		searchByTitle = new JButton("Search by Title");
		this.add(searchByTitle);
		searchByTitle.addActionListener(this);
		
		searchByMedia = new JButton("Search by Media");
		this.add(searchByMedia);
		searchByMedia.addActionListener(this);
		
		searchByBoth = new JButton("Search by Both");
		this.add(searchByBoth);
		searchByBoth.addActionListener(this);
		
		displayAll = new JButton("Display All");
		this.add(displayAll);
		displayAll.addActionListener(this);
		
		delete = new JButton("Delete");
		this.add(delete);
		delete.addActionListener(this);
			
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	/**
	 * default constructor
	 * JP
	 */
	public GUI() {
		this.initialize();
	}
	/**
	 * prints all the information 
	 */
	public void printAll(){
		
	}
	/**
	 * contains the code response to the components
	 * JP
	 */
	public void actionPerformed(ActionEvent evt) {
		if (prompt != null)
			this.remove(prompt);
		if (evt.getSource() == addBook) {		
			
		} 
		else if(evt.getSource() == addSong) {
			
		}
		else if(evt.getSource() == addVideo) {
			
		}
		else if(evt.getSource() == addVideoGame) {
			
		}
		else if(evt.getSource() == searchByTitle) {
			
		}
		else if(evt.getSource() == searchByMedia) {
		
		}
		else if(evt.getSource() == searchByBoth) {
		
		}
		else if(evt.getSource() == displayAll) {
		
		}	
		else if(evt.getSource() == delete) {
			
		}
		validate();
	}
	public void addBook(){
		author = new JTextField(20);
		this.add(author);
		prompt = new JLabel(author.getText() + "Book Author: ");
		this.add(prompt);
		
		title = new JTextField(20);
		this.add(title);
		prompt = new JLabel(title.getText() + "Book Title: ");
		this.add(prompt);
		
		format = new JTextField(20);
		this.add(format);
		prompt = new JLabel(format.getText() + "Book Format: ");
		this.add(prompt);
		
		location = new JTextField(20);
		this.add(location);
		prompt = new JLabel(location.getText() + "Book Location: ");
		this.add(prompt);
		
		notes = new JTextField(20);
		this.add(notes);
		prompt = new JLabel(notes.getText() + "Book Notes: ");
		this.add(prompt);
	}
	
	public void addSong(){
		artist = new JTextField(20);
		this.add(artist);
		prompt = new JLabel(artist.getText() + "Song Artist: ");
		this.add(prompt);
		
		title = new JTextField(20);
		this.add(title);
		prompt = new JLabel(title.getText() + "Song Title: ");
		this.add(prompt);
		
		genre = new JTextField(20);
		this.add(genre);
		prompt = new JLabel(genre.getText() + "Song Genre: ");
		this.add(prompt);
		
		format = new JTextField(20);
		this.add(format);
		prompt = new JLabel(format.getText() + "Song Format: ");
		this.add(prompt);
		
		location = new JTextField(20);
		this.add(location);
		prompt = new JLabel(location.getText() + "Song Location: ");
		this.add(prompt);
		
		notes = new JTextField(20);
		this.add(notes);
		prompt = new JLabel(notes.getText() + "Song Notes: ");
		this.add(prompt);
	}
}