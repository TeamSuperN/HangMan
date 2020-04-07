package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/*
 * 	This will be Were the 
 * 	main game display will
 *  sit right now this stuff 
 *  is here to show that it works
 *  
 */
public class GamePanel extends JPanel implements ActionListener
{
	private JButton btn;
	private JTextArea textArea;
	
	
	
		public GamePanel()
		{
			Dimension dim = getPreferredSize();	
			dim.width = 300; 
			setPreferredSize(dim);
			
			btn = new JButton("hello");
			textArea = new JTextArea("edit me");
			textArea.setEditable(true);
			
			add(btn, BorderLayout.SOUTH);
			add(textArea, BorderLayout.SOUTH);
			
			
			
			
			
			
			
			Border innerBorder = BorderFactory.createTitledBorder("Game Play: ");		//creates the title
			Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
			setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
			
			setMinimumSize(new Dimension(400, 420));
			setMaximumSize(new Dimension(500,920));
			
		}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}