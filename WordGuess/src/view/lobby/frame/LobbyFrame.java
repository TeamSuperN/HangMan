package view.lobby.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import tools.UserInteraction;
import view.lobby.panels.HangManPicturePanel;
import view.lobby.panels.LobbyPanel;
import view.lobby.panels.WelcomeToHangManPanel;

/*
 * 	In the Future we could find a way to put a 
 * 	Chat Menu On this Page in The East maybe
 */
public class LobbyFrame extends JFrame
{
	private HangManPicturePanel hangManPicturePanel;
	private LobbyPanel lobbyPanel;
	private WelcomeToHangManPanel welcomeToHangManPanel;
	//private IMAGE hangManImage;
	
	public LobbyFrame()
	{
		super ("Hang Man");
	
		setBackground(new Color(112, 128, 144));
		setLayout(new BorderLayout());
		welcomeToHangManPanel = new WelcomeToHangManPanel();
		
		try {
			hangManPicturePanel = new HangManPicturePanel();
			
		} 
		catch (IOException e) {}
		
    
		lobbyPanel = new LobbyPanel();
		
		
		
		add(lobbyPanel, BorderLayout.WEST);
		add(hangManPicturePanel, BorderLayout.CENTER);
		add(welcomeToHangManPanel, BorderLayout.SOUTH);
		
		//Set The Frame In The Center Of The Screen
		pack();
		
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(550, 475));
		//setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		repaint();
	}
	
	public boolean newGameChosen() {
		return lobbyPanel.newGameChosen();
	}
	
	public boolean joinGameChosen() {
		return lobbyPanel.joinGameChosen();
	}
	
	/*
	 * wanted to make a method that refreshes the UserName
	 * after the user inputs their UserName
	 */
	public static void refreshMethod()
	{

	}
}
