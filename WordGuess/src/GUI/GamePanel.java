package GUI;


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
 *  
 */

public class GamePanel extends JPanel
{
	
	private JTextArea textArea;
	
	
	
		public GamePanel()
		{
			Dimension dim = getPreferredSize();	
			dim.width = 300; 
			setPreferredSize(dim);
			
			textArea = new JTextArea("edit me");
			textArea.setEditable(true);
			
		
			
			
			Border innerBorder = BorderFactory.createTitledBorder("Game Play: ");		//creates the title
			Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
			setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
			
			setMinimumSize(new Dimension(400, 420));
			setMaximumSize(new Dimension(500,920));
			
		}
}