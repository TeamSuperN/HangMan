package view.game.panels.lettersandwordsguessed;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import java.awt.Color;

public class WordsGuessedPanel extends JPanel 
{
	private JTextArea wordsGuessed;
	
	public WordsGuessedPanel()
	{
		setBackground(new Color(112, 128, 144));
		setLayout(new BorderLayout());
		
		wordsGuessed = new JTextArea("These Words Were Guessed::           " + "\n"
				+ "                                                        " + "\n");
		wordsGuessed.setBackground(new Color(192, 192, 192));
		
		wordsGuessed.setEditable(false);
		
		/*
		 * This sets the dimension that the MainFrame
		 *  sees the SubmitPanel to look like
		 */
		Dimension dim = getPreferredSize();	
		dim.width = 300; 
		dim.height = 300;
		setPreferredSize(new Dimension(304, 243));
		/////////////////////////
		
		/* ********************************************
		 * This area is how to create a custom border *
		 * with labels and make the border uniform on *
		 * all four sides.							  *
		 ******************************************** */
		Border innerBorder = BorderFactory.createTitledBorder("Words Used This Game: ");		//creates the title
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);				//creates the exterior dimensions
		
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));	//combines the two bits of border information
		
		add(wordsGuessed);
	}

}
