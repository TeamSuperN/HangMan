package GUI.PopupWindows;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import GUI.InterfacePanels.UserNamePanel;

public class ConfirmQuitPopup 
{
	static JFrame confirmQuitPopup = new JFrame();
	
	public ConfirmQuitPopup()
	{
		int quit = JOptionPane.showConfirmDialog(
				confirmQuitPopup,
			    "Are You Sure You Want To Quit?",
			    "Quit",
			    JOptionPane.YES_NO_OPTION);
		

		
				if (quit == JOptionPane.YES_OPTION)
				{
					if (confirmQuitPopup == null)
					{
						new UserNamePanel();
					}
					
					
					/*
					 * This would go back to 
					 * MainFrame with no game 
					 * playing
					 */
					else
					{
						
					}
				}
	}
}
