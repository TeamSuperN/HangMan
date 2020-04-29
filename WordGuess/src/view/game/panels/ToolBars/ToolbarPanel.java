package view.game.panels.ToolBars;

import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;

/*
 * 	This i a holder for the tool bar and when the 
 *  time comes this can be the tool bar class that 
 *  will be in the app
 */
@SuppressWarnings("serial")
public class ToolbarPanel extends JPanel
{
	private ToolBar_1 toolBar_1;
	private ToolBar_2 toolBar_2;
	
	public ToolbarPanel()
	{
		setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		toolBar_1 = new ToolBar_1();
		toolBar_2 = new ToolBar_2();
		
		setBackground(Color.DARK_GRAY);
		setForeground(SystemColor.desktop);
		setLayout(new BorderLayout(0, 0));
		
		toolBar_2 = new ToolBar_2();
		add(toolBar_2, BorderLayout.EAST);
		
		toolBar_1 = new ToolBar_1();
		add(toolBar_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		add(panel_2, BorderLayout.CENTER);
		
	
	}
}
