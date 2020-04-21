package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.game.frame.GameFrame;
import view.lobby.frame.LobbyFrame;

public class Actions 
{
	private static LobbyFrame lobbyFrame;
	
	public static String joinGame()
	{
		String gameID = "";
		int confirmGameIDFlag = 0;
		int noGameIDFlag = 0;
		
		do 
		{
			gameID = JOptionPane.showInputDialog(new JFrame(), 
					"Enter Game Id:");
			
			/*
			 * When there is information in the Game Id Popup
			 */
			//TODO: Confirm game ID by matching with a known valid game ID from the list of valid game IDs
			if (gameID != null && !gameID.isEmpty()) 
			{
				confirmGameIDFlag = JOptionPane.showConfirmDialog(new JFrame(), "Is The Game ID Correct?"
						+ "\n" + "\"" + gameID + "\"");
				//TODO: Implement confirmation of game ID
				//JOptionPane.showMessageDialog(new JFrame(), "TODO: Implement confirmation of game ID");
				
				if(confirmGameIDFlag == JOptionPane.CANCEL_OPTION)
				{
					
					lobbyFrame.dispose();
					
				}
				else if(confirmGameIDFlag == JOptionPane.NO_OPTION)
				{
					Actions.joinGame();
					lobbyFrame.dispose();
				}
				else if(confirmGameIDFlag == JOptionPane.YES_OPTION)
				{
					return gameID;
				}
			}
			
			/*
			 * When there is no text in Game ID Popup
			 */
			else if(gameID.isEmpty())
			{
				noGameIDFlag = JOptionPane.showConfirmDialog(new JFrame(), "There Is No Game ID."
						+ "\n" + "Do You Wish To Input A User ID?");
				
				if(noGameIDFlag == JOptionPane.CANCEL_OPTION)
				{
					lobbyFrame.dispose();
				}
				else if(noGameIDFlag == JOptionPane.NO_OPTION)
				{
					lobbyFrame.dispose();
				}
			}
			
			/*
			 * When the cancel button or close button is activated 
			 * in the Game Id Popup
			 */
			else
			{
				lobbyFrame.dispose();
			}
		
		}
		
		while (gameID != null || noGameIDFlag == JOptionPane.YES_OPTION || confirmGameIDFlag != JOptionPane.YES_OPTION);
		{
			
		}
		return (String) gameID;
		//Game ID must be valid and confirmed
		//TODO: Implement joining a game
	}
}