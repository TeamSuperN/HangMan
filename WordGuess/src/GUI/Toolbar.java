package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * 	This i a holder for the tool bar and when the 
 *  time comes this can be the tool bar class that 
 *  will be in the app
 */
@SuppressWarnings("serial")
public class Toolbar extends JPanel implements ActionListener
{
	private JButton toBeDetermined;
	
	
	
	public Toolbar()
	{
		toBeDetermined = new JButton("To Be Determined!");
		setLayout(new FlowLayout(FlowLayout.LEFT));	//makes a new flowlayout
		
		
		setBorder(BorderFactory.createRaisedBevelBorder());
		add(toBeDetermined);							//adds hellobutton to toolbar
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}
	
	
}
