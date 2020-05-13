package view.game.frame;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import model.Model;
import model.Player;
import view.game.panels.GamePanel;
import view.game.panels.RightPanel;
import view.game.panels.MenuBar;
import view.game.panels.SubmitPanel;
import view.game.panels.ToolBars.ToolbarPanel;
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
	private ToolbarPanel toolbarPanel;
	private GamePanel gamePanel;
	private SubmitPanel submitPanel;
	private RightPanel rightPanel;
	private MenuBar mainMenuBar;
	public Model model;				//Temp model used for testing purposes. Removed once actual model is implemented in server app.
	private JSplitPane splitPaneGamePanelandRightPanel;
	private JSplitPane splitPaneUserPanelAndGamePanel;
	
	//Variable here for testing purposes only. Remove after server app is implemented
	private Vector<Player> playerList = new Vector<Player>();
	
	public GameFrame(Model model, String userChoice)
	{
		super ("HangMan!");
		
		this.model = model;
		
		setLayout(new BorderLayout());
		
//******Initialize all the panels*****//
		toolbarPanel = new ToolbarPanel();
		gamePanel = new GamePanel();
		submitPanel = new SubmitPanel();
		rightPanel = new RightPanel();
		mainMenuBar = new MenuBar();
		userNamePanel = new UserNamePanel();
		gamePanel.setSize(new Dimension(900, 800));
		rightPanel.setSize(new Dimension(150, 800));
		userNamePanel.setSize(new Dimension(150, 800));
		
		splitPaneUserPanelAndGamePanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, userNamePanel, gamePanel);
		splitPaneGamePanelandRightPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, 
						splitPaneUserPanelAndGamePanel, new JScrollPane(rightPanel));
		
		
		
		splitPaneGamePanelandRightPanel.setOneTouchExpandable(true);
		splitPaneUserPanelAndGamePanel.setOneTouchExpandable(true);
		
		splitPaneUserPanelAndGamePanel.setResizeWeight(.5);
		splitPaneGamePanelandRightPanel.setResizeWeight(.5);
		
		
		
		//splitPaneUserPanelAndGamePanel.setResizeWeight(1.0);
		
		
//******add all panels to the MainFrame component*****//
		//getContentPane().add(splitPaneGamePanelandRightPanel, BorderLayout.CENTER);
		add(splitPaneGamePanelandRightPanel, BorderLayout.CENTER);
		
		add(toolbarPanel, BorderLayout.PAGE_START);
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
		
		userNamePanel.getGameTable().refresh();
	}
	
	public GamePanel getGamePanel() {
		return gamePanel;
	}
	
	public UserNamePanel getUserNamePanel() {
		return userNamePanel;
	}
	
	public RightPanel getRightPanel() {
		return rightPanel;
	}
}

