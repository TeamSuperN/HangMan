import javax.swing.SwingUtilities;

import gui.MainFrame;

public class HangMan  
{
	private static MainFrame mainFrame;
	
	public static void main(String args[])
	{
		initMainFrame();
	}
	
	private static void initMainFrame() {
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run() 
			{
				mainFrame = new MainFrame();
			
			}
		});	
	}
	

}




