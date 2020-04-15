package GUI.PopupWindows;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import GUI.MainFrame;

public class ExitGame 
{
	static JFrame exitGamePopup = new JFrame();
	public ExitGame()
	{
		int exit = JOptionPane.showConfirmDialog(
				exitGamePopup,
				"Are You Sure You Wish To" + "\n"  +
								"Quit This Game and Exit" 
								+ "\n" + "The Program?",
						"Exit Game",
			    JOptionPane.YES_NO_OPTION);
		if(exit  == JOptionPane.YES_OPTION)
		{
			System.exit(0);
		}
		
	}
}

