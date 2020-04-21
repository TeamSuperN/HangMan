package view.lobby.panels;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import actions.Actions;
import view.lobby.frame.LobbyFrame;
import view.tools.GameIDGenerator;
import view.tools.UserInteraction;

public class LobbyPanel extends JPanel
{
	private JLabel userName;
	private JButton newGame;
	private JButton joinGame;
	private JButton exitGame;
	private boolean newOrJoinGameChosen = false;
	
	public LobbyPanel()
	{
		/*
		 * This sets the dimension that the MainFrame
		 *  sees the UserNamePanel to look like
		 */
		Dimension dim = getPreferredSize();	
		dim.width = 150; 
		
		
		setPreferredSize(dim);
		//////////////////////////
		
		//******creates a random buttom add a holding space here********//
				//startGamePanel = new JPanel();
				userName = new JLabel("User Name Goes Here!!");
				newGame = new JButton("New Game");
				joinGame = new JButton("Join Game");
				exitGame = new JButton("Exit Game");
				//BoxLayout boxlayout = new BoxLayout(startGamePanel, BoxLayout.Y_AXIS);
				setLayout(new GridLayout(5,1, 15, 15));	//makes a new flowlayout
				
				//******sets a popout trim for the tool bar ***************//
				setBorder(BorderFactory.createRaisedBevelBorder());
				add(userName);
				add(newGame);							//adds hellobutton to toolbar
				add(joinGame);
			
				add(exitGame);

				/*
				 * will generate a new game 
				 * Id that the user will 
				 * send to users to join
				 * game
				 */
				newGame.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) 
					{
						GameIDGenerator.displayGameID(GameIDGenerator.generateGameID());
						setNewOrJoinGameChosenFlag(true);
						closeFrame(e);
					}
					
				});
				
				/*
				 * 	will display a popup that 
				 * 	displays the Join game Id
				 *  Inputer
				 */
				joinGame.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) 
					{
						
						Actions.joinGame();
						setNewOrJoinGameChosenFlag(true);
						closeFrame(e);	
					}
					
				});
				
				
				
				/*
				 * 	Will display a popup for 
				 * 	Exiting the entire game
				 */
				exitGame.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) 
					{
						UserInteraction.confirmExitGame();		
					}
					
				});
		}
	
	public void setNewOrJoinGameChosenFlag(boolean flag) {
		this.newOrJoinGameChosen = flag;
	}
	
	public boolean newOrJoinGameChosen() {
		return newOrJoinGameChosen;
	}
	
	private void closeFrame(ActionEvent e) {
		JButton thisBTN = (JButton)e.getSource();
		LobbyFrame thisFrame = (LobbyFrame)thisBTN.getTopLevelAncestor();
		thisFrame.dispatchEvent(new WindowEvent(thisFrame, WindowEvent.WINDOW_CLOSING));
	}
	
	private class NewGameEvent extends WindowEvent {
		
		

		public NewGameEvent(Window source, int id) {
			super(source, id);
		}
		
	}
}

	

