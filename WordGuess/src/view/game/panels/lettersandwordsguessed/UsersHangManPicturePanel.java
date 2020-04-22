package view.game.panels.lettersandwordsguessed;

import java.awt.Image;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.Color;

public class UsersHangManPicturePanel extends JPanel
{
	JLabel usersHangManLabel;
	
	public UsersHangManPicturePanel() throws IOException
	{
		setBackground(new Color(112, 128, 144));
		String imageFileName = "HangManPicture.jpg";
		
		// this uses the local path in the repo for the picture  //
		Path relativeCurrentPath = Paths.get("");
		String absoluteCurrentPath = relativeCurrentPath.toAbsolutePath().toString();
		String imagePath = absoluteCurrentPath + "/images/" + imageFileName;
		
		
		JLabel usersHangManLabel = new JLabel();
		
		ImageIcon imageIcon = new ImageIcon(imagePath);
		usersHangManLabel.setIcon(new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(515, 395, Image.SCALE_SMOOTH)));
		
		Border innerBorder = BorderFactory.createTitledBorder("Progression Of Users Hangman: ");		//creates the title
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);				//creates the exterior dimensions
		
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));	//combines the two bits of border information
		
        add(usersHangManLabel);
	}
        
	
}
