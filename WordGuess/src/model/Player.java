package model;

public class Player {
	
	private String userName;
	private int points;
	private int incorrectGuesses;
	
	public Player(String userName) {
		this.userName = userName;
		this.points = 0;
		this.incorrectGuesses = 0;
	}
	
	public String getName() {
		return userName;
	}
	
	public int getPoints() {
		return points;
	}
	
	public int getIncorrectGuesses() {
		return incorrectGuesses;
	}
	
	public void addPoints(int points) {
		this.points += points;
	}
	
	public void subtractPoints(int points) {
		this.points -= points;
	}
	
	public void incrementIncorrectGuesses() {
		incorrectGuesses += 1;
	}
}
