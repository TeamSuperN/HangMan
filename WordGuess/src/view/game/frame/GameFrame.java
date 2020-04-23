package view.game.frame;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JFrame;

import model.Player;
import view.game.panels.GamePanel;
import view.game.panels.LettersAndWordsUsedInGame;
import view.game.panels.MenuBar;
import view.game.panels.SubmitPanel;
import view.game.panels.ToolbarPanel;
import view.game.panels.UserNamePanel;

/*
 * 	This runs the entire app 
 * 	protocols. It goes to the 
 * 	different classes and pulls
 * 	everything to initial all
 * 	the different pieces.
 */
@SuppressWarnings("serial")
public class GameFrame extends JFrame
{
//**create private classes to be used as components of the main frame***//
	private UserNamePanel userNamePanel;
	private ToolbarPanel toolbar;
	private GamePanel gamePanel;
	private SubmitPanel submitPanel;
	private LettersAndWordsUsedInGame lettersAndWordsUsedInGame;
	private MenuBar mainMenuBar;
	
	//Variable here for testing purposes only. Remove after server app is implemented
	private Vector<Player> playerList = new Vector<Player>();
	
	public GameFrame(String userName, String userChoice)
	{
		super ("HangMan!");
		
		setLayout(new BorderLayout());
		
//******Initialize all the panels*****//
		toolbar = new ToolbarPanel();
		gamePanel = new GamePanel();
		submitPanel = new SubmitPanel();
		lettersAndWordsUsedInGame = new LettersAndWordsUsedInGame();
		mainMenuBar = new MenuBar();
		
		Player player = new Player(userName);
		playerList.add(player);
		if (userChoice.equals("New")) {
			userNamePanel = new UserNamePanel(player);
		}
		else {
			userNamePanel = new UserNamePanel(player);
		}
		
		
//******add all panels to the MainFrame component*****//
		add(userNamePanel, BorderLayout.WEST);
		add(lettersAndWordsUsedInGame, BorderLayout.EAST);
		add(gamePanel, BorderLayout.CENTER);
		add(toolbar, BorderLayout.NORTH);
		add(submitPanel, BorderLayout.SOUTH);
		setJMenuBar(mainMenuBar);
		
//******sets the MainFrame Size Components*********//
		setExtendedState(JFrame.MAXIMIZED_BOTH); 											
		setUndecorated(false);																
		setVisible(true);															
		setMinimumSize(new Dimension(1400, 500));
		
//******Sets the colors for the panels **************//
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);										
		setVisible(true);
	}
}

