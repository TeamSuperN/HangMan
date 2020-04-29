package view.lobby.panels;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Actions;
import tools.GameIDGenerator;
import tools.UserInteraction;
import view.lobby.frame.LobbyFrame;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;




public class LobbyPanel extends JPanel
{
	private JButton newGame;
	private JButton joinGame;
	private JButton exitGame;
	private boolean newGameChosen = false;
	private boolean joinGameChosen = false;
  private JLabel lblNewLabel;
	
	//https://image.shutterstock.com/image-vector/hangman-game-600w-623194223.jpg
	public LobbyPanel()
	{
		setBackground(Color.DARK_GRAY);
		/*
		 * This sets the dimension that the MainFrame
		 *  sees the UserNamePanel to look like
		 */
		Dimension dim = getPreferredSize();	
		dim.width = 150; 
		
		
		setPreferredSize(new Dimension(120, 348));
		//////////////////////////
		
		String imageExitButton = "cancelButtonImage.jpg";
		
		// this uses the local path in the repo for the picture  //
		Path relativeCurrentPath = Paths.get("");
		String absoluteCurrentPath = relativeCurrentPath.toAbsolutePath().toString();
		String imageExitIconPath = absoluteCurrentPath + "/images/" + imageExitButton;
		
		Icon exitIcon = new ImageIcon(imageExitIconPath);
				newGame = new JButton("New Game");
				newGame.setForeground(SystemColor.desktop);
				newGame.setBackground(new Color(128, 128, 128));
				joinGame = new JButton("Join Game");
				joinGame.setForeground(SystemColor.desktop);
				joinGame.setBackground(new Color(128, 128, 128));
				exitGame = new JButton("Exit Game");
				exitGame.setBackground(new Color(128, 128, 128));
				exitGame.setForeground(SystemColor.desktop);
				exitGame.setText("Exit Game");
				setLayout(new GridLayout(5,1, 15, 15));	//makes a new flowlayout
				
				//******sets a popout trim for the tool bar ***************//
				setBorder(BorderFactory.createRaisedBevelBorder());
				
				lblNewLabel = new JLabel("User Name");
				lblNewLabel.setForeground(SystemColor.window);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				add(lblNewLabel);
				add(newGame);							//adds hellobutton to toolbar
				add(joinGame);
				add(exitGame);

				/*
				 * will generate a new game 
				 * Id that the user will 
				 * send to users to join
				 * game
				 */
				newGame.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) 
					{
						GameIDGenerator.displayGameID(GameIDGenerator.generateGameID());
						newGameChosen = true;
						closeFrame(e);
					}
				});
				
				/*
				 * 	will display a popup that 
				 * 	displays the Join game Id
				 *  Inputer
				 */
				joinGame.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) 
					{
						if (Actions.joinGame() != null) 
						{
							joinGameChosen = true;
							closeFrame(e);	
						}
					}					
				});
				
				
				
				/*
				 * 	Will display a popup for 
				 * 	Exiting the entire game
				 */
				exitGame.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) 
					{
						UserInteraction.confirmExitGame();		
					}					
				});
		}
	
	public boolean newGameChosen() 
	{
		return newGameChosen;
	}
	
	public boolean joinGameChosen() 
	{
		return joinGameChosen;
	}
	
	private void closeFrame(ActionEvent e) 
	{
		JButton thisBTN = (JButton)e.getSource();
		LobbyFrame thisFrame = (LobbyFrame)thisBTN.getTopLevelAncestor();
		thisFrame.dispatchEvent(new WindowEvent(thisFrame, WindowEvent.WINDOW_CLOSING));
	}
	
	private class NewGameEvent extends WindowEvent
	{
		public NewGameEvent(Window source, int id) 
		{
			super(source, id);
		}		
	}
}

	

