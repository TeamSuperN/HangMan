package init;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.game.frame.GameFrame;
import view.lobby.frame.LobbyFrame;

public class HangMan  
{
	private static LobbyFrame lobbyFrame;
	private static String userName;
	
	public static void main(String args[])
	{
		initLobbyFrame();
	}
	

	
	private static void initLobbyFrame() 
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run() 
			{
				addLookAndFeel();
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
	
	private static void addLookAndFeel() {
		// ******Could use any of these look and feels*********************//
		// com.sun.java.swing.plaf.motif.MotifLookAndFeel
		// com.sun.java.swing.plaf.windows.WindowsLookAndFeel
		// com.sun.java.swing.plaf.motif.MotifLookAndFeel
		// Set the required look and feel
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e) {} 
		  catch (InstantiationException e) {}
		  catch (IllegalAccessException e) {} 
		  catch (UnsupportedLookAndFeelException e) {}
	}
}




