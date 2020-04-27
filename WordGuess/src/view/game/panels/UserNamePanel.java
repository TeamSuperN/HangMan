package view.game.panels;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import view.game.panels.usernamepanel.GameTable;

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
		
		setPreferredSize(new Dimension(545, 495));
		//////////////////////////
				
		gameTable = new GameTable();
		gameTable.setBackground(new Color(128, 128, 128));
		JScrollPane scrollPane = new JScrollPane(gameTable);		//need for the title row
		scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(240, 255, 255), new Color(240, 255, 255)));
		scrollPane.setSize(300,200);
		
		/* ********************************************
		 * This area is how to create a custom border *
		 * with labels and make the border uniform on *
		 * all four sides.							  *
		 ******************************************** */				
		setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), 
				new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, 
				new Color(255, 255, 255), new Color(160, 160, 160)), 
				"Players in Game: ", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(255, 255, 255))));		//combines the two bits of border information
				
		add(scrollPane);	
	}
	
	public GameTable getGameTable() {
		return gameTable;
	}
	
}
