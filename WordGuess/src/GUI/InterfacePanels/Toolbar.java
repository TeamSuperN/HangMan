package GUI.InterfacePanels;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import GUI.PopupWindows.ConfirmQuitPopup;
import GUI.PopupWindows.GameIDGenerated;
import GUI.PopupWindows.JoinGame;
import GUI.PopupWindows.UserNamePopup;

/*
 * 	This i a holder for the tool bar and when the 
 *  time comes this can be the tool bar class that 
 *  will be in the app
 */
@SuppressWarnings("serial")
public class Toolbar extends JPanel
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
	public Toolbar()
	{
//******creates a random buttom add a holding space here********//
		newGame = new JButton("New Game");
		joinGame = new JButton("Join Game");
		quitGame = new JButton("Quit Game");
		exitGame = new JButton("Exit Game");
		guessWord = new JButton("Guess Word");
		setLayout(new FlowLayout(FlowLayout.LEFT));	//makes a new flowlayout

//******sets a popout trim for the tool bar ***************//
		setBorder(BorderFactory.createRaisedBevelBorder());
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
				new GameIDGenerated();				
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
				new JoinGame();				
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
				new ConfirmQuitPopup();				
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
				new ConfirmQuitPopup();				
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
				//new UserNamePopup();				
			}
			
		});
	}
	
	
	
	
	
}
