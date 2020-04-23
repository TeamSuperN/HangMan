package view.game.panels.lettersandwordsguessed;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class LettersGuessedPanel extends JPanel {
	
	private JTable lettersUsedInGame;
	
	public LettersGuessedPanel()
	{
		setBackground(Color.DARK_GRAY);	
			setLayout(new BorderLayout());
			/*
			 * This sets the dimension that the MainFrame
			 *  sees the SubmitPanel to look like
			 */
			Dimension dim = getPreferredSize();	
			dim.width = 300; 
			dim.height = 200;
			setPreferredSize(new Dimension(304, 164));
			/////////////////////////
			//////////////////////////
			
			//******Initializes the table data**************************//
			String[] columnNames = {"Letter", "Letter", "Letter",
					"Letter", "Letter", "Letter"};
			Object[][] lettersStored = {
				{"A", "B", "C", "D", "E", "F"},
				{"G", "H", "I", "J", "K", "L"},
				{"M", "N", "O", "P", "Q", "R"},
				{"S", "T", "U", "V", "W", "X"},
				{"Y", "Z", " ", " ", " ", " ",}
			};
			//******Creates the table with both the data and title of the columns***********//
			lettersUsedInGame = new JTable(lettersStored, columnNames);
			lettersUsedInGame.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lettersUsedInGame.setBackground(new Color(128, 128, 128));
			JScrollPane scrollPane = new JScrollPane(lettersUsedInGame);
			scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(240, 255, 255), new Color(240, 255, 255)));
			
			//lettersUsedInGame.setSize(350, 350);
			
			
			/* ********************************************
			 * This area is how to create a custom border *
			 * with labels and make the border uniform on *
			 * all four sides.							  *
			 ******************************************** */
			setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), 
					new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, 
					new Color(255, 255, 255), new Color(160, 160, 160)), 
					"Letters Used This Game: ", TitledBorder.LEADING,
					TitledBorder.TOP, null, new Color(255, 255, 255))));		//combines the two bits of border information
			
			add(scrollPane);	//need scroll pane to have title on table
	}
}
