/**
 * 
 */
package assignment3;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * This program is to create a file with a list of numbers provided
 * by the user. The size of the list and the name of the file are
 * chosen by the user.  
 * 
 * @author Sergio Sanchez
 * @version 1.0
 * @since   2020-02-27
 */

/*
1.	Create a program called “A3-ID#” of your choice you must use the following in one program.
Create a program that will create a list of things, open it, add the numbers then print the numbers.

a.	You must use five methods each method must do something different 
b.	All inputs must be through dialog boxes; all output must be through show Message dialog box.
c.	Create a file, the file must have a list of numbers, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100. 
d.	Validate that the file name is correct after the user enters the name.
e.	Your output from assignment 7 must be total of the numbers, avg of the numbers, print each number from the file.
f.	Print your names by using a method
g.	Take one snip for each output
h.	Upload your snips and the “A3-ID#”.java file
 * */
public class Assignment3 {

	/**
	 * @param args Unused.
	 */
	public static void main(String[] args) throws IOException
	{
		int option = 0;
		
		do {
			option = getMainMenu();
			
			switch(option) {
				case 1:
					writeToFile("myfile.txt");
					break;
				case 2:
					break;
				case 3:
					break;
			}
			
		} while (option != 3);
		
		
		
		System.exit(0);
	}
	
	
	public static int getMainMenu() {
		String message =	"                      Main Menu\n" +
							" 1. Write a list of numbers into a file.\n" +
							" 2. Read the list of numbers from a file.\n" +
							" 3. Exit the program.";
		int menuOption = getNumberFromUser(message);
		return menuOption;
		
	}
	
	/**
	 * This method write in to a file the numbers
	 * 10 to 100 with a step of 10.
	 * 
	 * @param fileName This is the file name.
	 */
	public static void writeToFile(String fileName) throws IOException
	{
		FileWriter fName = new FileWriter(fileName, false);
		PrintWriter outFile = new PrintWriter(fName);
//		outFile.println(name);
		
		int listSize = getNumberFromUser("Please enter number of numbers to save on the list");
		for (int i = 1; i <= listSize; i++) {
			int number = getNumberFromUser("Please enter number " + i);
			outFile.println(number);
		}
		
		outFile.close();
		System.out.println("Your file has been created");
	}
	
	
	/**
	 * This is a method that show a message to the user and take 
	 * the input of an integer number. If the user put a no valid
	 * number or just a letter or phrase it will show him an error
	 * message until user enter a valid number. 
	 * 
	 * @param message This is to pass the message to print on the screen.
	 * @return int This return a number greater than 0.
	 */
	public static int getNumberFromUser(String message) {
		
		int number;
		do {
			number = 0;
			try 
			{
				number = Integer.parseInt(JOptionPane.showInputDialog(message));
			} 
			catch(Exception ex) 
			{
				JOptionPane.showMessageDialog(null, "Error: Please enter a number!");
				number = -1;
			}
			
		} while (number <= 0); 
		
		return number;
	}
	
	/**
	 * @param args
	 */
	public static void readFromFile(String fileName) throws IOException
	{
		File fName = new File(fileName);
		
		if (fName.isFile()) {
			Scanner inFile = new Scanner(fName);
			String line1 = inFile.nextLine();
			System.out.println("The first line is: " + line1);
			
		} else {
			System.out.println("The file does not exist!");
		}
		
	}

}
