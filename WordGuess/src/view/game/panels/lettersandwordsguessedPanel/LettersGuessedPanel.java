package view.game.panels.lettersandwordsguessedPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import model.RemainingLetterList;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LettersGuessedPanel extends JPanel {
	
	private JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK,
					btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV,
					btnW, btnX, btnY, btnZ;
	private RemainingLetterList remainingLetterList;
	private JLabel letterClickedLabel;
	private JLabel changeLetterClicked;
	
	//private LettersButtonsActionListener lettersButtonsActionListener;
	
	public LettersGuessedPanel()
	{
		setBackground(Color.DARK_GRAY);
			/*
			 * This sets the dimension that the MainFrame
			 *  sees the SubmitPanel to look like
			 */
			Dimension dim = getPreferredSize();	
			dim.width = 300; 
			dim.height = 200;
			setPreferredSize(new Dimension(555, 200));
			/////////////////////////
			//////////////////////////
			
			
			
			
			/* ********************************************
			 * This area is how to create a custom border *
			 * with labels and make the border uniform on *
			 * all four sides.							  *
			 ******************************************** */
			setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), 
					new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, 
					new Color(255, 255, 255), new Color(160, 160, 160)), 
					"Letters Used This Game: ", TitledBorder.LEFT,
					TitledBorder.TOP, null, new Color(255, 255, 255))));
			
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[]{90, 90, 90, 90, 90, 90, 0};
			gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			
			setLayout(gridBagLayout);
			
	//*************Sets Button preferred Size**********************//
	//*************Creation Of The Letters Buttons*****************//
			btnA = new JButton("     A     ");			
			btnB = new JButton("     B     ");
			btnC = new JButton("     C     ");
			btnD = new JButton("     D     ");
			btnE = new JButton("     E     ");
			btnF = new JButton("     F     ");
			btnG = new JButton("     G     ");
			btnH = new JButton("     H     ");
			btnI = new JButton("      I      ");
			btnJ = new JButton("     J     ");
			btnK = new JButton("     K     ");
			btnL = new JButton("     L     ");
			btnM = new JButton("     M     ");
			btnN = new JButton("     N     ");
			btnO = new JButton("     O     ");
			btnP = new JButton("     P     ");
			btnQ = new JButton("     Q     ");
			btnR = new JButton("     R     ");
			btnS = new JButton("     S     ");
			btnT = new JButton("     T     ");
			btnU = new JButton("     U     ");			
			btnV = new JButton("     V     ");			
			btnW = new JButton("     W     ");			
			btnX = new JButton("     X     ");			
			btnY = new JButton("     Y     ");			
			btnZ = new JButton("     Z     ");
			
			
	//*************Sets Button preferred Size**********************//
			
			/* DIDN'T WORK
			btnA.setPreferredSize(new Dimension(65, 28));
			btnB.setPreferredSize(new Dimension(65, 28));
			btnC.setPreferredSize(new Dimension(65, 28));
			btnD.setPreferredSize(new Dimension(65, 28));
			btnE.setPreferredSize(new Dimension(65, 28));
			btnF.setPreferredSize(new Dimension(65, 28));
			btnG.setPreferredSize(new Dimension(65, 28));
			btnH.setPreferredSize(new Dimension(65, 28));
			btnI.setPreferredSize(new Dimension(65, 28));
			btnJ.setPreferredSize(new Dimension(65, 28));
			btnK.setPreferredSize(new Dimension(65, 28));
			btnL.setPreferredSize(new Dimension(65, 28));
			btnM.setPreferredSize(new Dimension(65, 28));
			btnN.setPreferredSize(new Dimension(65, 28));
			btnO.setPreferredSize(new Dimension(65, 28));
			btnP.setPreferredSize(new Dimension(65, 28));
			btnQ.setPreferredSize(new Dimension(65, 28));
			btnR.setPreferredSize(new Dimension(65, 28));
			btnS.setPreferredSize(new Dimension(65, 28));
			btnT.setPreferredSize(new Dimension(65, 28));
			btnU.setPreferredSize(new Dimension(65, 28));
			btnV.setPreferredSize(new Dimension(65, 28));
			btnW.setPreferredSize(new Dimension(65, 28));
			btnX.setPreferredSize(new Dimension(65, 28));
			btnY.setPreferredSize(new Dimension(65, 28));
			btnZ.setPreferredSize(new Dimension(65, 28));
			*/
			
	//*************Formats the letters Labels**********************//			
			letterClickedLabel = new JLabel("Letter Used:");
			letterClickedLabel.setForeground(new Color(255, 0, 0));
			letterClickedLabel.setBackground(new Color(128, 128, 128));
			letterClickedLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			
			changeLetterClicked = new JLabel("   ");
			changeLetterClicked.setForeground(new Color(255, 0, 0));
			changeLetterClicked.setBackground(new Color(128, 128, 128));
			changeLetterClicked.setFont(new Font("Tahoma", Font.PLAIN, 13));
			
	//*************Calls the Button Layout*************************//
			layoutOfLetterButtons();
			
	//*************Calls the Button Listeners**********************//
			lettersButtonsActionListener();		
	}
	
	
	/*
	 * This is the action listeners for the buttons
	 */
	public void lettersButtonsActionListener()
	{
		
	//*************Creates Action Listeners for Buttons************//
		btnA.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  A  ");
				btnA.setEnabled(false);
				//lettercalled = new String ("A");
				
			}			
		});
		
		btnB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  B  ");
				btnB.setEnabled(false);
			}
		});
		
		btnC.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  C  ");
				btnC.setEnabled(false);
			}
		});
		
		btnD.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  D  ");
				btnD.setEnabled(false);
			}
		});
		btnE.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  E  ");
				btnE.setEnabled(false);
			}
		});
		
		btnF.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  F  ");
				btnF.setEnabled(false);
			}
		});
		
		btnG.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  G  ");
				btnG.setEnabled(false);
			}
		});
		
		btnH.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  H  ");
				btnH.setEnabled(false);
			}
		});
		
		btnI.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  I  ");
				btnI.setEnabled(false);
			}
		});
		
		btnJ.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  J  ");
				btnJ.setEnabled(false);
			}
		});
		
		btnK.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  K  ");
				btnK.setEnabled(false);
			}
		});
		
		btnL.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  L  ");
				btnL.setEnabled(false);
			}
		});
		
		btnM.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  M  ");
				btnM.setEnabled(false);
			}
		});
		
		btnN.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  N  ");
				btnN.setEnabled(false);
			}
		});
		
		btnO.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  O  ");
				btnO.setEnabled(false);
			}
		});
		
		btnP.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  P  ");
				btnP.setEnabled(false);
			}
		});
		
		btnQ.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  Q  ");
				btnQ.setEnabled(false);
			}
		});
		
		btnR.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  R  ");
				btnR.setEnabled(false);
			}
		});
		
		btnS.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  S  ");
				btnS.setEnabled(false);
			}
		});
		
		btnT.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  T  ");
				btnT.setEnabled(false);
			}
		});
		
		btnU.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  U  ");
				btnU.setEnabled(false);
			}
		});
		
		btnV.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  V  ");
				btnV.setEnabled(false);
			}
		});
		
		btnW.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  W  ");
				btnW.setEnabled(false);
			}
		});
		
		btnX.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  X  ");
				btnX.setEnabled(false);
			}
		});
		
		btnY.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  Y  ");
				btnY.setEnabled(false);
			}
		});
		
		btnZ.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				changeLetterClicked.setText("  Z  ");
				btnZ.setEnabled(false);
			}
		});
		
	}
	
	public void layoutOfLetterButtons()
	{
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		btnA.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(btnA, gbc);
		
		btnB.setBackground(new Color(128, 128, 128));			
		gbc.anchor = GridBagConstraints.NORTH;
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(btnB, gbc);
		
		btnC.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 2;
		gbc.gridy = 0;
		add(btnC, gbc);
		
		btnD.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 3;
		gbc.gridy = 0;
		add(btnD, gbc);
		
		btnE.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 4;
		gbc.gridy = 0;
		add(btnE, gbc);
		
		btnF.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridx = 5;
		gbc.gridy = 0;
		add(btnF, gbc);
		
		btnG.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(btnG, gbc);
		
		btnH.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(btnH, gbc);
		
		btnI.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 2;
		gbc.gridy = 1;
		add(btnI, gbc);
		
		btnJ.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 3;
		gbc.gridy = 1;
		add(btnJ, gbc);
		
		btnK.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 4;
		gbc.gridy = 1;
		add(btnK, gbc);
		
		btnL.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridx = 5;
		gbc.gridy = 1;
		add(btnL, gbc);
		
		btnM.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(btnM, gbc);
		
		
		btnN.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 2;
		add(btnN, gbc);
		
		
		btnO.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 2;
		gbc.gridy = 2;
		add(btnO, gbc);
		
		
		btnP.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 3;
		gbc.gridy = 2;
		add(btnP, gbc);
		
		
		btnQ.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 4;
		gbc.gridy = 2;
		add(btnQ, gbc);
		
		
		btnR.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridx = 5;
		gbc.gridy = 2;
		add(btnR, gbc);
		
		
		btnS.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(btnS, gbc);
		
		
		btnT.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(btnT, gbc);
		
		btnU.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 2;
		gbc.gridy = 3;
		add(btnU, gbc);
		
		btnV.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 3;
		gbc.gridy = 3;
		add(btnV, gbc);
		
		btnW.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 4;
		gbc.gridy = 3;
		add(btnW, gbc);
		
		btnX.setBackground(new Color(128, 128, 128));			
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridx = 5;
		gbc.gridy = 3;
		add(btnX, gbc);
		
//*****************Last Row****************************//
		btnY.setBackground(new Color(128, 128, 128));
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(btnY, gbc);
		
		btnZ.setBackground(new Color(128, 128, 128));
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.gridx = 1;
		gbc.gridy = 4;
		add(btnZ, gbc);
		
		
		
		letterClickedLabel.setBackground(new Color(128, 128, 128));
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.gridx = 4;
		gbc.gridy = 4;
		add(letterClickedLabel, gbc);
		
		
		changeLetterClicked.setBackground(new Color(128, 128, 128));
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.gridx = 5;
		gbc.gridy = 4;
		add(changeLetterClicked, gbc);
		System.out.println(btnZ.getPreferredSize());
		
			
	}
}
