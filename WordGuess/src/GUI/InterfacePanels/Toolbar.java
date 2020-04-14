package GUI.InterfacePanels;

import java.awt.FlowLayout;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * 	This i a holder for the tool bar and when the 
 *  time comes this can be the tool bar class that 
 *  will be in the app
 */
@SuppressWarnings("serial")
public class Toolbar extends JPanel
{
//**** initializes the components*****//
	private JButton toBeDetermined;
	
	/*
	 * Creates a tool Bar on 
	 * the Main Frame Class
	 */
	public Toolbar()
	{
//******creates a random buttom add a holding space here********//
		toBeDetermined = new JButton("To Be Determined!");
		setLayout(new FlowLayout(FlowLayout.LEFT));	//makes a new flowlayout

//******sets a popout trim for the tool bar ***************//
		setBorder(BorderFactory.createRaisedBevelBorder());
		add(toBeDetermined);							//adds hellobutton to toolbar
	}
}
