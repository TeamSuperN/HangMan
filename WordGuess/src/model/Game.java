package model;

public class Game {

	public PlayerList pList;
	public Round curRound;
	
	int totalRounds = 4;
	
	public Game() {
		pList = new PlayerList();
		curRound = new Round();
	}
	
	public void nextRound() {
		curRound = new Round();
	}
	
}
