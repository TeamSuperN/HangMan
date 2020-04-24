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
	
	public void correctLetterGuess() {
		this.points += GuessResult.CORRECT_LETTER.getPoints();
	}
	
	public void correctWordGuess() {
		this.points += GuessResult.CORRECT_WORD.getPoints();
	}
	
	public void incorrectLetterGuess() {
		this.points += GuessResult.INCORRECT_LETTER.getPoints();
		incorrectGuesses += 1;
	}
	
	public void incorrectWordGuess() {
		this.points += GuessResult.INCORRECT_WORD.getPoints();
	}
}
