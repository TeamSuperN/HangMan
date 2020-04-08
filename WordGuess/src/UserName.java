import javax.swing.JFrame;
import javax.swing.JOptionPane;


import GUI.NewGameOrJoinGame;




public class UserName 
{
	
	
	public static void main(String args[])
	{
		
		JFrame userNamePopup = new JFrame();
		
		
		Object userName = JOptionPane.showInputDialog(userNamePopup, "Enter User Name:");
		System.out.println(userName);
		
		/*
		 * This is for 
		 * the cancel button
		 */
		if(userName == null)
		{
			System.exit(0);
		}
		/*
		 * This is for the blank username
		 * 
		 */
		else if(userName.equals(""))
		{
			System.exit(0);
		}
		/*
		 * This is for if there 
		 * is a user name and 
		 * the ok button is pushed
		 */
		else
		{
			NewGameOrJoinGame.main(args);		//initiates the New Game or Join Game popup
		}
	}
}







