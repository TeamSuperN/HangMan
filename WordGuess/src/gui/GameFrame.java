package gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import gui.panels.GamePanel;
import gui.panels.LettersPanel;
import gui.panels.SubmitPanel;
import gui.panels.ToolbarPanel;
import gui.panels.UserNamePanel;
import gui.panels.MenuBar;

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
	private static StartGameFrame startGameFrame;
//**create private classes to be used as components of the main frame***//
	private UserNamePanel userNamePanel;
	private ToolbarPanel toolbar;
	private GamePanel gamePanel;
	private SubmitPanel submitPanel;
	private LettersPanel lettersUsedPanel;
	private MenuBar mainMenuBar;
	
	public GameFrame()
	{
		super ("HangMan!");
		
		setLayout(new BorderLayout());
		
//******Initialize all the panels*****//
		toolbar = new ToolbarPanel();
		userNamePanel = new UserNamePanel();
		gamePanel = new GamePanel();
		submitPanel = new SubmitPanel();
		lettersUsedPanel = new LettersPanel();
		mainMenuBar = new MenuBar();
		
//******add all panels to the MainFrame component*****//
		add(userNamePanel, BorderLayout.WEST);
		add(lettersUsedPanel, BorderLayout.EAST);
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
		userNamePanel.setBackground(Color.lightGray);
		toolbar.setBackground(Color.lightGray);
		lettersUsedPanel.setBackground(Color.lightGray);
		gamePanel.setBackground(Color.DARK_GRAY);
		submitPanel.setBackground(Color.lightGray);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);										
		setVisible(true);
		toFront();
	}
	
}

