package view.game.panels;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import java.awt.Color;

/*
 * This is where the text input and 
 * button for submittion should go 
 * in the future
 */
@SuppressWarnings("serial")
public class SubmitPanel extends JPanel
{
	private JLabel answerLabel;
	private JButton submitButton;
	private JTextField textField;
	
	/*
	 * This Submit panel will appear 
	 * at the bottom of the MainFrame
	 */
	public SubmitPanel()
	{

		int labelLength = 10;
		
		//initialize components
    setBackground(new Color(112, 128, 144));
		answerLabel = new JLabel("Guess a letter or word:");
		textField = new JTextField(labelLength);
		submitButton = new JButton("Submit Answer");
    submitButton.setBackground(new Color(240, 255, 255));
		
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
		add(answerLabel);
		add(textField);
		add(submitButton);
		

		
//******creates a trim around the bottom panel*********************************//
		Border innerBorder = BorderFactory.createTitledBorder("Submit Panel: ");		//creates the title
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);				//creates the exterior dimensions
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));	//combines the two bits of border information
	}
}
