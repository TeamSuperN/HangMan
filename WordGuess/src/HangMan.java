import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


import GUI.MainFrame;





public class HangMan  
{
	private static final Component NewGameOrJoinGame = null;
	
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
			NewGameOrJoinGame(args);		//initiates the New Game or Join Game popup
		}
	}
	
	/*
	 * 	This class will be able to be updated with the ability
	 *  to join a game or start a new game. right now it opens
	 *  the basic interface or closes the program
	 */
	public static void NewGameOrJoinGame(String[] args)
	{
		Object[] options = {"New Game",
                "Join Game",
                "Cancel"};	

	 int n = JOptionPane.showOptionDialog(NewGameOrJoinGame,
			    "Would You Like To Start A New Game Or Join A Game ",
			    "New Game Or Join Game",
			    JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,
			    options,
			    options[2]);
	 
	 
	 /* ******************************************
	  * later we can add the ability to navigate *
	  * to different games new of join games 	 *
	  * 										 *
	  ****************************************** */
if(n == JOptionPane.YES_OPTION) 									
{
	/*
	 * This section will 
	 * be for new game
	 */
	mainFrame(args);				//initiates the App which starts the game
    }
/*
 * This section will be 
 * for joining a game
 */
	else if(n == JOptionPane.NO_OPTION)
	{
    		SwingUtilities.invokeLater(new Runnable()
			{
				public void run() 
				{
					mainFrame(args);				//initiates the App which starts the game			
				}
		});		
	}
	
	else
	{
		System.exit(0);
	}
	}
	
	
	/*
	 * this make the whole game 
	 * run after the 2 popups run
	 */
	
		public static void mainFrame(String[] ar) 
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




