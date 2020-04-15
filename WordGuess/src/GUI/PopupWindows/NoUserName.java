package GUI.PopupWindows;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import GUI.MainFrame;

public class NoUserName 
{
	static JFrame noUserNamePopup = new JFrame();
	
	public NoUserName()
	{
		int noUserName = JOptionPane.showConfirmDialog(
				noUserNamePopup,
				"There Is No User Name." + "\n"  +
				"Do You Wish To Input A User Name?",
				"User Name",
			    JOptionPane.YES_NO_OPTION);
		

		
				if (noUserName == JOptionPane.YES_OPTION)
				{
					if (noUserNamePopup == null)
					{
						new MainFrame();
					}
					else
					{
						new UserNamePopup();
					}
				}
	}
}
