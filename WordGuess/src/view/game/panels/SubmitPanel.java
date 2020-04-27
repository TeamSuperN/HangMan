package view.game.panels;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import javax.swing.border.BevelBorder;

/*
 * This is where the text input and 
 * button for submittion should go 
 * in the future
 */
@SuppressWarnings("serial")
public class SubmitPanel extends JPanel
{
	
	private JButton submitButton;
	
	
	/*
	 * This Submit panel will appear 
	 * at the bottom of the MainFrame
	 */
	public SubmitPanel()
	{
		setForeground(Color.BLACK);

		int labelLength = 10;
		
		//initialize components
    setBackground(Color.DARK_GRAY);
		
		
		submitButton = new JButton("Guess a word");
		submitButton.setBackground(new Color(128, 128, 128));
		
		/*
		 * This sets the dimension that the MainFrame
		 *  sees the SubmitPanel to look like
		 */
		Dimension dim = getPreferredSize();	
		dim.width = 300; 
		dim.height = 75;
		setPreferredSize(new Dimension(528, 88));
		/////////////////////////
		
//******sets the layout for the panel***************//
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(submitButton);
		
		
		submitButton.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				
				wordQuessedPopup();
			}			
		});
		
//******creates a trim around the bottom panel*********************************//
		setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Submit Panel: ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255))));		//combines the two bits of border information
	}
	
	public static Object wordQuessedPopup()
	{
		String wordGuessed = "";
		wordGuessed = JOptionPane.showInputDialog("Enter The Word You Wish To Guess:  ");
		
		
		if(wordGuessed != null)
		{
			int correctWord = JOptionPane.showConfirmDialog(new JPanel(),
				"Is The Word Spelled Correct?" +
				"\n" + "\"" + wordGuessed +  "\"" + "\n",					// We need to make the username get called here in the blanks
				"Word Guessed",
				JOptionPane.YES_NO_OPTION);
			
			if(correctWord == JOptionPane.YES_OPTION)
			{
				return correctWord;
			}
			else
			{
				return wordQuessedPopup();
			}
			
		}
		else
		{
			return wordQuessedPopup();
		}
	}
	
	public static void correctWordPopup()
	{
		
		
	}
}
