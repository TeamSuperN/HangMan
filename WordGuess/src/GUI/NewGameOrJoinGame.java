package GUI;

import java.awt.Component;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;

import GUI.App;
import GUI.MainFrame;

/*
 * 	This class will be able to be updated with the ability
 *  to join a game or start a new game. right now it opens
 *  the basic interface or closes the program
 */
public class NewGameOrJoinGame 
{
	private static final Component NewGameOrJoinGame = null;

	public static void main(String[] arg)
	{
		
		JFrame userNamePopup = new JFrame();
		JFrame newGamePopup = new JFrame();
	    

	    
		
		
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
	    	System.out.println("DO YOU WANT TO JOIN A "
	    			+ "GAME OR START A NEW GAME");			
	    	
	    	
	    	App.main(arg);				//initiates the App which starts the game
	    		
	    	
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
						App.main(arg);				//initiates the App which starts the game			
					}
		
			});		
    	}
    	
    	else
    	{
    		System.exit(0);
    	}
	    		
	}																		
	    																		
	    

}