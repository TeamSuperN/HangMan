package GUI.PopupWindows;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import GUI.MainFrame;

public class UserNamePopup 
{
	static JFrame noUserNamePopup = new JFrame();
	public UserNamePopup()
	{
		JFrame userNamePopup = new JFrame();
		Object userName = JOptionPane.showInputDialog(userNamePopup, 
				"Enter User Name:");
		//public String userNameText = null;
		
				/*
				 * This is for 
				 * the cancel button
				 */
				if(userName == null)
				{	
					new ConfirmQuitPopup();
					
				}
				
				// This is for the blank username
				else if(userName.equals(""))
				{
					new NoUserName();
				}
				/*
				 * This is for if there 
				 * is a user name and 
				 * the ok button is pushed
				 */
				else
				{
					UserNameCorrect();	//initiates the New Game or Join Game popup
				}
	}
	
	/*
	 * This checks to make Sure
	 *  the User Name is Correct
	 */
	
	public void UserNameCorrect()
	{
		//String userNameText = userName();
		
		int userNameCorrectPopup = JOptionPane.showConfirmDialog(
				noUserNamePopup,
				"Is The User Name Correct." +
				"\n" + "        ",					// We need to make the username get called here in the blanks
				"User Name",
			    JOptionPane.YES_NO_OPTION);
		

		
				if (userNameCorrectPopup == JOptionPane.NO_OPTION)
				{
				
								
					new UserNamePopup();
				}	
					
				else
				{
					SwingUtilities.invokeLater(new Runnable()
					{

						@Override
						public void run() 
						{
							
							new MainFrame();
						
						}

					});	
				}
	}
}

