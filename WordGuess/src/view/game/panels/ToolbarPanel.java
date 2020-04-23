package view.game.panels;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.Actions;
import model.RemainingLetterList;
import tools.GameIDGenerator;
import tools.UserInteraction;
import view.game.panels.menubar.GameMenu;
import view.lobby.frame.LobbyFrame;
import java.awt.Color;
import javax.swing.border.BevelBorder;

/*
 * 	This i a holder for the tool bar and when the 
 *  time comes this can be the tool bar class that 
 *  will be in the app
 */
@SuppressWarnings("serial")
public class ToolbarPanel extends JPanel
{
//**** initializes the components*****//
	private JButton newGame;
	private JButton joinGame;
	private JButton quitGame;
	private JButton exitGame;
	private JButton guessWord;
	
	/*
	 * Creates a tool Bar on 
	 * the Main Frame Class
	 */
	public ToolbarPanel()
	{
		setBackground(Color.DARK_GRAY);
		setForeground(new Color(176, 224, 230));
//******creates a random buttom add a holding space here********//
		newGame = new JButton("New Game");
		newGame.setBackground(new Color(128, 128, 128));
		joinGame = new JButton("Join Game");
		joinGame.setBackground(new Color(128, 128, 128));
		quitGame = new JButton("Quit Game");
		quitGame.setBackground(new Color(128, 128, 128));
		exitGame = new JButton("Exit Game");
		exitGame.setBackground(new Color(128, 128, 128));
		guessWord = new JButton("Guess Word");
		guessWord.setBackground(new Color(128, 128, 128));
		setLayout(new FlowLayout(FlowLayout.LEFT));	//makes a new flowlayout

//******sets a popout trim for the tool bar ***************//
		setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		add(newGame);							//adds hellobutton to toolbar
		add(joinGame);
		add(quitGame);
		add(exitGame);
		add(guessWord);
		
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
			}
			
		});
		
		/*
		 * 	will display a popup for 
		 * 	Exiting this game play
		 */
		quitGame.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) 
			{
				UserInteraction.confirmQuitGame();
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
		
		/*
		 *  Game Play will end for 10 secs
		 *  for user to input text
		 */
		guessWord.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) 
			{
					
			}
			
		});
		
		//Button for testing purposes
		RemainingLetterList rll = new RemainingLetterList();
		JButton test = new JButton("Test");
		test.setBackground(new Color(128, 128, 128));
		add(test);
		test.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String letter = JOptionPane.showInputDialog(
						"Current letter list: " + "\n" +
								rll + "\n" +
						"Enter a letter to remove from the letter list:");
				rll.remove(letter);
				JOptionPane.showMessageDialog(new JPanel(), 
						"New letter list: " + "\n" +
								rll);
			}
		});
		
	}
}
