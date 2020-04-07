package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * This is where the text input and 
 * button for submittion should go 
 * in the future
 */
public class SubmitPanel extends JPanel
{
	private JButton acceptButton;
	
	public SubmitPanel()
	{
		acceptButton = new JButton("Accept");
		
		Dimension dim = getPreferredSize();	
		dim.width = 300; 
		setPreferredSize(dim);
		
		add(acceptButton, FlowLayout.CENTER);
		
	}

}
