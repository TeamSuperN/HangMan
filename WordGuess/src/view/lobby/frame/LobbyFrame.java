package view.lobby.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.lobby.panels.LobbyPanel;
import view.tools.UserInteraction;

/*
 * 	In the Future we could find a way to put a 
 * 	Chat Menu On this Page in The East maybe
 */
public class LobbyFrame extends JFrame
{
	private LobbyPanel lobbyPanel;
	private JLabel welcomeToHangMan;
	private String userName;
	//private IMAGE hangManImage;
	
	public LobbyFrame()
	{
		super ("Hang Man");
		

			
		//******Could use any of these look and feels*********************//
				//com.sun.java.swing.plaf.motif.MotifLookAndFeel
				//com.sun.java.swing.plaf.windows.WindowsLookAndFeel
				//com.sun.java.swing.plaf.motif.MotifLookAndFeel
		 //Set the required look and feel
		try 
		{
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} 	
			catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			catch (InstantiationException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			catch (IllegalAccessException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			catch (UnsupportedLookAndFeelException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setLayout(new BorderLayout());
		welcomeToHangMan = new JLabel("WELCOME TO THE NEW AND IMPROVED HANGMAN!!!!");
		//hangManImage = new Image(Put a hang man picture here);
		lobbyPanel = new LobbyPanel();
		
		Dimension dim = getPreferredSize();	
		dim.height = 50; 
		
		welcomeToHangMan.setPreferredSize(dim);
		
		add(lobbyPanel, BorderLayout.WEST);
		//add(hangManImage, BorderLayout.CENTER);
		add(welcomeToHangMan, BorderLayout.SOUTH);
		
		//Set The Frame In The Center Of The Screen
		pack();
		
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(600, 600));
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
