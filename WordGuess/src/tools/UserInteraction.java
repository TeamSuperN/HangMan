package tools;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UserInteraction 
{
	
	public static String queryUserName() 
	{
		String userName = "";
		int userNameCorrectPopup = 0;
		
		/*
		 * Loop until valid user name is provided and confirmed
		 */
		do 
		{
			userName = JOptionPane.showInputDialog("Enter User Name:  ");
			
			//If user chooses the cancel option
			if (userName == null) 
			{
				confirmExitGame();
			}
			
			/*
			 * If user name is not blank
			 */
			else if (!userName.equals("")) 
				
			{
				userNameCorrectPopup = JOptionPane.showConfirmDialog(new JPanel(),
						"Is The User Name Correct?" +
						"\n" + "\"" + userName +  "\"" + "\n",					// We need to make the username get called here in the blanks
						"User Name",
						JOptionPane.YES_NO_OPTION);
			}
			
			/*
			 * User name must be blank, which is invalid
			 */
			else 
			{
				JOptionPane.showMessageDialog(new JFrame(), "No input provided for user name."  
						+ "\n" + "Please try again.");
			}
		}
		
		while (userName == null || userName.equals("") || userNameCorrectPopup != JOptionPane.YES_OPTION);
		
		return userName;
	}
	
	/*
	 * exit game popup
	 */
	public static void confirmExitGame()
	{
		int quit = JOptionPane.showConfirmDialog(new JFrame(), "Are You Sure You Want To Exit?");
		
		if (quit == JOptionPane.YES_OPTION) 
		{
			System.exit(0);
		}
	}
	
	/*
	 *TODO:  Implement quitting the current game (must be joined to an existing game)
	 * Confirm quit popup which goes back to lobby frame
	 */
	public static void confirmQuitGame()
	{
		int quit = JOptionPane.showConfirmDialog(new JFrame(), "Are You Sure You Want To Quit The Game?");
		
		if (quit == JOptionPane.YES_OPTION) 
		{
			JOptionPane.showMessageDialog(new JFrame(), "TODO: Implement quitting the current game (must be joined to an existing game)");
		}
	}
	
	/*
	 * TODO: implement the number of rounds to end this game
	 * determine the number of rounds for the game to end popup
	 */
	public static void determineNumberOfRounds()
	{
		Component frame = null;
		Object[] numberOfRounds = {"1", "2", "3", "4", "5"};
		String decideTheNumberOfRounds = (String)JOptionPane.showInputDialog(
		                    frame,
		                    "How Many Rounds Do You Wish To Play",
		                    "Number Of Rounds",
		                    JOptionPane.QUESTION_MESSAGE,
		                    null,
		                    numberOfRounds,
		                    "ham");
		
		if(decideTheNumberOfRounds == null)
		{
			confirmQuitGame();
		}
		else
		{
			//This is where we right that the game has to play for x<6 rounds
		}
		
	}
	
	/*
	 * TODO: Implement the max number of players allowed and make a vote for game to start popup
	 * how many players are joining popup
	 */
	public static void determineNumberOfPlayers()			
	{
		Component frame = null;
		Object[] numberOfPlayersJoining = {"1", "2", "3", "4", "5"};
		String decideTheNumberOfPlayersJoining = (String)JOptionPane.showInputDialog(
		                    frame, "How Many Players Will Be Joining",
		                    "Number Of Players Joining",JOptionPane.QUESTION_MESSAGE,
		                    null, numberOfPlayersJoining, "Users"); 		//TODO: user Ingame = numberOfPlayersJoining+1(host)
		if(decideTheNumberOfPlayersJoining != null)
		{
			determineNumberOfRounds();			//need to use stored number of players to make users stop coming in at the max number
		}
		else
		{
			confirmQuitGame();
		}
	}
	
	/*
	 * TODO: implement the vote to all users and make the game wait tell all users vote::
	 */
	public static void voteToStartGame()
	{	Component frame = null;
	
		
	int voteToStartGame = JOptionPane.showConfirmDialog(
			    frame,
			    "Are You Ready To Start The Game?",
			    "Start Game",
			    JOptionPane.YES_NO_OPTION);
		
		
		if (voteToStartGame == JOptionPane.YES_OPTION)
		{
			//wait for all users
		}
		else
		{
			//wait
			
		}
	}
}
