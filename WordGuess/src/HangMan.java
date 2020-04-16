import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import GUI.MainFrame;
import GUI.InterfacePanels.UserNamePanel;
import tools.UserInteraction;

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




