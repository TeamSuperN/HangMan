package GUI.MainMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import GUI.MainFrame;
import GUI.InterfacePanels.UserNamePanel;
import GUI.MainMenuBar.GameMenu;

public class MainMenuBar extends JMenuBar
{
	private GameMenu gameMenu;
	private WindowMenu windowMenu;
	/*
	 * 	This creates the custom MenuBar 
	 * 	In the Future it would probably 
	 * 	be smart to find a way to 
	 * 	seperate this into its own class
	 */
	public MainMenuBar()														
	{
		//Initialize main menu bar objects
		gameMenu = new GameMenu("Game");
		windowMenu = new WindowMenu("Window");
		
		//******setMnemonicsKeys********//
		gameMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));		//CTRL+G
		windowMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));	//CTRL+W
	
		//Add them to main menu bar
		add(gameMenu);
		add(windowMenu);
	}		
}
