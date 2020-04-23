package view.game.panels.usernamepanel;

import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import model.Player;

public class GameTable extends JTable{

	private final static String[] TABLE_HEADER = {"User Name", "Points"};
	
	public GameTable(Player player) {
		super();
		DefaultTableModel dtm = new DefaultTableModel(0,0);
		dtm.setColumnIdentifiers(TABLE_HEADER);
		this.setModel(dtm);
		if (player != null) {
			dtm.addRow(new Object[] {player.getName(), player.getPoints()});
		}
	}
	
	public GameTable(String[][] gameData) {
		super(gameData, TABLE_HEADER);
	}
	
}
