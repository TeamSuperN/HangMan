import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import gui.GameFrame;
import gui.MainFrame;
import gui.StartGameFrame;

public class HangMan  
{
	private static StartGameFrame startGameFrame;
	private static GameFrame gameFrame;
	
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
			
			}
		});	
	}
	
	public static void initGameFrame()
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run() 
			{
				gameFrame = new GameFrame();
				startGameFrame.dispose();
			
			}
		});	
	}
	
	
	
}




