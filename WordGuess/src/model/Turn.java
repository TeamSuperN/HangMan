package model;

import java.util.ArrayList;

public class Turn {
	
	public String wordToSolve;
	public RemainingLetterList rll;
	public ArrayList<String> incorrectWordGuesses;
	
	public Turn(String wordToSolve) {
		this.wordToSolve = wordToSolve;
		rll = new RemainingLetterList();
		incorrectWordGuesses = new ArrayList<String>();
	}
	
	public void addIncorrectWordGuess(String incorrectGuess) {
		incorrectWordGuesses.add(incorrectGuess);
	}
	
	public boolean containsLetter(String letter) {
		return wordToSolve.contains(letter);
	}
	
	public boolean matchesGuess(String attemptedWordGuess) {
		return wordToSolve.equals(attemptedWordGuess);
	}
}
