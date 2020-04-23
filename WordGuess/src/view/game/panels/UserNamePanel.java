package view.game.panels;


import java.awt.Dimension;

import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

import model.Player;
import view.game.panels.usernamepanel.GameTable;

import java.awt.Component;


@SuppressWarnings("serial")
public class UserNamePanel extends JPanel
{
//**** initializes the components*****//
	private GameTable gameTable;
		
	/*
	 * 	This is temporarily holding these user labels and 
	 *  TextFields later when we have actual  users  this 
	 *  will take in the users logged into the  game  and 
	 *  store them in order. Note that in the MAin  Frame 
	 *  I have put a spot that is in the menu panel  that 
	 *  will hide this panel.
	 */
	@SuppressWarnings("deprecation")	//Don't know what this does?
	public UserNamePanel(Player player)
	{
		setBackground(new Color(112, 128, 144));
		/*
		 * This sets the dimension that the MainFrame
		 *  sees the UserNamePanel to look like
		 */
		Dimension dim = getPreferredSize();	
		dim.width = 500;
		dim.height = 200;
		
		setPreferredSize(new Dimension(545, 495));
		//////////////////////////
				
		gameTable = new GameTable(player);
		gameTable.setBackground(new Color(255, 255, 255));
		JScrollPane scrollPane = new JScrollPane(gameTable);		//need for the title row
		scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(240, 255, 255), new Color(240, 255, 255)));
					
		/* ********************************************
		 * This area is how to create a custom border *
		 * with labels and make the border uniform on *
		 * all four sides.							  *
		 ******************************************** */
		Border innerBorder = BorderFactory.createTitledBorder("Players in Game: ");		//creates the title
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);				//creates the exterior dimensions
		
		scrollPane.setSize(300,200);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));	//combines the two bits of border information
				
		gameTable.disable();
		add(scrollPane);	
	}
}
