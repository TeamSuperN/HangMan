package view.game.panels.ToolBars;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

import controller.Actions;
import tools.GameIDGenerator;
import tools.UserInteraction;
import view.game.frame.GameFrame;

public class ToolBar_1 extends JToolBar
{
	//**** initializes the components*****//
		private JButton newGame;
		private JButton joinGame;
		private JButton quitGame;
		private JButton exitGame;
		private JButton testGamePanel;
		
		/*
		 * Creates a tool Bar on 
		 * the Main Frame Class
		 */
		public ToolBar_1()
		{
			setFloatable(false);
			String imageExit = "/images/warning-2.gif";
			String imageNewGame = "/images/startGame.gif";
			String imageJoinGame = "/images/joinGame.gif";
			String imageQuitGame = "/images/delete.gif";
			String imageTestGameFunction = "/images/expand-window.gif";
			
			setBackground(Color.DARK_GRAY);
			
			//setBackground(Color.DARK_GRAY);
			//setForeground(new Color(128, 128, 128));
	//******creates a random buttom add a holding space here********//
			newGame = new JButton();
			joinGame = new JButton();
			quitGame = new JButton();
			exitGame = new JButton();
			testGamePanel = new JButton();
			
			
			newGame.setIcon(createIcon(imageNewGame));
			joinGame.setIcon(createIcon(imageJoinGame));
			exitGame.setIcon(createIcon(imageExit));
			quitGame.setIcon(createIcon(imageQuitGame));
			testGamePanel.setIcon(createIcon(imageTestGameFunction));
				
			newGame.setToolTipText("Join Game");
			joinGame.setToolTipText("New Game");
			exitGame.setToolTipText("Quit Game");
			quitGame.setToolTipText("Exit Game");
			testGamePanel.setToolTipText("Game Panel Test");
	//******creates color format for the buttons********//
			newGame.setBackground(new Color(128, 128, 128));
			joinGame.setBackground(new Color(128, 128, 128));
			quitGame.setBackground(new Color(128, 128, 128));
			exitGame.setBackground(new Color(128, 128, 128));
			testGamePanel.setBackground(new Color(128, 128, 128));
			
			newGame.setForeground(new Color(0, 191, 255));
			joinGame.setForeground(new Color(0, 191, 255));
			quitGame.setForeground(new Color(0, 191, 255));
			exitGame.setForeground(new Color(0, 191, 255));
			testGamePanel.setForeground(new Color(0, 191, 255));
			
			
			setLayout(new FlowLayout(FlowLayout.LEFT));	//makes a new flowlayout

	//******sets a popout trim for the tool bar ***************//
			//setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
			add(newGame);							//adds hellobutton to toolbar
			add(joinGame);
			add(quitGame);
			add(exitGame);
			
			
			//Button for testing populating game play panel w/ a word to guess
					
					add(testGamePanel);
					testGamePanel.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) 
						{
							String word = JOptionPane.showInputDialog(
									"Enter a word to guess:");
							
							word = word.toUpperCase();
							
							JButton btn = (JButton)e.getSource();
							GameFrame gf = (GameFrame)btn.getTopLevelAncestor();
							gf.getGamePanel().populateWordToSolve(word);
							gf.model.game.curRound.newTurn(word);
							gf.getRightPanel().getLettersGuessedPanel().enableButtons();
						}
					});
			
			
			
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
		}
		
		private ImageIcon createIcon(String path)
		{
			
			URL url = getClass().getResource(path);
		
			if (url == null)
			{
				System.out.println("Image not able to load: " + path);
			}
			ImageIcon icon = new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT));
			
			return icon;
		}
}
