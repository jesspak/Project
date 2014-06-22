/**
 * one object of this class creates a graphical user
 * interface 
 */
import java.awt.event.*;

import javax.swing.*;

import java.awt.Dimension;
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
	private JButton deleteByTitle; //JP
	private JButton deleteByMedia; //JP
	private JButton deleteByBoth; //JP

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

		deleteByTitle = new JButton("Delete by Title");
		this.add(deleteByTitle);
		deleteByTitle.addActionListener(this);

		deleteByMedia = new JButton("Delete by Media");
		this.add(deleteByMedia);
		deleteByMedia.addActionListener(this);
		
		deleteByBoth = new JButton("Delete by Both");
		this.add(deleteByBoth);
		deleteByBoth.addActionListener(this);
		
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
			String title = JOptionPane.showInputDialog(null, "Enter Title: ");
			JTextArea textArea = new JTextArea(Main.printLibrary());
			JScrollPane scrollPane = new JScrollPane(textArea);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			scrollPane.setPreferredSize(new Dimension(500, 500));
			JOptionPane.showMessageDialog(null, scrollPane, Main.searchTitle(title), EXIT_ON_CLOSE, null);
			
		}
		else if(evt.getSource() == searchByMedia) {
			String media = JOptionPane.showInputDialog(null, "Enter Media: ");
			JTextArea textArea = new JTextArea(Main.printLibrary());
			JScrollPane scrollPane = new JScrollPane(textArea);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			scrollPane.setPreferredSize(new Dimension(500, 500));
			JOptionPane.showMessageDialog(null, scrollPane, Main.searchMedia(media), EXIT_ON_CLOSE, null);
			
		}
		else if(evt.getSource() == searchByBoth) {
			String title = JOptionPane.showInputDialog(null, "Enter Title: ");
			String media = JOptionPane.showInputDialog(null, "Enter Media: ");

			JTextArea textArea = new JTextArea(Main.printLibrary());
			JScrollPane scrollPane = new JScrollPane(textArea);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			scrollPane.setPreferredSize(new Dimension(500, 500));
			JOptionPane.showMessageDialog(null, scrollPane, Main.searchBoth(title, media), EXIT_ON_CLOSE, null);
			
		}
		else if(evt.getSource() == displayAll) {
			JTextArea textArea = new JTextArea(Main.printLibrary());
			JScrollPane scrollPane = new JScrollPane(textArea);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			scrollPane.setPreferredSize(new Dimension(500, 500));
			JOptionPane.showMessageDialog(null, scrollPane, Main.printLibrary(), EXIT_ON_CLOSE, null);
		}	
		else if(evt.getSource() == deleteByTitle) {
			String title = JOptionPane.showInputDialog(null, "Enter Title: ");
		}
		else if(evt.getSource() == deleteByMedia) {
			String media = JOptionPane.showInputDialog(null, "Enter Media Type: ");
		}
		else if(evt.getSource() == deleteByBoth) {
			String title = JOptionPane.showInputDialog(null, "Enter Title: ");
			String media = JOptionPane.showInputDialog(null, "Enter Media: ");
		}
		validate();
	}
}