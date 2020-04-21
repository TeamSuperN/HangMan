package view.game.panels;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/*
 * This is where the text input and 
 * button for submittion should go 
 * in the future
 */
@SuppressWarnings("serial")
public class SubmitPanel extends JPanel
{
//**** initializes the components*****//
	private JButton submitButton;
	private JTextField textField;
	
	/*
	 * This Submit panel will appear 
	 * at the bottom of the MainFrame
	 */
	public SubmitPanel()
	{
		textField = new JTextField("Guess a letter or word: ");
		submitButton = new JButton("Submit Answer  ");
		
		
		/*
		 * This sets the dimension that the MainFrame
		 *  sees the SubmitPanel to look like
		 */
		Dimension dim = getPreferredSize();	
		dim.width = 300; 
		dim.height = 75;
		setPreferredSize(dim);
		/////////////////////////
		
//******sets the layout for the panel***************//
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(textField);
		add(submitButton);
		
//******sets the text panel to change from the original text to blank text********//
		textField.addFocusListener(new FocusListener() 
		{
			public void focusLost(FocusEvent e) 
			{
				textField.setText("Guess a letter or word: ");
				
			}

			@Override
			public void focusGained(FocusEvent e) 
			{
				textField.setText(null);			//makes the text go away when clicked
				
			}
		});
		
//******creates a trim around the bottom panel*********************************//
		Border innerBorder = BorderFactory.createTitledBorder("Submit Panel: ");		//creates the title
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);				//creates the exterior dimensions
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));	//combines the two bits of border information
	}
}
