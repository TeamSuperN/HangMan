package view.lobby.panels;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangManPicturePanel extends JPanel
{
	public HangManPicturePanel() throws IOException
	{
		String hangManImagePath = "C://Users/Public/Documents/HangManPicture.jpg";
		
		JLabel hangManLabel = new JLabel();
		hangManLabel.setIcon(new ImageIcon(hangManImagePath));// your image here
	
		
        add(hangManLabel);
		
	}
}
