import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String fileName = "GitSetupList.txt";
		String gitSetupList = "";
		String newName = "";
		
		gitSetupList = readGitSetupList(fileName);
		newName = queryName();
		gitSetupList += newName;
		System.out.print(gitSetupList);
		writeGitSetupList(gitSetupList, fileName);
	}
	
	public static String queryName() {
		return JOptionPane.showInputDialog("Enter your name: ");
	}
	
	public static String readGitSetupList(String fileName) {
		String input = "";
		String nextLine = "";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			nextLine = br.readLine();
			while (nextLine != null) {
				input += nextLine + "\n";
				nextLine = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Usage error. File not found (" + fileName + ").");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("IOException: " + e);
			System.exit(1);
		}

		return input;
	}
	
	
	public static void writeGitSetupList(String gitSetupList, String fileName) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(gitSetupList);
			bw.close();
		} catch (FileNotFoundException e) {
			System.err.println("Usage error. File not found (" + fileName + ").");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("IOException: " + e);
			System.exit(1);
		}
	}
}
