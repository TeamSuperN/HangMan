package view.lobby.panels;

import java.awt.Image;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;

public class HangManPicturePanel extends JPanel
{
	JLabel hangManLabel;
	
	public HangManPicturePanel() throws IOException
	{
		setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.controlDkShadow, null, null, null));
		
		setBackground(Color.DARK_GRAY);
		String imageFileName = "HangManPictureDark.jpg";
		
		// this uses the local path in the repo for the picture  //
		Path relativeCurrentPath = Paths.get("");
		String absoluteCurrentPath = relativeCurrentPath.toAbsolutePath().toString();
		String imagePath = absoluteCurrentPath + "/images/" + imageFileName;
		
		System.out.println(imagePath);
		
		
		JLabel hangManLabel = new JLabel();
		
		ImageIcon imageIcon = new ImageIcon(imagePath);
		hangManLabel.setIcon(new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(600, 475, Image.SCALE_SMOOTH)));
		
        add(hangManLabel);
        
        
		/*************this is supposed to be a way to scale the image to fit*************************************************************
		Image hangManImage = imageIcon.getImage();
		Image hangManScale = hangManImage.getScaledInstance(hangManLabel.getWidth(), hangManLabel.getHeight(), hangManImage.SCALE_SMOOTH);
		ImageIcon scaledHangManIcon = new ImageIcon(hangManScale);
		hangManLabel.setIcon(scaledHangManIcon);
		*********************************************************************************************************************************/
	}
}
