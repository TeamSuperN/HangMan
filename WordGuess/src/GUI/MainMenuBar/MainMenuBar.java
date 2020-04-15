package GUI.MainMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import GUI.MainFrame;
import GUI.InterfacePanels.UserNamePanel;
import GUI.MainMenuBar.GameMenu;

public class MainMenuBar extends JMenu
{
	private JMenu gameMenu;
	private WindowMenu windowMenu;
	/*
	 * 	This creates the custom MenuBar 
	 * 	In the Future it would probably 
	 * 	be smart to find a way to 
	 * 	seperate this into its own class
	 */
	public MainMenuBar()														
	{																						//
		JMenuBar menuBar = new JMenuBar();	
		GameMenu windowMenu = new GameMenu("Game Menu");
	
		
		//******addtoMenuBar*********//														//
		menuBar.add(gameMenu);																//
				
		////////////////////////WindowMenuTab//////////////									//	
		JMenu windowMenu = new JMenu("Window");												//
		JMenuItem newWindow = new JMenuItem("New Window");									//
		JMenu showMenu = new JMenu("Show");													//
		JCheckBoxMenuItem usersLoggedInPanel = new JCheckBoxMenuItem("Users In Game");		//
		usersLoggedInPanel.setSelected(true);												//
		JMenuItem PreferrencesItem = new JMenuItem("Preferrences");							//
																							//
		//*******addToShowMenu*******//														//
		showMenu.add(usersLoggedInPanel);													//

//******this shows and unshows the panel****************************// 
//******that holds the users logged on*****************************// 
		usersLoggedInPanel.addActionListener(new ActionListener()							//
			{																				//
				public void actionPerformed(ActionEvent ev)									//
				{																			//
					JCheckBoxMenuItem menuItem = (JCheckBoxMenuItem)ev.getSource(); 		//
					UserNamePanel.setVisible(menuItem.isSelected());						//
				}																			//
			});																				//
																							//
		//		addtoWindowMenu		//														//
		windowMenu.add(newWindow);															//
		windowMenu.add(showMenu);															//
		windowMenu.add(PreferrencesItem);													//
																							//
		//******addtoMenuBar*******//														//
		menuBar.add(windowMenu);															//
	//////////////////////////////////////////////////////////////////////////////////////
	
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
					    int action = JOptionPane.showConfirmDialog( MainFrame.this,				//
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
		personalQuit.addActionListener (new ActionListener ()									//
			{																					//
				 public void actionPerformed (ActionEvent e) 									//
				 {																				//
					 //JFrame Frame = new JFrame("Exit");										//	
					 																			//	
					 																			//
					    int action = JOptionPane.showConfirmDialog( MainFrame.this,				//
					    		"Confirm If You Want To Quit","Confirm Quit",					//
					    		JOptionPane.OK_CANCEL_OPTION);									//
					            																//
					    if(action == JOptionPane.OK_OPTION ) 									//
					    {																		//
					    								
					    	System.exit(0);														//
					    																		//
					    }																		//
					    																		//
					    else if (action == JOptionPane.CANCEL_OPTION )							//
					    {																		//
					    						       											//
					    }																		// 
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
					    int action = JOptionPane.showConfirmDialog( MainFrame.this,				//
					    		"Confirm If You Want To Vote To Quit The Game",					//
					    		"Confirm Vote To Quit",											//
					    		JOptionPane.OK_CANCEL_OPTION);									//
					            																//
					    if(action == JOptionPane.OK_OPTION) 									//
					    {																		//
					    	
					    																		//
					    	Object[] options = {"Yes",											//
				                    "No"};														//
					    																		//
					    	@SuppressWarnings("unused")
							int n = JOptionPane.showOptionDialog(MainFrame.this,				//
					    		    "Would you like To Quit This Game?",						//
					    		    "Vote To Quit",												//
					    		    															//
					    		    JOptionPane.YES_NO_OPTION,									//
					    		    JOptionPane.QUESTION_MESSAGE,								//
					    		    null,														//
					    		    options,													//
					    		    options[1]);	
					    }																		//
					    																		//
					    else if (action == JOptionPane.CANCEL_OPTION )							//
					    {																		//
					    	
					    }																		//
				 }																				//
			});																					//
			//////////////////////////////////////////////////////////////////////////////////////
		
		/*
		 * 	creates a pass host to next in 
		 *  game line dialog, but doesn't 
		 *  do anything else yet 
		 */
		//////////////////////////////////////////////////////////////////////////////////////
		passHost.addActionListener (new ActionListener ()									//
				{																			//
					 public void actionPerformed (ActionEvent e) 							//
					 {																		//
						 //JFrame Frame = new JFrame("Exit");								//	
						 																	//	
						 																	//
						    int action = JOptionPane.showConfirmDialog( MainFrame.this,		//
						    		"Confirm If You Want Pass Host","Confirm Pass Host",	//
						    		JOptionPane.OK_CANCEL_OPTION);							//
						            														//
						    if(action == JOptionPane.OK_OPTION ) 							//
						    {																//
							    															//
						    																//
						    }																//
						    																//
						    else if (action == JOptionPane.CANCEL_OPTION )					//
						            {														//
						    	
						            }														//
					 }																		//
				});																			//
				//////////////////////////////////////////////////////////////////////////////
		
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
				 String text = JOptionPane.showInputDialog( MainFrame.this,					//
				    		"Input Your User Name.","Enter User Name",						//
				    		JOptionPane.OK_OPTION|JOptionPane.INFORMATION_MESSAGE);			//
				 																			//
				 																			//
				    int action = JOptionPane.showConfirmDialog( MainFrame.this,				//
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
		
					
		//******setMnemonicsKeys********//
		fileMenu.setMnemonic(KeyEvent.VK_F);
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));		//CTRL+X
		voteToQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));	//ctlr+Q
		passHost.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));		//ctrl+H
		
		return menuBar;
	}		
}
