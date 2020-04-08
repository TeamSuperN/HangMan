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

	/*
		Object result = JOptionPane.showInputDialog(frame, "Enter printer name:");
		
		int i = JOptionPane.OK_CANCEL_OPTION;
		
		if(i == JOptionPane.OK_OPTION)
		{
			new MainFrame();
		}
		else
			System.exit(0);
	*/