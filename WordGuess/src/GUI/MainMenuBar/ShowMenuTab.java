package GUI.MainMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;

import GUI.InterfacePanels.UserNamePanel;

public class ShowMenuTab extends JMenu{
	
	private JCheckBoxMenuItem usersLoggedInPanel;
	
	public ShowMenuTab(String title) {
		
		//initialize show menu tab with title
		super(title);
		
		//initialize show menu objects
		usersLoggedInPanel = new JCheckBoxMenuItem("Users In Game");
		
		//TODO: Implement action taken
		//******this shows and unshows the panel****************************// 
		//******that holds the users logged on*****************************// 
		usersLoggedInPanel.addActionListener(new ActionListener()								//
				{																				//
					public void actionPerformed(ActionEvent ev)									//
					{																			//
						JCheckBoxMenuItem menuItem = (JCheckBoxMenuItem)ev.getSource();			//
						//TODO: Fix this														//
						//UserNamePanel.setVisible(menuItem.isSelected());						//
					}																			//
				});	
		
		//set to true
		usersLoggedInPanel.setSelected(true);
		
		//add show menu objects to show menu
		add(usersLoggedInPanel);
	}
}
