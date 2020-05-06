package view.game.panels.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import controller.Actions;
import model.Player;
import tools.GameIDGenerator;
import tools.UserInteraction;
import view.game.frame.GameFrame;
import view.lobby.frame.LobbyFrame;

public class GameMenu extends JMenu
{
	JMenuItem newGame;	
	JMenuItem joinGame;
	JMenuItem quitGame;
	JMenuItem voteToQuit;
	JMenuItem exitItem;
	JMenuItem guessWordButton;

	public GameMenu(String title)
	{
		//initialize game menu with title
		super(title);
		
		//initialize game menu objects
		newGame = new JMenuItem("New Game");	
		joinGame = new JMenuItem("Join Game");
		quitGame = new JMenuItem("Quit Game");
		voteToQuit = new JMenuItem("Vote To Quit...");
		exitItem = new JMenuItem("Exit");
		guessWordButton = new JMenuItem("Quess The Word");
		
		
		
		//add action listeners to the objects
		addActionListeners();
		
		//******setMnemonicsKeys********//
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));		//CTRL+X
		voteToQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));	//ctlr+Q
		guessWordButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));	//ctlr+W
		
		//passHost.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));		//ctrl+H
											
		//add them to game menu
		add(newGame);
		add(joinGame);
		addSeparator();
		add(quitGame);
		add(voteToQuit);
		addSeparator();
		add(guessWordButton);
		addSeparator();
		add(exitItem);
		
		//TODO: Make Quit Game visible when player is in a game.
		//For now, quit game is always non visible
		quitGame.setVisible(false);
	}
	
	private void addActionListeners() {
		/*
		 * 	Creates a dialog to Start a new
		 * 	This doesn't create anything other
		 *  than the dialog.
		 */
		newGame.addActionListener (new ActionListener ()										
		{																					
			 public void actionPerformed (ActionEvent e) 											
			 {																				
				 GameIDGenerator.displayGameID(GameIDGenerator.generateGameID());		
			 }																				
		});
		
		/* **************************
		 * 	This is a built in Exit *
		 *  button for the menu bar *
		 *  to  close  the   entire *
		 *  application.			*
		 *************************  */                 										  
		joinGame.addActionListener (new ActionListener ()									
		{																					
			 public void actionPerformed (ActionEvent e) 									
			 {																				
				 Actions.joinGame();																
			 }																	
		});	
		
		/*
		 * 	Creates a dialog to quit the game
		 * 	This doesn't create anything other
		 *  than the dialog and exit(yet)
		 */
		quitGame.addActionListener (new ActionListener ()									
			{																					
				 public void actionPerformed (ActionEvent e) 									
				 {																				
					 UserInteraction.confirmQuitGame();
					 new LobbyFrame();
					//TODO: make gameFrame Close
					//GameMenu.dispose();
				 }																				
			});						
		
		/*
		 * 	Creates a dialog to vote to quit the game
		 * 	This doesn't create anything other
		 *  than the dialog and exit(yet)
		 */
		//////////////////////////////////////////////////////////////////////////////////////////
		voteToQuit.addActionListener (new ActionListener ()										//
			{																					//
				 public void actionPerformed (ActionEvent e) 									//
				 {																				//
					    int action = JOptionPane.showConfirmDialog(new JFrame(),				//
					    		"Confirm If You Want To Vote To Quit The Game",					//
					    		"Confirm Vote To Quit",											//
					    		JOptionPane.OK_CANCEL_OPTION);									//
					            																//
					    if(action == JOptionPane.OK_OPTION) 									//
					    {																		//
					    																		//
					    																		//
					    	Object[] options = {"Yes",											//
				                    "No"};														//
					    																		//
					    	@SuppressWarnings("unused")											//
							int n = JOptionPane.showOptionDialog(new JFrame(),					//
					    		    "Would you like To Quit This Game?",						//
					    		    "Vote To Quit",												//
					    		    															//
					    		    JOptionPane.YES_NO_OPTION,									//
					    		    JOptionPane.QUESTION_MESSAGE,								//
					    		    null,														//
					    		    options,													//
					    		    options[1]);												//
					    }																		//																//
				 }																				//
			});																					//
			//////////////////////////////////////////////////////////////////////////////////////
		
		guessWordButton.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				
				String wordGuessed = UserInteraction.queryGuessWord();
				
				//If user uses cancel option or closes the popup window
				if (wordGuessed == null) {
					//Do nothing and go back to game
				}
				else {
					wordGuessed = wordGuessed.toUpperCase();
					JButton btn = (JButton)e.getSource();
					GameFrame gFrame = (GameFrame)btn.getTopLevelAncestor();
					String wordToSolve = gFrame.model.game.curRound.curTurn.wordToSolve;
					Player player = gFrame.model.game.pList.get(0);			//Current player will not always be at index 0. Will need to modify later
				
					if (wordToSolve.equals(wordGuessed)) {
						gFrame.getGamePanel().displayAnswer(wordGuessed);
						JOptionPane.showMessageDialog(new JFrame(), "You solved the word! Good job! \n" + 
																	"You win 100 bonus points!");
						player.correctWordGuess();
						gFrame.getGamePanel().clear();
						gFrame.getRightPanel().getWordsGuessedPanel().clear();
						gFrame.getRightPanel().getLettersGuessedPanel().disableButtons();
					}
					else {
						player.incorrectWordGuess();
						gFrame.getRightPanel().getWordsGuessedPanel().addWord(wordGuessed);
					}
					gFrame.getUserNamePanel().getGameTable().refresh();
				}
			}			
		});
		
		/* **************************
		 * 	This is a built in Exit *
		 *  button for the menu bar *
		 *  to  close  the   entire *
		 *  application.			*
		 *************************  */                 										  
		exitItem.addActionListener (new ActionListener ()									
		{																					
			 public void actionPerformed (ActionEvent e) 									
			 {																				
				 UserInteraction.confirmExitGame();
			 }																				
		});		
	}
}
