package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Actions 
{
	
	public static String joinGame()
	{
		String gameID;
		int confirmGameIDFlag = 0;
		
		do 
		{
			gameID = JOptionPane.showInputDialog(new JFrame(), 
					"Enter Game Id:");
			
			if (gameID == null) {
				break;
			}
			
			/*
			 * When there is information in the Game Id Popup
			 */
			//TODO: Confirm game ID by matching with a known valid game ID from the list of valid game IDs
			if (gameID != null && !gameID.isEmpty()) 
			{
				confirmGameIDFlag = JOptionPane.showConfirmDialog(new JFrame(), "Is The Game ID Correct?"
						+ "\n" + "\"" + gameID + "\"");
				
				if(confirmGameIDFlag == JOptionPane.CANCEL_OPTION || confirmGameIDFlag == JOptionPane.CLOSED_OPTION)
				{
					gameID = null;
					break;
				}
			}
			
			/*
			 * When there is no text in Game ID Popup
			 */
			else if(gameID.isEmpty())
			{
				JOptionPane.showMessageDialog(new JFrame(), "Must enter a Game ID. Please try again.");
			}
		
		}
		while (gameID.isEmpty() || confirmGameIDFlag != JOptionPane.YES_OPTION);

		return gameID;
		//Game ID must be valid and confirmed
		//TODO: Implement joining a game
	}
}