package view.game.panels;


import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;

import view.game.panels.lettersandwordsguessedPanel.LettersGuessedPanel;
import view.game.panels.lettersandwordsguessedPanel.UsersHangManPicturePanel;
import view.game.panels.lettersandwordsguessedPanel.WordsGuessedPanel;
import view.lobby.panels.HangManPicturePanel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;

@SuppressWarnings("serial")
public class LettersAndWordsUsedInGame extends JPanel
{
//****initializes the variable in the LettersUsedInGamePanel*****//
	private LettersGuessedPanel lettersGuessedPanel;
	private UsersHangManPicturePanel usersHangManPicturePanel;
	private WordsGuessedPanel wordsGuessedPanel;
	
	public LettersAndWordsUsedInGame()
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
		
		setPreferredSize(new Dimension(555, 800));
		
		setBorder(BorderFactory.createBevelBorder(5));
		
		add(lettersGuessedPanel, BorderLayout.NORTH);
		add(usersHangManPicturePanel, BorderLayout.CENTER);
		add(wordsGuessedPanel, BorderLayout.SOUTH);
		wordsGuessedPanel.setLayout(new GridLayout(1, 0, 0, 0));
	}
}




