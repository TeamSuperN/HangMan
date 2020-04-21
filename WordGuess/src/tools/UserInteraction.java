package tools;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UserInteraction 
{
	
	public static String queryUserName() 
	{
		String userName = "";
		int userNameCorrectPopup = 0;
		
		//Loop until valid user name is provided and confirmed
		do 
		{
			userName = JOptionPane.showInputDialog("Enter User Name:  ");
			
			//If user chooses the cancel option
			if (userName == null) 
			{
				confirmExitGame();
			}
			
			//If user name is not blank
			else if (!userName.equals("")) 
				
			{
				userNameCorrectPopup = JOptionPane.showConfirmDialog(new JPanel(),
						"Is The User Name Correct?" +
						"\n" + "\"" + userName +  "\"" + "\n",					// We need to make the username get called here in the blanks
						"User Name",
						JOptionPane.YES_NO_OPTION);
			}
			
			//User name must be blank, which is invalid
			else 
			{
				JOptionPane.showMessageDialog(new JFrame(), "No input provided for user name."  
						+ "\n" + "Please try again.");
			}
		}
		
		while (userName == null || userName.equals("") || userNameCorrectPopup != JOptionPane.YES_OPTION);
		
		return userName;
	}
	
	public static void confirmExitGame()
	{
		int quit = JOptionPane.showConfirmDialog(new JFrame(), "Are You Sure You Want To Exit?");
		
		if (quit == JOptionPane.YES_OPTION) 
		{
			System.exit(0);
		}
	}
	
	public static void confirmQuitGame()
	{
		int quit = JOptionPane.showConfirmDialog(new JFrame(), "Are You Sure You Want To Quit The Game?");
		
		if (quit == JOptionPane.YES_OPTION) 
		{
			JOptionPane.showMessageDialog(new JFrame(), "TODO: Implement quitting the current game (must be joined to an existing game)");
		}
	}
}
