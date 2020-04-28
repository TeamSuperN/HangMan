package view.game.panels;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


/*
 * 	This will be Were the 
 * 	main game display will
 *  sit right now this stuff 
 *  is here to show that it works
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel
{	
//****initializes the variable in the GamePanel*****//
	private JTextArea textArea;
	private static final int SIZE_X = 515;
	private int SIZE_Y = 381;
	
		public GamePanel()
		{
			//setForeground(new Color(255, 255, 255));
			//setBackground(Color.GRAY);
			
			//setForeground(Color.WHITE);
			//setBackground(new Color(255, 255, 255));
			/*
			 * This sets the dimension that the MainFrame
			 *  sees the GamePanel to look like
			 */
			Dimension dim = getPreferredSize();	
			dim.width = 300; 
			setPreferredSize(new Dimension(SIZE_X, SIZE_Y));
			
	//*****	Initializes the variables in the game area******//
			textArea = new JTextArea("edit me");
			textArea.setEditable(true);
			
	//*****Creates the Border layout around the GamePanel Components*************//
			setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5),
					new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, 
					new Color(255, 255, 255), new Color(160, 160, 160)), "Game Play: ",
					TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));		//combines the two bits of border information
			setBackground(new Color(128, 128, 128));
			setLayout(null);
		}
		
		public void populateWordToSolve(String wordToSolve) {
			int wordPanelHGap = 200;
			int wordPanelWidth = this.getWidth()-wordPanelHGap;
			int wordPanelHeight = 100;
			
			this.removeAll();
			this.repaint();
			JPanel wordPanel = new JPanel();
			wordPanel.setBounds(wordPanelHGap/2, (this.getHeight()/2)-(wordPanelHeight/2), wordPanelWidth, wordPanelHeight);
			wordPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			wordPanel.setBackground(new Color(128, 128, 128));
			
			
			this.add(wordPanel);
			
			for (int i = 0; i < wordToSolve.length(); i++) {
				int letterPadding = 8;
				//Character letter = guessWord.charAt(i);
				JLabel jLetter = new JLabel("_");
				jLetter.setFont(new Font("Letter", Font.BOLD, 48));
				jLetter.setBorder(new EmptyBorder(0,letterPadding,0,letterPadding));	//top, left, bottom, right
				jLetter.setForeground(Color.BLACK);
				wordPanel.add(jLetter);
			}
			this.revalidate();
		}
		
		public void populateLetter(String letter, int letterLocation) {
			JPanel wordPanel = (JPanel)this.getComponent(0);
			JLabel letterLabel = (JLabel)wordPanel.getComponent(letterLocation);
			wordPanel.setBackground(new Color(128, 128, 128));
			letterLabel.setText(letter);
			this.repaint();
		}
		
		public void clear() {
			this.removeAll();
			this.repaint();
		}
}