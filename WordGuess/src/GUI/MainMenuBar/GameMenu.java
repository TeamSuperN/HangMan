package GUI.MainMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import GUI.MainFrame;

public class GameMenu extends JMenu
{
	JMenuItem newGame;	
	JMenuItem joinGame;
	JMenuItem quitGame;
	JMenuItem voteToQuit;
	JMenuItem exitItem;

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
		
		//add action listeners to the objects
		addActionListeners();
		
		//******setMnemonicsKeys********//
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));		//CTRL+X
		voteToQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));	//ctlr+Q
		//passHost.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));		//ctrl+H
											
		//add them to game menu
		add(newGame);
		add(joinGame);
		addSeparator();
		add(quitGame);
		add(voteToQuit);
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
		//////////////////////////////////////////////////////////////////////////////////////////
		newGame.addActionListener (new ActionListener ()										//
			{																					//
				 public void actionPerformed (ActionEvent e) 									//
				 {																				//
					    int action = JOptionPane.showConfirmDialog(new JFrame(),				//
					    		"Confirm If You Want To Start A New Game","New Game",			//
					    		JOptionPane.OK_CANCEL_OPTION);									//
					            																//
					    if(action == JOptionPane.OK_OPTION ) 									//
					    {																		//
					    																		//
					    																		//
					    }																		//
					    																		//
					    else if (action == JOptionPane.CANCEL_OPTION )							//
					    {																		//
					    						
					    }																		//
				 }																				//
			});																					//
			//////////////////////////////////////////////////////////////////////////////////////
		
		/*
		 * 	Creates a dialog to quit the game
		 * 	This doesn't create anything other
		 *  than the dialog and exit(yet)
		 */
		//////////////////////////////////////////////////////////////////////////////////////////
		quitGame.addActionListener (new ActionListener ()									    //
			{																					//
				 public void actionPerformed (ActionEvent e) 									//
				 {																				//														//
					    int action = JOptionPane.showConfirmDialog(new JFrame(),				//
					    		"Confirm If You Want To Quit","Confirm Quit",					//
					    		JOptionPane.OK_CANCEL_OPTION);									//
					            																//
					    if(action == JOptionPane.OK_OPTION ) 									//
					    {																		//						
					    	System.exit(0);														//																//
					    }																		//
					    																		//															// 
				 }																				//
			});																					//
			//////////////////////////////////////////////////////////////////////////////////////
		
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
		
		/* **************************
		 * 	This is a built in Exit *
		 *  button for the menu bar *
		 *  to  close  the   entire *
		 *  application.			*
		 *************************  */                 										  
		//////////////////////////////////////////////////////////////////////////////////////
		exitItem.addActionListener (new ActionListener ()									//
		{																					//
			 public void actionPerformed (ActionEvent e) 									//
			 {																				//
				 //JFrame Frame = new JFrame("Exit");										//	
				 																			//	
				 String text = JOptionPane.showInputDialog(new JFrame(),					//
				    		"Input Your User Name.","Enter User Name",						//
				    		JOptionPane.OK_OPTION|JOptionPane.INFORMATION_MESSAGE);			//
				 																			//
				 																			//
				    int action = JOptionPane.showConfirmDialog(new JFrame(),				//
				    		"Confirm If You Want To Exit","Confirm Quit",					//
				    		JOptionPane.OK_CANCEL_OPTION);									//
				            																//
				    if(text != null && action == JOptionPane.OK_OPTION ) 					//
				    {																		//
				    																		//
				    	System.exit(0);														//
				    }																		//
				    																		//
				    else if (action == JOptionPane.CANCEL_OPTION && text != null)			//
				    {																		//
				    	System.exit(0);														//
				    }																		//
			 }																				//
		});																					//
		//////////////////////////////////////////////////////////////////////////////////////
	}
}
