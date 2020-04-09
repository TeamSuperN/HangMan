package GUI;

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
	private JButton submitButton;
	private JTextField textField;
	
	public SubmitPanel()
	{
		submitButton = new JButton("Submit Answer");
		textField = new JTextField("Input Answer");
		
		/*
		 * This sets the dimension that the MainFrame
		 *  sees the SubmitPanel to look like
		 */
		Dimension dim = getPreferredSize();	
		dim.width = 300; 
		dim.height = 75;
		setPreferredSize(dim);
		/////////////////////////
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(submitButton);
		add(textField);
		
		textField.addFocusListener(new FocusListener() 
		{
			public void focusLost(FocusEvent e) 
			{
				
			}

			@Override
			public void focusGained(FocusEvent e) 
			{
				textField.setText(null);			//makes the text go away when clicked
				textField.setOpaque(true);
			}
		});
		Border innerBorder = BorderFactory.createTitledBorder("Submit Panel: ");		//creates the title
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);				//creates the exterior dimensions
		
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));	//combines the two bits of border information
		
		
		setSize(90,900);
		
	}

}
