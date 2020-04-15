package GUI.PopupWindows;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import GUI.MainFrame;

public class NoGameId 
{
	static JFrame noJoinGameId = new JFrame();
	
	public NoGameId()
	{
		int noGameId = JOptionPane.showConfirmDialog(
				noJoinGameId,
				"There Is No Game Id." + "\n"  +
				"Do You Wish To Input A Game ID?",
				"Game ID",
			    JOptionPane.YES_NO_OPTION);
		

		
				if (noGameId == JOptionPane.YES_OPTION)
				{
					if (noJoinGameId == null)
					{
						new MainFrame();
					}
					else
					{
						new JoinGame();
					}
				}
	}
}
