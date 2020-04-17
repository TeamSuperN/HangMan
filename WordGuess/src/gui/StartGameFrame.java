package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import gui.panels.MenuBar;
import gui.startpanels.StartPanel;
import tools.UserInteraction;

/*
 * 	In the Future we could find a way to put a 
 * 	Chat Menu On this Page in The East maybe
 */
public class StartGameFrame extends JFrame
{
	private StartPanel startPanel;
	private JLabel welcomeToHangMan;
	private String userName;
	//private IMAGE hangManImage;
	
	public StartGameFrame()
	{
		super ("Hang Man");
		
		setLayout(new BorderLayout());
		welcomeToHangMan = new JLabel("WELCOME TO THE NEW AND IMPROVED HANGMAN!!!!");
		//hangManImage = new Image(Put a hang man picture here);
		startPanel = new StartPanel();
		
		Dimension dim = getPreferredSize();	
		dim.height = 50; 
		
		welcomeToHangMan.setPreferredSize(dim);
		
		add(startPanel, BorderLayout.WEST);
		//add(hangManImage, BorderLayout.CENTER);
		add(welcomeToHangMan, BorderLayout.SOUTH);
		
		//Set The Frame In The Center Of The Screen
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(600, 600));
		setVisible(true);
		
		userName = UserInteraction.queryUserName();

	}
	
	public String getUserName() {
		return userName;
	}
	
	
}
