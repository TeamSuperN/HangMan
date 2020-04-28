package view.game.panels.rightpanel;

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
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class UsersHangManPicturePanel extends JPanel
{
	JLabel usersHangManLabel;
	
	public UsersHangManPicturePanel() throws IOException
	{
		setBackground(Color.DARK_GRAY);
		String imageFileName = "HangManPictureDark.jpg";
		
		// this uses the local path in the repo for the picture  //
		Path relativeCurrentPath = Paths.get("");
		String absoluteCurrentPath = relativeCurrentPath.toAbsolutePath().toString();
		String imagePath = absoluteCurrentPath + "/images/" + imageFileName;
		
		
		JLabel usersHangManLabel = new JLabel();
		
		ImageIcon imageIcon = new ImageIcon(imagePath);
		usersHangManLabel.setIcon(new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(515, 370, Image.SCALE_SMOOTH)));
		
		setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), 
						new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, 
						new Color(255, 255, 255), new Color(160, 160, 160)), 
						"Progression Of Users Hangman: ", TitledBorder.LEADING,
						TitledBorder.TOP, null, new Color(255, 255, 255))));		//combines the two bits of border information
		
        add(usersHangManLabel);
	}
        
	
}
