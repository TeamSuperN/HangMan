package model;

public class Round {
	
	public Turn curTurn;
	
	public Round() {
	}
	
	public void newTurn(String guessWord) {
		curTurn = new Turn(guessWord);
	}
}
