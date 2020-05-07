package view;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class CreateIcon 
{
	public ImageIcon CreateIcon(String path)
	{
		
		URL url = getClass().getResource(path);
	
		if (url == null)
		{
			System.out.println("Image not able to load: " + path);
		}
		ImageIcon icon = new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(15,15, Image.SCALE_DEFAULT));
		
		return icon;
	}

}
