package view.lobby.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class WelcomeToHangManPanel extends JPanel
{
	public JLabel welcomeToHangMan;
	
	public WelcomeToHangManPanel()
	{
		setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setForeground(Color.WHITE);
		
		Dimension dim = getPreferredSize();	
		dim.height = 50;
		setBackground(Color.DARK_GRAY);
		setPreferredSize(new Dimension(555, 39));
		
		welcomeToHangMan = new JLabel("WELCOME TO THE NEW AND IMPROVED HANGMAN!!!!");
		
		add(welcomeToHangMan, BorderLayout.CENTER);
		
	}
}
