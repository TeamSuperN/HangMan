package GUI.MainMenuBar;

import java.awt.MenuBar;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GameMenu 
{

	public GameMenu(String string)
	{
		JMenu gameMenu = new JMenu("Game Menu");
		
		JMenuItem newGame = new JMenuItem("New Game");	
		JMenuItem joinGame = new JMenuItem("Join Game");
		JMenuItem quitGame = new JMenuItem("Quit Game");								//
		JMenuItem voteToQuit = new JMenuItem("Vote To Quit...");							//
		JMenuItem exitItem = new JMenuItem("Exit");											//
																							//
		//*******addtoFileMenu*********//													//
		gameMenu.add(newGame);
		gameMenu.add(joinGame);
		gameMenu.addSeparator();
		gameMenu.add(quitGame);															//
		gameMenu.add(voteToQuit);															//
		gameMenu.addSeparator();
		gameMenu.add(exitItem);	
		
			
	}
}
