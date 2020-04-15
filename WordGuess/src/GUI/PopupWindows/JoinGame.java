package GUI.PopupWindows;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import GUI.MainFrame;

public class JoinGame 
{
	static JFrame joinGameIDCorrectPopup = new JFrame();
	
	public JoinGame()
	{
		JFrame joinGame = new JFrame();
		Object joinGamePopup = JOptionPane.showInputDialog(joinGame, 
				"Enter Game Id:");
		
				/*
				 * This is for 
				 * the cancel button
				 */
				if(joinGamePopup == null)
				{	
				new ConfirmJoinGameQuit();
					
				}
				
				// This is for the blank username
				else if(joinGamePopup.equals(""))
				{
					new NoGameId();
				}
				
				/*
				 * This will join the game 
				 * Id that was entered
				 */
				else
				{
					JoinGameCorrectID();		//initiates the New Game or Join Game popup
				}
	}
	
	public void JoinGameCorrectID()
	{
		int joinGameCorrectIDPopup = JOptionPane.showConfirmDialog(
				joinGameIDCorrectPopup,
				"Is This Game ID Correct?" + "\n"  +
				"Game ID Goes Here?",
				"Game ID",
			    JOptionPane.YES_NO_OPTION);
		

		
				if (joinGameCorrectIDPopup == JOptionPane.YES_OPTION)
				{
					new MainFrame();
				}
				else
				{
					new JoinGame();
				}
				
	}
}
