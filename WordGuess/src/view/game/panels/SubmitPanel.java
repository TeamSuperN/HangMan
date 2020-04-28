package view.game.panels;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import model.Player;
import tools.UserInteraction;
import view.game.frame.GameFrame;

import java.awt.Color;
import java.awt.Component;

import javax.swing.border.BevelBorder;

/*
 * This is where the text input and 
 * button for submittion should go 
 * in the future
 */
@SuppressWarnings("serial")
public class SubmitPanel extends JPanel
{
	
	private JButton guessWordButton;
	
	
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
		
		
		guessWordButton = new JButton("Guess a word");
		guessWordButton.setBackground(new Color(128, 128, 128));
		
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
		add(guessWordButton);
		
		
		guessWordButton.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				
				String wordGuessed = UserInteraction.queryGuessWord();
				
				//If user uses cancel option or closes the popup window
				if (wordGuessed == null) {
					//Do nothing and go back to game
				}
				else {
					wordGuessed = wordGuessed.toUpperCase();
					JButton btn = (JButton)e.getSource();
					GameFrame gFrame = (GameFrame)btn.getTopLevelAncestor();
					String wordToSolve = gFrame.model.game.curRound.curTurn.wordToSolve;
					Player player = gFrame.model.game.pList.get(0);			//Current player will not always be at index 0. Will need to modify later
					if (wordToSolve.equals(wordGuessed)) {
						player.correctWordGuess();
						gFrame.getGamePanel().clear();
						gFrame.getRightPanel().getWordsGuessedPanel().clear();
					}
					else {
						player.incorrectWordGuess();
						gFrame.getRightPanel().getWordsGuessedPanel().addWord(wordGuessed);
					}
					gFrame.getUserNamePanel().getGameTable().refresh();
				}
			}			
		});
		
//******creates a trim around the bottom panel*********************************//
		setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Submit Panel: ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255))));		//combines the two bits of border information
	}
	
	public static String guessWord()
	{
		String wordGuessed = "";
		
		do {
			wordGuessed = JOptionPane.showInputDialog("Enter The Word You Wish To Guess:  ");
			if (wordGuessed.isEmpty()) {
				int confirm = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to submit a blank word?" + "\n" +
																		"You will lose points for submitting a blank word.");
				if (confirm == JOptionPane.CANCEL_OPTION || confirm == JOptionPane.CLOSED_OPTION) {
					break;
				}
			}
		}
		while (wordGuessed.isEmpty());
		
		return wordGuessed;
	}
}
