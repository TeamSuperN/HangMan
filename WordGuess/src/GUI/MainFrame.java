package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/*
 * 	This runs the entire app 
 * 	protocols. It goes to the 
 * 	different classes and pulls
 * 	everything to initial all
 * 	the different pieces.
 */
public class MainFrame extends JFrame
{
	private FormPanel formPanel;
	private Toolbar toolbar;
	private GamePanel gamePanel;
	private JButton submitButton;
	private JTextField textField;
	private JPanel submitPanel;
	
	
	
	
	public MainFrame()
	{
		super ("HangMan!");
		
		
		setLayout(new BorderLayout());
		toolbar = new Toolbar();
		formPanel = new FormPanel();
		gamePanel = new GamePanel();
		submitButton = new JButton("Submit Answer");
		textField = new JTextField("Input Answer");
		submitPanel = new JPanel();
		
		
		
		setJMenuBar(createMenuBar());
		submitPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		submitPanel.add(submitButton);
		submitPanel.add(textField);
		
		add(formPanel, BorderLayout.WEST);
		add(gamePanel, BorderLayout.CENTER);
		add(toolbar, BorderLayout.NORTH);
		add(submitPanel, BorderLayout.SOUTH);
		
		
		
		setSize(600,300);																	
		setMinimumSize(new Dimension(500, 300));
		
		
		
		formPanel.setSize(400,500);																	
		formPanel.setMinimumSize(new Dimension(500, 300));
		formPanel.setMaximumSize(new Dimension(500,300));
		formPanel.setBackground(Color.lightGray);
		//formPanel.setOpaque(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);										
		setVisible(true);
		
		
	}
		//////////////////////////////////////////////////////////////////////////////////////////
		private JMenuBar createMenuBar()														//
		{																						//
			JMenuBar menuBar = new JMenuBar();													//
																								//
			/////////////////////////FileMenuTab///////////////									//
			JMenu fileMenu = new JMenu("File");													//
			JMenuItem personalQuit =new JMenuItem("Quit Game");									//
			JMenuItem voteToQuit = new JMenuItem("Vote To Quit...");											//
			JMenuItem passHost = new JMenuItem("Pass Host");									//
			
			JMenuItem exitItem = new JMenuItem("Exit");											//
																								//
			//*******addtoFileMenu*********//													//
			fileMenu.add(personalQuit);															//
			fileMenu.add(voteToQuit);															//
			fileMenu.addSeparator();
			fileMenu.add(passHost);																//
			fileMenu.addSeparator();															//
			fileMenu.add(exitItem);																//
																								//
			//******addtoMenuBar*********//														//
			menuBar.add(fileMenu);																//
					
			////////////////////////WindowMenuTab//////////////									//	
			JMenu windowMenu = new JMenu("Window");												//
			JMenuItem newWindow = new JMenuItem("New Window");									//
			JMenu showMenu = new JMenu("Show");													//
			JCheckBoxMenuItem usersLoggedInPanel = new JCheckBoxMenuItem("Users In Game");				//
			usersLoggedInPanel.setSelected(true);														//
			JMenuItem PreferrencesItem = new JMenuItem("Preferrences");							//
					//
			//*******addToShowMenu*******//														//
			showMenu.add(usersLoggedInPanel);															//
			usersLoggedInPanel.addActionListener(new ActionListener()									//
			{																					//
			public void actionPerformed(ActionEvent ev)											//
			{																					//
			JCheckBoxMenuItem menuItem = (JCheckBoxMenuItem)ev.getSource(); 					//
			formPanel.setVisible(menuItem.isSelected());										//
			}																					//
			});																					//
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
						    	System.out.println("User Has left Game");							//
						    	System.exit(0);														//
						    																		//
						    }																		//
						    																		//
						    else if (action == JOptionPane.CANCEL_OPTION )							//
						            {																//
						    	System.out.println("User did not leave the Game");					//
						            }																//
						            																//
					 }																				//
				});																					//
				//////////////////////////////////////////////////////////////////////////////////////
			
			/*
			 * 	Creates a dialog to quit the game
			 * 	This doesn't create anything other
			 *  than the dialog and exit(yet)
			 */
			//////////////////////////////////////////////////////////////////////////////////////////
			voteToQuit.addActionListener (new ActionListener ()										//
				{																					//
					 public void actionPerformed (ActionEvent e) 									//
					 {																				//
						 //JFrame Frame = new JFrame("Exit");										//	
						 																			//	
						 																			//
						    int action = JOptionPane.showConfirmDialog( MainFrame.this,				//
						    		"Confirm If You Want To Vote To Quit The Game",					//
						    		"Confirm Vote To Quit",											//
						    		JOptionPane.OK_CANCEL_OPTION);									//
						            																//
						    if(action == JOptionPane.OK_OPTION) 									//
						    {																		//
						    	System.out.println("User Initiated Vote To Quit The Game");			//
						    																		//
						    	Object[] options = {"Yes",											//
					                    "No"};														//
						    																		//
						    	int n = JOptionPane.showOptionDialog(MainFrame.this,				//
						    		    "Would you like To Quit This Game?",						//
						    		    "Vote To Quit",												//
						    		    															//
						    		    JOptionPane.YES_NO_OPTION,									//
						    		    JOptionPane.QUESTION_MESSAGE,								//
						    		    null,														//
						    		    options,													//
						    		    options[1]);												//
						    																		//
						    }																		//
						    																		//
						    else if (action == JOptionPane.CANCEL_OPTION )							//
						            {																//
						    	System.out.println("User did not Initiated Vote To Quit The Game");	//
						            }																//
						            																//
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
							    	System.out.println("User Has Passed Host");					//
							    	System.exit(0);												//
							    																//
							    }																//
							    																//
							    else if (action == JOptionPane.CANCEL_OPTION )					//
							            {														//
							    	System.out.println("User did not Passed Host");				//
							            }														//
							            														//
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
					    	//textPanel = new JTextPane();										//
					    }																		//
					    																		//
					    else if (action == JOptionPane.CANCEL_OPTION && text != null)			//
					            {																//
					    																		//
					            }																//
					            																//
				 }																				//
			});																					//
			//////////////////////////////////////////////////////////////////////////////////////
			
			
			
			
			/*
			 * 	saveFile set up and
			 * 	ActionListener
			 */
			//////////////////////////////////////////////////////////////////////////////////////
			voteToQuit.addActionListener(new ActionListener()										//
				{																				//
					public void actionPerformed(ActionEvent e)									//
					{																			//
																		//
					}																			//
				});																				//
			//////////////////////////////////////////////////////////////////////////////////////
			
			//******setMnemonicsKeys********//
			fileMenu.setMnemonic(KeyEvent.VK_F);
			exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
			//voteToQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
			//openData.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
			
			return menuBar;
		}
				
}
