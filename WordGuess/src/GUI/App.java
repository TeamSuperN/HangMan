package GUI;

import javax.swing.*;

/*
 * this make the whole game 
 * run after the 2 popups run
 */
public class App 
{
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
			{
			@Override
			public void run() 
			{				
				new MainFrame();
			}
		});		
	}
}
