package view.lobby.panels;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangManPicturePanel extends JPanel
{
	JLabel hangManLabel;
	
	public HangManPicturePanel() throws IOException
	{
		String imageFileName = "HangManPicture.jpg";
		
		Path relativeCurrentPath = Paths.get("");
		String absoluteCurrentPath = relativeCurrentPath.toAbsolutePath().toString();
		String imagePath = absoluteCurrentPath + "/images/" + imageFileName;
		//System.out.println(absolutePath);
		
		//String hangManImagePath = "C://Users/Public/Documents/HangManPicture.jpg";
		
		JLabel hangManLabel = new JLabel();
		hangManLabel.setIcon(new ImageIcon(imagePath));// your image here
	
		
        add(hangManLabel);
		
	}
}
