package gui.panels.menubar;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class WindowMenu extends JMenu
{
	private JMenuItem newWindow;
	private ShowMenuTab showMenu;
	private JMenuItem preferrencesItem;
	
	public WindowMenu(String title) {
		
		//Initialize window menu with title
		super(title);
		
		//Initialize window menu objects
		newWindow = new JMenuItem("New Window");
		showMenu = new ShowMenuTab("Show");
		preferrencesItem = new JMenuItem("Preferrences");	
		
		//Add them to window menu
		add(newWindow);
		add(showMenu);
		add(preferrencesItem);
	}
	
}
