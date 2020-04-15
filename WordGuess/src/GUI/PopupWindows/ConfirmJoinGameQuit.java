package GUI.PopupWindows;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import GUI.InterfacePanels.UserNamePanel;

public class ConfirmJoinGameQuit 
{
	static JFrame confirmJoinGameQuit = new JFrame();
	
	public void ConfirmQuitPopup()
	{
		int quit = JOptionPane.showConfirmDialog(
				confirmJoinGameQuit,
			    "Are You Sure You Want To Quit?",
			    "Quit",
			    JOptionPane.YES_NO_OPTION);
		

		
				if (quit == JOptionPane.YES_OPTION)
				{
					if (confirmJoinGameQuit == null)
					{
						new JoinGame();
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
