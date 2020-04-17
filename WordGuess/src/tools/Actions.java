package tools;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import gui.MainFrame;

public class Actions 
{
	public static void joinGame()
	{
		String gameID = "";
		int confirmGameIDFlag = 0;
		
		do 
		{
			gameID = JOptionPane.showInputDialog(new JFrame(), 
					"Enter Game Id:");
			
			//TODO: Confirm game ID by matching with a known valid game ID from the list of valid game IDs
			if (gameID != null) 
			{
				confirmGameIDFlag = JOptionPane.showConfirmDialog(new JFrame(), "Assume the game ID is confirmed?");
				JOptionPane.showMessageDialog(new JFrame(), "TODO: Implement confirmation of game ID");
			}
		}
		
		while (gameID == null || gameID.equals("") || confirmGameIDFlag != JOptionPane.YES_OPTION);
		
		//Game ID must be valid and confirmed
		//TODO: Implement joining a game
	}
}
