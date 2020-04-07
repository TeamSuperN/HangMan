package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/*
 * 	This i a holder for the tool bar and when the 
 *  time comes this can be the tool bar class that 
 *  will be in the app
 */
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
