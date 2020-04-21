package view.game.panels;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class LettersPanel extends JPanel
{
//****initializes the variable in the LettersUsedInGamePanel*****//
	private JTable lettersUsedInGame;
	
	public LettersPanel()
	{
		setLayout( new BorderLayout());
		/*
		 * This sets the dimension that the MainFrame
		 *  sees the LettersUsedInGamePanel to look like
		 */
		Dimension dim = getPreferredSize();	
		dim.width = 500; 
		
		setPreferredSize(dim);
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
		JScrollPane scrollPane = new JScrollPane(lettersUsedInGame);
		
		lettersUsedInGame.setSize(350, 350);
		
		
		/* ********************************************
		 * This area is how to create a custom border *
		 * with labels and make the border uniform on *
		 * all four sides.							  *
		 ******************************************** */
		Border innerBorder = BorderFactory.createTitledBorder("Letters Used This Game: ");		//creates the title
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);				//creates the exterior dimensions
		
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));	//combines the two bits of border information
		
		add(scrollPane);	//need scroll pane to have title on table
	}
}

