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
	public JLabel prompt; //JP
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
		this.setSize(600, 300);

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
	 * contains the code response to the components
	 * JP
	 */
	public void actionPerformed(ActionEvent evt) {
		if (prompt != null)
			this.remove(prompt);
		if (evt.getSource() == addBook) {		
			String authorInput = JOptionPane.showInputDialog(null, "Enter Author: ");
			String title = JOptionPane.showInputDialog(null, "Enter Title: ");
			String format = JOptionPane.showInputDialog(null, "Enter Format: ");
			String location = JOptionPane.showInputDialog(null, "Enter Location: ");
			String notes = JOptionPane.showInputDialog(null, "Enter Notes: ");

			Main.gotNewBook(authorInput, title, format, location, notes);
		} 
		else if(evt.getSource() == addSong) {
			String artistInput = JOptionPane.showInputDialog(null, "Enter Artist: ");
			String title = JOptionPane.showInputDialog(null, "Enter Title: ");
			String genre = JOptionPane.showInputDialog(null, "Enter Genre: ");
			String format = JOptionPane.showInputDialog(null, "Enter Format: ");
			String location = JOptionPane.showInputDialog(null, "Enter Location: ");
			String notes = JOptionPane.showInputDialog(null, "Enter Notes: ");

			Main.gotNewSong(artistInput, title, genre, format, location, notes);
		}
		else if(evt.getSource() == addVideo) {
			String starInput = JOptionPane.showInputDialog(null, "Enter Star: ");
			String title = JOptionPane.showInputDialog(null, "Enter Title: ");
			String format = JOptionPane.showInputDialog(null, "Enter Format: ");
			String location = JOptionPane.showInputDialog(null, "Enter Location: ");
			String notes = JOptionPane.showInputDialog(null, "Enter Notes: ");

			Main.gotNewVideo(starInput, title, format, location, notes);
		}
		else if(evt.getSource() == addVideoGame) {
			String title = JOptionPane.showInputDialog(null, "Enter Title: ");
			String format = JOptionPane.showInputDialog(null, "Enter Format: ");
			String location = JOptionPane.showInputDialog(null, "Enter Location: ");
			String notes = JOptionPane.showInputDialog(null, "Enter Notes: ");

			Main.gotNewVideoGame(title, format, location, notes);
		}
		else if(evt.getSource() == searchByTitle) {

		}
		else if(evt.getSource() == searchByMedia) {

		}
		else if(evt.getSource() == searchByBoth) {

		}
		else if(evt.getSource() == displayAll) {
			JOptionPane.showMessageDialog(null, Main.printLibrary());
		}	
		else if(evt.getSource() == delete) {

		}
		validate();
	}
}