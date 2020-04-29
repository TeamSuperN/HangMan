package view.game.panels;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import view.game.panels.usernamepanel.GameTable;
import javax.swing.border.BevelBorder;

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
	
	public UserNamePanel()
	{
		setBackground(Color.DARK_GRAY);
		/*
		 * This sets the dimension that the MainFrame
		 *  sees the UserNamePanel to look like
		 */
		Dimension dim = getPreferredSize();	
		dim.width = 500;
		dim.height = 200;
		
		/*
		 * This is the Dimensions for Scroll
		 * Pane
		 */
		Dimension dimScrollPane = getPreferredSize();
		dimScrollPane.width = 250;
		dimScrollPane.height = 250;
				
		
		setPreferredSize(new Dimension(300, 495));
		//////////////////////////
				
		gameTable = new GameTable();
		gameTable.setBackground(new Color(211, 211, 211));				//Changes text area color
		gameTable.setFont(new Font("Serif", Font.BOLD, 14));
		gameTable.setRowHeight(22);
		
		
		gameTable.setShowGrid(isEnabled());
		gameTable.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(gameTable);		//need for the title row
		//scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(240, 255, 255), new Color(240, 255, 255)));
		//scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 128)));
		scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY));
		scrollPane.setBackground(new Color(128, 128, 128));
		scrollPane.setPreferredSize(dimScrollPane);
		scrollPane.resize(getWidth(), getHeight());
		
		/* ********************************************
		 * This area is how to create a custom border *
		 * with labels and make the border uniform on *
		 * all four sides.							  *
		 ******************************************** */				
		setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Players in Game: ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255))));		//combines the two bits of border information
				
		add(scrollPane);	
		
	}
	
	public GameTable getGameTable() {
		return gameTable;
	}
	
}
