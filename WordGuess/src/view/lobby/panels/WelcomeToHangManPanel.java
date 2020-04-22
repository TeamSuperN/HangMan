package view.lobby.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeToHangManPanel extends JPanel
{
	public JLabel welcomeToHangMan;
	
	public WelcomeToHangManPanel()
	{
		
		Dimension dim = getPreferredSize();	
		dim.height = 50;
		setBackground(new Color(112, 128, 144));
		setPreferredSize(dim);
		
		welcomeToHangMan = new JLabel("WELCOME TO THE NEW AND IMPROVED HANGMAN!!!!");
		
		add(welcomeToHangMan, BorderLayout.CENTER);
		
	}
}
