package tools;

import java.security.SecureRandom;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameIDGenerator 
{			
	private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";

    private static final String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
    private static SecureRandom random = new SecureRandom();
    
    private static int ID_LENGTH = 8;
	
    /*
     * Generates random Code
     */
    public static String generateGameID() 
    {

        StringBuilder sb = new StringBuilder(ID_LENGTH);
        for (int i = 0; i < ID_LENGTH; i++) 
        {

			// 0-62 (exclusive), random returns 0-61
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

            // debug
            System.out.format("%d\t:\t%c%n", rndCharAt, rndChar);

            sb.append(rndChar);

        }

	return sb.toString();
	}
    
    public static void displayGameID(String gameID) 
    {
    	JOptionPane.showMessageDialog(new JFrame(), "New Game Id Is:  " + "\n" + gameID);
    }
}
