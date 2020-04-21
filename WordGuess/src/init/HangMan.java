package init;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.SwingUtilities;

import view.game.frame.GameFrame;
import view.lobby.frame.LobbyFrame;
import view.tools.UserInteraction;

public class HangMan  
{
	private static LobbyFrame lobbyFrame;
	private static String userName;
	
	public static void main(String args[])
	{
		initStartGameFrame();
	}
	
	private static void initStartGameFrame() 
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run() 
			{
				lobbyFrame = new LobbyFrame();
				userName = lobbyFrame.getUserName();
				lobbyFrame.addWindowListener(new WindowListener()
				{
					public void windowClosing(WindowEvent e) {
						if (lobbyFrame.newOrJoinGameChosen() == true) {
							lobbyFrame.dispose();
							initGameFrame();
						}
						else {
							System.exit(0);
						}
					}
					public void windowIconified(WindowEvent e) {}
					public void windowDeiconified(WindowEvent e) {}
					public void windowActivated(WindowEvent e) {}
					public void windowDeactivated(WindowEvent e) {}
					public void windowClosed(WindowEvent e) {}
					public void windowOpened(WindowEvent e) {}
				});
			}
		});
		
		


	}
	
	public static void initGameFrame()
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run() 
			{
				new GameFrame(userName);
			}
		});	
	}
}




