package view.game.panels.rightpanel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import model.Player;
import model.RemainingLetterList;
import model.Turn;
import view.game.frame.GameFrame;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LettersGuessedPanel extends JPanel implements ActionListener {
	
	//private JPanel lettersPanel;
	private JButton lettersButton;
	private RemainingLetterList remainingLetterList;
	private JLabel letterClickedLabel;
	private JTextArea changeLetterClicked;
	public static String letters;
	
	//private LettersButtonsActionListener lettersButtonsActionListener;
	
	public LettersGuessedPanel()
	{
		//lettersPanel = new JPanel();
		remainingLetterList = new RemainingLetterList();
		
		setBackground(Color.DARK_GRAY);
			/*
			 * This sets the dimension that the MainFrame
			 *  sees the SubmitPanel to look like
			 */
			Dimension dim = getPreferredSize();	
			dim.width = 300; 
			dim.height = 200;
			setPreferredSize(new Dimension(555, 200));
			/////////////////////////
			//////////////////////////
			
			//ArrayList<String> letters = new ArrayList<String>("A", "");
			
			
			/* ********************************************
			 * This area is how to create a custom border *
			 * with labels and make the border uniform on *
			 * all four sides.							  *
			 ******************************************** */
			setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), 
					new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, 
					new Color(255, 255, 255), new Color(160, 160, 160)), 
					"Letters Used This Game: ", TitledBorder.LEFT,
					TitledBorder.TOP, null, new Color(255, 255, 255))));
			
			
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[]{90, 90, 90, 90, 90, 90, 0};
			gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
						
			GridBagConstraints gbc = new GridBagConstraints();
			
			
	//*************Sets Button preferred Size**********************//
	//*************Creation Of The Letters Buttons*****************//
			for (int i = 0; i < remainingLetterList.size(); i ++)
			{
				lettersButton = new JButton(remainingLetterList.get(i));
				String letters = remainingLetterList.get(i);
				lettersButton.addActionListener(this);
				
	//**************Disabling Button at the beginning***************//
				lettersButton.setEnabled(false);
				
				this.lettersButton.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						changeLetterClicked.setText(letters);
						
					}
				});
				
				for (int j = 0; j < 5; j++)
				{
					for(int k = 0; k < 4; k ++)
					{				
						lettersButton.setBackground(new Color(128, 128, 128));	
						lettersButton.setPreferredSize(new Dimension(65, 28));
						gbc.insets = new Insets(0, 0, 5, 5);
						gbc.gridx = j;
						gbc.gridy = k;
						add(lettersButton, gbc);
						}
				}
			}
			
			String changeLetter = "      ";
			changeLetterClicked = new JTextArea(changeLetter, 1, 1);
			
	
	//*************Formats the letters Labels**********************//		
			JLabel blankLabel = new JLabel("       ");
			blankLabel.setForeground(new Color(255, 0, 0));
			blankLabel.setBackground(new Color(128, 128, 128));
			blankLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			
			letterClickedLabel = new JLabel("Letter Used:");
			letterClickedLabel.setForeground(new Color(255, 0, 0));
			letterClickedLabel.setBackground(new Color(128, 128, 128));
			letterClickedLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			
			changeLetterClicked = new JTextArea("   ");
			changeLetterClicked.setForeground(new Color(255, 0, 0));
			changeLetterClicked.setBackground(new Color(128, 128, 128));
			changeLetterClicked.setFont(new Font("Tahoma", Font.PLAIN, 13));
			
			
	//**************This Creates a display for the letters Used**********//
			blankLabel.setBackground(new Color(128, 128, 128));
			gbc.insets = new Insets(0, 0, 0, 5);
			gbc.gridx = 3;
			gbc.gridy = 4;
			add(blankLabel, gbc);
			
			letterClickedLabel.setBackground(new Color(128, 128, 128));
			gbc.insets = new Insets(0, 0, 0, 5);
			gbc.gridx = 4;
			gbc.gridy = 4;
			add(letterClickedLabel, gbc);
			
			
			changeLetterClicked.setBackground(new Color(128, 128, 128));
			changeLetterClicked.setPreferredSize(new Dimension(25, 30));
			gbc.insets = new Insets(0, 0, 0, 5);
			gbc.gridx = 5;
			gbc.gridy = 4;
			add(changeLetterClicked, gbc);
			//System.out.println(changeLetterClicked.getPreferredSize());
			
	
	}
	
	public void disableButtons() {
		for (int i = 0; i < this.getComponentCount(); i++) {
			this.getComponent(i).setEnabled(false);
		}
	}
	
	public void enableButtons() {
		for (int i = 0; i < this.getComponentCount(); i++) {
			this.getComponent(i).setEnabled(true);
		}
	}
	
	@Override
	/*
	 * This is the action listeners for the buttons
	 */
	public void actionPerformed(ActionEvent e) 
	{
		JButton button = (JButton) e.getSource();
		String buttonChar = button.getText();
		button.setEnabled(false);
		
		GameFrame gFrame = (GameFrame)button.getTopLevelAncestor();
		RemainingLetterList rll = gFrame.model.game.curRound.curTurn.rll;
		
		if (rll.contains(buttonChar)) {
			rll.remove(buttonChar);
			
			Player player = gFrame.model.game.pList.get(0);
			String wordToSolve = gFrame.model.game.curRound.curTurn.wordToSolve;
			
			if (wordToSolve.contains(buttonChar)) {
				Turn turn = gFrame.model.game.curRound.curTurn;
				for (int i = 0; i < wordToSolve.length(); i++) {
					if (wordToSolve.substring(i, i+1).equals(buttonChar)) {
						gFrame.getGamePanel().populateLetter(buttonChar, i);
						turn.incrementCorrectLetterCount();
						player.correctLetterGuess();
					}
				}
				
				if (turn.correctLetterCount == wordToSolve.length()) {
					JOptionPane.showMessageDialog(new JFrame(), "You solved the word with a letter guess! \n" + 
																"Points for the correct letter guess were awarded, \n" +
																"however, no bonus points for solving the word were awarded. \n" +
																"Use the guess word button to receive extra bonus points in the future.");
					gFrame.getGamePanel().clear();
					gFrame.getRightPanel().getWordsGuessedPanel().clear();
					gFrame.getRightPanel().getLettersGuessedPanel().disableButtons();
				}
				
			}
			else {
				player.incorrectLetterGuess();
			}
			
			gFrame.getUserNamePanel().getGameTable().refresh();
		}
	}
}
