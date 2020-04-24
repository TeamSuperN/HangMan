package model;

public enum GuessResult {
	
	CORRECT_LETTER(10), INCORRECT_LETTER(-5), CORRECT_WORD(100), INCORRECT_WORD(-100);
	
	private int points;
	
	private GuessResult(final int points) {
		this.points = points;
	}
	
	public int getPoints() {
		return points;
	}
	
}
