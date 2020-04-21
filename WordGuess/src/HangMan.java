import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import gui.GameFrame;
import gui.StartGameFrame;

public class HangMan  
{
	private static StartGameFrame startGameFrame;
	private static String userName;
	public static GameFrame gameFrame;
	
	
	public static void main(String args[])
	{
		initStartGameFrame();
	}
	
	public static void initStartGameFrame() 
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
					public void windowDeactivated(WindowEvent e) {System.exit(0);}
					public void windowClosed(WindowEvent e) {}
					public void windowOpened(WindowEvent e) {}
				});
			}
		});
			return;
	}
	
	public static void initGameFrame()
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run() 
			{
				new GameFrame();
			}
		});	
	}
	
	
	/*
	 * I can't figure this out. I wanted to make the GameFrame dispose when Quit GameButton Pushed
	 */
	public static void disposeGameFrame()
	{
		gameFrame = new GameFrame();
		userName = startGameFrame.getUserName();
		gameFrame.addWindowListener(new WindowListener()
		{
			public void windowClosing(WindowEvent e) 
			{
				gameFrame.dispose();
				initStartGameFrame();				
			}
			public void windowIconified(WindowEvent e) {}
			public void windowDeiconified(WindowEvent e) {}
			public void windowActivated(WindowEvent e) {}
			public void windowDeactivated(WindowEvent e) {}
			public void windowClosed(WindowEvent e) {}
			public void windowOpened(WindowEvent e) {}
		});
	}
	
	/*
	private void windowClosing(java.awt.event.WindowEvent evt) 
	{                                   
	    int confirmed = JOptionPane.showConfirmDialog(null, "Exit Program?","EXIT",JOptionPane.YES_NO_OPTION);
	    if(confirmed == JOptionPane.YES_OPTION)
	    {
	        startGameFrame.dispose();
	    }
	 
		else 
		{
			startGameFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	}
	*/
}




