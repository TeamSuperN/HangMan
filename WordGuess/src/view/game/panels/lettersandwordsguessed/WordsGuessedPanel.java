package view.game.panels.lettersandwordsguessed;

import java.awt.BorderLayout;
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

public class WordsGuessedPanel extends JPanel 
{
	private JTextArea wordsGuessed;
	
	public WordsGuessedPanel()
	{
		setForeground(new Color(255, 255, 255));
		setBackground(Color.DARK_GRAY);
		setLayout(new BorderLayout());
		
		wordsGuessed = new JTextArea("These Words Were Guessed::           " + "\n"
				+ "                                                        " + "\n");
		wordsGuessed.setBackground(new Color(128, 128, 128));
		
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
		setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), 
				new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, 
				new Color(255, 255, 255), new Color(160, 160, 160)), 
				"Words Used This Game: ", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(255, 255, 255))));		//combines the two bits of border information
		
		add(wordsGuessed);
	}

}
