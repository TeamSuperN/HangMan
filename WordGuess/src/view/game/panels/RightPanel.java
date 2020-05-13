package view.game.panels;


import javax.swing.BorderFactory;
import javax.swing.JPanel;

import view.game.panels.rightpanel.LettersGuessedPanel;
import view.game.panels.rightpanel.UsersHangManPicturePanel;
import view.game.panels.rightpanel.WordsGuessedPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class RightPanel extends JPanel
{
//****initializes the variable in the LettersUsedInGamePanel*****//
	private LettersGuessedPanel lettersGuessedPanel;
	private UsersHangManPicturePanel usersHangManPicturePanel;
	private WordsGuessedPanel wordsGuessedPanel;
	private static final int SIZE_X = 250;
	private int SIZE_Y = 381;
	
	public RightPanel()
	{
		
		
		setLayout( new BorderLayout());
		
		lettersGuessedPanel = new LettersGuessedPanel();
		try {
			usersHangManPicturePanel = new UsersHangManPicturePanel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wordsGuessedPanel = new WordsGuessedPanel();
		
		
		
		/*
		 * This sets the dimension that the MainFrame
		 *  sees the LettersUsedInGamePanel to look like
		 */
		Dimension dim = getPreferredSize();	
		dim.width = 400; 
		
		setPreferredSize(new Dimension(SIZE_X, SIZE_Y));
		
		setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		add(lettersGuessedPanel, BorderLayout.SOUTH);
		add(usersHangManPicturePanel, BorderLayout.CENTER);
		add(wordsGuessedPanel, BorderLayout.NORTH);
		wordsGuessedPanel.setLayout(new GridLayout(1, 0, 0, 0));
	}
	
	public WordsGuessedPanel getWordsGuessedPanel() {
		return wordsGuessedPanel;
	}
	
	public LettersGuessedPanel getLettersGuessedPanel() {
		return lettersGuessedPanel;
	}
}




