package view.lobby.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import tools.UserInteraction;
import view.lobby.panels.HangManPicturePanel;
import view.lobby.panels.LobbyPanel;

/*
 * 	In the Future we could find a way to put a 
 * 	Chat Menu On this Page in The East maybe
 */
public class LobbyFrame extends JFrame
{
	private HangManPicturePanel hangManPicturePanel;
	private LobbyPanel lobbyPanel;
	private JLabel welcomeToHangMan;
	private String userName;
	//private IMAGE hangManImage;
	
	public LobbyFrame()
	{
		super ("Hang Man");
	
		
		setLayout(new BorderLayout());
		welcomeToHangMan = new JLabel("                               "
				+ "                                                   "
				+ "WELCOME TO THE NEW AND IMPROVED HANGMAN!!!!");
		
		try {
			hangManPicturePanel = new HangManPicturePanel();
			
		} 
		catch (IOException e) {}
		

		lobbyPanel = new LobbyPanel();
		
		Dimension dim = getPreferredSize();	
		dim.height = 50; 
		
		welcomeToHangMan.setPreferredSize(dim);
		
		add(lobbyPanel, BorderLayout.WEST);
		add(hangManPicturePanel, BorderLayout.CENTER);
		add(welcomeToHangMan, BorderLayout.SOUTH);
		
		//Set The Frame In The Center Of The Screen
		pack();
		
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(500, 475));
		//setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		userName = UserInteraction.queryUserName();
		
		repaint();
	}
	
	public String getUserName() 
	{
		return userName;
	}
	
	public boolean newOrJoinGameChosen() {
		return lobbyPanel.newOrJoinGameChosen();
	}
	
	/*
	 * wanted to make a method that refreshes the UserName
	 * after the user inputs their UserName
	 */
	public static void refreshMethod()
	{

	}
}
