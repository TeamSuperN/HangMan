package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.border.Border;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormPanel extends JPanel implements ActionListener
{
	private JLabel userOnline;
	private JLabel userHost;
	private JLabel user2;
	private JLabel user3;
	private JLabel user4;
	private JLabel user5;
	private JLabel user6;
	private JTextField userHostName;
	private JTextField user2Name;
	private JTextField user3Name;
	private JTextField user4Name;
	private JTextField user5Name;
	private JTextField user6Name;
	
	private JButton startGame;
	private JButton answerButton;
	private JButton submitButton;
	
	/*
	 * 	This is temporarily holding these user labels and 
	 *  TextFields later when we have actual  users  this 
	 *  will take in the users logged into the  game  and 
	 *  store them in order. Note that in the MAin  Frame 
	 *  I have put a spot that is in the menu panel  that 
	 *  will hide this panel.
	 */
	public FormPanel()
	{
		Dimension dim = getPreferredSize();	
		dim.width = 300; 
		setPreferredSize(dim);
		
		/* ********************************************
		 * 		creates all the new JLabels and
		 * 		TextFields to input the usernames
		 *		in their log in order of the user then 
		 * 		finally create the buttons
		 ******************************************** */
		userOnline = new JLabel("Users Logged Into Game:");
		userHost = new JLabel("Host:  ");
		user2 = new JLabel("User 2:  ");
		user3 = new JLabel("User 3:  ");
		user4 = new JLabel("User 4:  ");
		user5 = new JLabel("User 5:  ");
		user6 = new JLabel("User 6:  ");
		userHostName = new JTextField(10);
		user2Name = new JTextField(10);
		user3Name = new JTextField(10);
		user4Name = new JTextField(10);
		user5Name = new JTextField(10);
		user6Name = new JTextField(10);
		
		answerButton = new JButton("Give Answer");
		submitButton = new JButton("Submit Answer");
		
		userHostName.setEnabled(false);
		user2Name.setEnabled(false);
		user3Name.setEnabled(false);
		user4Name.setEnabled(false);
		user5Name.setEnabled(false);
		user6Name.setEnabled(false);
		
		
		
		/* ********************************************
		 * This area is how to create a custom border *
		 * with labels and make the border uniform on *
		 * all four sides.							  *
		 ******************************************** */
		Border innerBorder = BorderFactory.createTitledBorder("Players in Game: ");		//creates the title
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);				//creates the exterior dimensions
		
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));	//combines the two bits of border information
		
		layoutComponents();						// creates a layout component
		//setSize(600,500);					
		
		setMinimumSize(new Dimension(400, 420));
		setMaximumSize(new Dimension(500,420));
		
	}
	
	
	
	
		/*
		 * 	this is the GridBagLayout format 
		 *  for the Users in the side panel
		 */
		public void layoutComponents()
		{
			/* **********************************
			 * New layout for the jlabels and   *
			 * jtextfields  					*
			 *********************************  */	
			setLayout(new GridBagLayout());
																				
			setMinimumSize(new Dimension(400, 300));
			setMaximumSize(new Dimension(500,300));
			
			GridBagConstraints gc =new GridBagConstraints();
			gc.gridx = 0;
			gc.gridy = 0;
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;										//how much space it takes up relative to the other cells
			gc.fill = GridBagConstraints.HORIZONTAL;					//do you want up all the space in a cell or not
			gc.anchor = GridBagConstraints.LINE_END;
			
			
	
			
		
///////////////////////////// first Row  /////////////////////////////////////////////////////
gc.gridy = 0;		
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;									//how much space it takes up relative to the other cells
			//gc.gridwidth = 5;
			gc.gridx = 0;										//sets location for x
			
			gc.insets = new Insets(0, 0, 0, 5);
			gc.anchor = GridBagConstraints.LINE_END;
			add(userHost, gc);									//add namefield
			
			//////////////////////////////////////////////////
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;									//how much space it takes up relative to the other cells
			
			gc.gridx = 1;										//sets location for x
			
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(userHostName, gc);							//add occupationfield
	///////////////////////////// next Row  /////////////////////////////////////////////////////	
			gc.gridy++;		
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;									//how much space it takes up relative to the other cells
			
			gc.gridx = 0;										//sets location for x
			
			gc.insets = new Insets(0, 0, 0, 5);
			gc.anchor = GridBagConstraints.LINE_END;
			add(user2, gc);									//add namefield
			
			//////////////////////////////////////////////////
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;									//how much space it takes up relative to the other cells
			
			gc.gridx = 1;										//sets location for x
			
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(user2Name, gc);							//add occupationfield
	///////////////////////////// next Row  /////////////////////////////////////////////////////
			gc.gridy++;		
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;									//how much space it takes up relative to the other cells
			
			gc.gridx = 0;										//sets location for x
			
			gc.insets = new Insets(0, 0, 0, 5);
			gc.anchor = GridBagConstraints.LINE_END;
			add(user3, gc);									//add namefield
			
			//////////////////////////////////////////////////
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;									//how much space it takes up relative to the other cells
			
			gc.gridx = 1;										//sets location for x
			
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(user3Name, gc);							//add occupationfield
	///////////////////////////// next Row  /////////////////////////////////////////////////////
			gc.gridy++;		
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;									//how much space it takes up relative to the other cells
			
			gc.gridx = 0;										//sets location for x
			
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_END;
			add(user4, gc);									//add namefield
			
			//////////////////////////////////////////////////
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;									//how much space it takes up relative to the other cells
			
			gc.gridx = 1;										//sets location for x
			
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(user4Name, gc);							//add occupationfield
	///////////////////////////// next Row  /////////////////////////////////////////////////////
			gc.gridy++;		
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;									//how much space it takes up relative to the other cells
			
			gc.gridx = 0;										//sets location for x
			
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(user5, gc);									//add namefield
			
			//////////////////////////////////////////////////
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;									//how much space it takes up relative to the other cells
			
			gc.gridx = 1;										//sets location for x
			
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(user5Name, gc);							//add occupationfield
	///////////////////////////// next Row  /////////////////////////////////////////////////////
			gc.gridy++;		
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;									//how much space it takes up relative to the other cells
			
			gc.gridx = 0;										//sets location for x
			
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(user6, gc);									//add namefield
			
			//////////////////////////////////////////////////
			gc.weightx = 0; 									//how much space it takes up relative to the other cells
			gc.weighty = 0;									//how much space it takes up relative to the other cells
			
			gc.gridx = 1;										//sets location for x
			
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(user6Name, gc);							//add occupationfield
	
			
			
			
			
		}
}
