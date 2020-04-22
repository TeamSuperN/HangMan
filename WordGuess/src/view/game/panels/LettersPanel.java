package view.game.panels;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import view.game.panels.lettersandwordsguessed.LettersGuessedPanel;
import view.game.panels.lettersandwordsguessed.WordsGuessedPanel;
import java.awt.GridLayout;

import model.RemainingLetterList;

@SuppressWarnings("serial")
public class LettersPanel extends JPanel
{
//****initializes the variable in the LettersUsedInGamePanel*****//
	private LettersGuessedPanel lettersGuessedPanel;
	private WordsGuessedPanel wordsGuessedPanel;
	
	//TODO: Implement these variables
	private RemainingLetterList rll;
	private ArrayList<String> incorrectWordList;
	
	public LettersPanel()
	{
		
		
		setLayout( new BorderLayout());
		
		lettersGuessedPanel = new LettersGuessedPanel();
		wordsGuessedPanel = new WordsGuessedPanel();
		
		
		
		/*
		 * This sets the dimension that the MainFrame
		 *  sees the LettersUsedInGamePanel to look like
		 */
		Dimension dim = getPreferredSize();	
		dim.width = 400; 
		
		setPreferredSize(new Dimension(555, 379));
		
		setBorder(BorderFactory.createBevelBorder(5));
		
		add(lettersGuessedPanel, BorderLayout.NORTH);
		add(wordsGuessedPanel, BorderLayout.SOUTH);
		wordsGuessedPanel.setLayout(new GridLayout(1, 0, 0, 0));
	}
}

