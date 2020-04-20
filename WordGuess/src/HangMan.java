import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.SwingUtilities;

import gui.GameFrame;
import gui.StartGameFrame;

public class HangMan  
{
	private static StartGameFrame startGameFrame;
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
				startGameFrame = new StartGameFrame();
				userName = startGameFrame.getUserName();
				startGameFrame.addWindowListener(new WindowListener()
				{
					public void windowClosing(WindowEvent e) {
						startGameFrame.dispose();
						initGameFrame();
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




