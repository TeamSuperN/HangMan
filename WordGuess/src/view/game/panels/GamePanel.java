package view.game.panels;


import java.awt.Dimension;


import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

/*
 * 	This will be Were the 
 * 	main game display will
 *  sit right now this stuff 
 *  is here to show that it works
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel
{	
//****initializes the variable in the GamePanel*****//
	private JTextArea textArea;
	
		public GamePanel()
		{
			setForeground(new Color(255, 255, 255));
			setBackground(Color.GRAY);
			/*
			 * This sets the dimension that the MainFrame
			 *  sees the GamePanel to look like
			 */
			Dimension dim = getPreferredSize();	
			dim.width = 300; 
			setPreferredSize(new Dimension(515, 381));
			
	//*****	Initializes the variables in the game area******//
			textArea = new JTextArea("edit me");
			textArea.setEditable(true);
			
	//*****Creates the Border layout around the GamePanel Components*************//
			setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), 
					new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, 
					new Color(255, 255, 255), new Color(160, 160, 160)), 
					"Game Play: ", TitledBorder.LEADING,
					TitledBorder.TOP, null, new Color(255, 255, 255))));		//combines the two bits of border information
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setForeground(new Color(255, 0, 0));
			add(lblNewLabel);

		}
}