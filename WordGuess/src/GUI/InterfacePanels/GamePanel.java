package GUI.InterfacePanels;


import java.awt.Dimension;


import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

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
			/*
			 * This sets the dimension that the MainFrame
			 *  sees the GamePanel to look like
			 */
			Dimension dim = getPreferredSize();	
			dim.width = 300; 
			setPreferredSize(dim);
			
	//*****	Initializes the variables in the game area******//
			textArea = new JTextArea("edit me");
			textArea.setEditable(true);
			
	//*****Creates the Border layout around the GamePanel Components*************//
			Border innerBorder = BorderFactory.createTitledBorder("Game Play: ");		//creates the title
			Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
			setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		}
}