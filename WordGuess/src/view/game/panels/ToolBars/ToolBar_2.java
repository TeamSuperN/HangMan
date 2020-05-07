package view.game.panels.ToolBars;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import tools.UserInteraction;
import javax.swing.SwingConstants;

public class ToolBar_2 extends JToolBar
{
	private JButton voteToStartGame;
	
	public ToolBar_2()
	{
		setFloatable(false);
		
		setBackground(Color.DARK_GRAY);
		
		voteToStartGame = new JButton();
		voteToStartGame.setForeground(new Color(0, 191, 255));
		voteToStartGame.setHorizontalAlignment(SwingConstants.LEFT);
		voteToStartGame.setToolTipText("Vote To Start Game");
		voteToStartGame.setBackground(new Color(128, 128, 128));
		String voteImage = "/images/HangManPictureLight.jpg";
		voteToStartGame.setIcon(createIcon(voteImage));
		
		add(voteToStartGame);
		
		/*
		 * Vote to start game button
		 */
		voteToStartGame.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				UserInteraction.voteToStartGame();		
			}			
		});
	}
	
	private ImageIcon createIcon(String path)
	{
		
		URL url = getClass().getResource(path);
	
		if (url == null)
		{
			System.out.println("Image not able to load: " + path);
		}
		ImageIcon icon = new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT));
		
		return icon;
	}
}
