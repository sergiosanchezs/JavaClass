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
 * This program is to create a file with a list of numbers from 10
 * to 100 with a step of 10. Then, ask to the user for the file name
 * until the filename is 'myfile.txt' to read the list of numbers
 * sum and count them, and calculate the average. For last, It prints
 * the authors name. 
 * 
 * @author Sergio Sanchez
 * @version 1.0
 * @since   2020-02-27
 */

public class A3_C0767520 {

	/**
	 * This is the main method when the program call the other
	 * methods created down below.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) throws IOException
	{
		final String FILE_NAME = "myfile.txt";
		createAListNumbersFile(FILE_NAME);	// Create the file and attach the numbers
		
		String userFileName = validateFileName(FILE_NAME);
		
		readFromFile(userFileName);
		
		printMyName();
		
		System.exit(0);
		
	}
	
	/**
	 * This method validate the right name of the file by getting the input
	 * of the user and requesting again until the file name is right.
	 * 
	 * @param FILE_NAME constant to assure that file name must be equal to it.
	 * @return String This is the user file name.
	 */
	public static String validateFileName(final String FILE_NAME) {
		String userFileName;
		do {
			userFileName = getFileName();
			if (!userFileName.equalsIgnoreCase(FILE_NAME))
				printStr("The filename must be 'myfile.txt'.\nPlease Try Again.");
			
		} while (!userFileName.equalsIgnoreCase(FILE_NAME));
		return userFileName;
	}
	
	/**
	 * This method prints the author name.
	 */
	public static void printMyName(){
		String name = "Sergio Sanchez";
		printStr("My name is " + name);	
	}
	
	/**
	 * This method get the file name from the user.
	 * 
	 * @return String return the user input.
	 */
	public static String getFileName() {
		return JOptionPane.showInputDialog("Please enter the file name:");
	}
	
	/**
	 * This method creates a list of numbers with the file name
	 * passed.
	 * 
	 * @param fileName This is the file name.
	 */
	public static void createAListNumbersFile(String fileName) throws IOException 
	{
		FileWriter fName = new FileWriter(fileName, false);	// Overwrite activated
		PrintWriter outFile = new PrintWriter(fName);
		
		for (int i = 1; i <= 10; i++) {
			int number = i * 10;
			outFile.println(number);
		}
		
		outFile.close();
		
		JOptionPane.showMessageDialog(null, "The myfile.txt document was created!");
	}
	
	/**
	 * This is a method that show a message to the user and take 
	 * the input of an integer number. If the user put a no valid
	 * number or just a letter or phrase it will show him an error
	 * message until user enter a valid number, greater than 0.
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
				printStr("Error: Please enter a number!");
				number = -1;
			}
			
		} while (number <= 0); 
		
		return number;
	}
	
	/**
	 * This method reads a file with integers numbers and 
	 * add and count them to calculate the average.
	 * 
	 * @param fileName This is the name of the file to read.
	 */
	public static void readFromFile(String fileName) throws IOException
	{
		int num, total = 0, counter = 0;	// starting the total and counter in 0;
		String message;
		File fName = new File(fileName);	// Instantiate the object File
		
		message = "File Content:\n";
		
		if (fName.isFile()) {	// Check if the file exist.
			Scanner inFile = new Scanner(fName);
			do {
				if (inFile.hasNext()) {		// if the file has more numbers keep adding.
					num = inFile.nextInt();	// reading the next integer number from the file
					total += num;			// adding the numbers into total
					counter++;				// counting the numbers
					message += num + "\n";	// adding numbers to the display message
				}
			} while (inFile.hasNext());
			
			message += "The total sum is " + total + "\n";		// Adding the total sum to the display message
			message += "The average is " + getAverage(total, counter) + "\n";	// adding the average to the display message
			
			printStr(message);	 // print the message in JOptionPane
			
		} else {
			printStr("The file does not exist!");
		}
		
	}
	
	/**
	 * This is a void method to print on the screen
	 * a message to the user using JOptionPane.
	 * 
	 * @param message This is the string to print
	 */
	public static void printStr(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * This method takes the total and the quantity
	 * numbers and return the average.
	 * 
	 * @param total This is the total sum of all the numbers.
	 * @param qty This is the quantity of numbers added.
	 * @return double return the average of the arguments
	 * passed.
	 */
	public static double getAverage(double total, double qty) {
		return total/qty;
	}
}
