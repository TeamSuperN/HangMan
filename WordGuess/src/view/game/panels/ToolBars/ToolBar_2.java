package view.game.panels.ToolBars;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import tools.UserInteraction;
import javax.swing.SwingConstants;

public class ToolBar_2 extends JToolBar
{
	private JButton voteToStartGame;
	
	public ToolBar_2()
	{
		setBackground(Color.DARK_GRAY);
		
		voteToStartGame = new JButton("Vote To Start Game");
		voteToStartGame.setForeground(new Color(0, 191, 255));
		voteToStartGame.setHorizontalAlignment(SwingConstants.LEFT);
		
		voteToStartGame.setBackground(new Color(128, 128, 128));
		
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
}
