package GUI;

import javax.swing.*;

/*
 * In the future we could make this the 
 * app that runs the game or something
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
