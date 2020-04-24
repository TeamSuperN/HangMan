package model;

import java.util.ArrayList;

/* 
 * Custom implementation of an ArrayList object containing String objects.
 */
public class RemainingLetterList extends ArrayList<String>{

	//Initialize the list by adding letters of the alphabet to it
	public RemainingLetterList() {
		this.add("A");		//Equivalent to add("A")
		this.add("B");
		this.add("C");
		this.add("D");
		this.add("E");
		this.add("F");
		this.add("G");
		this.add("H");
		this.add("I");
		this.add("J");
		this.add("K");
		this.add("L");
		this.add("M");
		this.add("N");
		this.add("O");
		this.add("P");
		this.add("Q");
		this.add("R");
		this.add("S");
		this.add("T");
		this.add("U");
		this.add("V");
		this.add("W");
		this.add("X");
		this.add("Y");
		this.add("Z");
	}
	
	@Override
	/* Overrides the default remove method provided by Java 
	 * on an ArrayList object in order to implement our own
	 * custom implementation. First converts the letter from object
	 * form to a string, then converts it to upper case format to match
	 * the format of the letters in the list, then iterates through the
	 * list to find a matching remaining letter. If a matching
	 * remaining letter is found, true is returned indicating the letter
	 * was found. If the letter is not found or the parameter is not the
	 * right type, false is returned indicating there wasn't a match
	 * in the list.
	 */
	public boolean remove(Object o) 
	{
		
		//If the object is not a string, return false (notifying of error in removal)
		if (!(o instanceof String)) 
		{
			return false;
		}
		
		//Object must be a string, so convert it to a string
		String letter = (String)o;
		
		//Convert to upper case format
		letter = letter.toUpperCase();
		
		//Loop through every letter left in the list
		for(int i = 0; i < this.size(); i++) 
		{
			if (this.get(i).equals(letter)) 
			{
				this.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public boolean contains(Object o) {
		
		//If the object is not a string, return false
		if (!(o instanceof String)) 
		{
			return false;
		}
		
		//Object must be a string, so convert it to a string
		String letter = (String)o;
		
		//Loop through every letter left in the list
		for(int i = 0; i < this.size(); i++) 
		{
			if (this.get(i).equals(letter)) 
			{
				return true;
			}
		}
		return false;
	}

	
}
