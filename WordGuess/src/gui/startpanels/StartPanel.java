package gui.startpanels;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import gui.GameFrame;
import gui.StartGameFrame;
import tools.Actions;
import tools.GameIDGenerator;
import tools.UserInteraction;

public class StartPanel extends JPanel
{
	private static StartGameFrame startGameFrame;
	
	private static GameFrame gameFrame;
	private JPanel startGamePanel;
	private JLabel userName;
	private JButton newGame;
	private JButton joinGame;
	
	private JButton exitGame;
	protected Window disposeOnCloseStartGameFrame;
	
	
	public StartPanel()
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
						//startGameFrame.setVisible(false);
						initGameFrame();
						GameIDGenerator.displayNewGameID();				
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
						
						StartGameFrame.initGameFrame();
						Actions.joinGame();
						startGameFrame.dispose();		
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
	
	
	
}

	

