package view.game.panels.usernamepanel;

import java.awt.Color;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import model.Player;
import model.PlayerList;
import view.game.frame.GameFrame;

public class GameTable extends JTable{

	private final static String[] TABLE_HEADER = {"User Name", "Points"};
	private DefaultTableModel dtm;
	
	public GameTable() {
		super();
		dtm = new DefaultTableModel(0,0);
		dtm.setColumnIdentifiers(TABLE_HEADER);
		this.setModel(dtm);
	}
	
	public GameTable(String[][] gameData) {
		super(gameData, TABLE_HEADER);
	}
	
	public void refresh() {
		GameFrame gFrame = (GameFrame)this.getTopLevelAncestor();
		PlayerList pList = gFrame.model.game.pList;
		for (int i = 0; i < dtm.getRowCount(); i++) {
			dtm.removeRow(i);
		}
		for (int i = 0; i < pList.size(); i++) {
			dtm.addRow(new Object[] {pList.get(i).getName(), pList.get(i).getPoints()});
		}
	}
}
