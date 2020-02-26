/**
 * 
 */
package week8;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
/**
 * @author Sergio Sanchez
 *
 */
public class Week8Methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException 
	{
		String name;
		int num1 = 13, num2 = 18;
		
		name = JOptionPane.showInputDialog("Please enter your name");
		
		first();
		second();
		third(name);
		fourth(num1, num2);
		System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + fifth(num1, num2));
		
		String filename = getFileName();
		writeToFile(filename, name);
		readFromFile(filename);
		
		System.exit(0);

	}
	// 1. Create a simple method to print your name
	public static void first() {
		System.out.println("Sergio");
	}
	
	// 2. Add two numbers within a method then print it.
	public static void second() {
		int a = 10, b = 25;
		int sum = a + b;
		System.out.println("The sum is " + sum);
	}
	
	// 3. Pass your name to a method then print it.
	public static void third(String name) {
		System.out.println("Your name is " + name);
	}
	
	/* 4. Pass two numbers declared outside the method,
	 * 	  add them together, then print it. */
	public static void fourth(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("The sum is " + sum);
	}
	
	/* 5. Pass two numbers declared outside the method,
	 *    multiply them, the return the result,
	 *    then print the result in the main method. */
	public static int fifth(int num1, int num2) {
		int mult = num1 * num2;
		return mult;
	}
	
	/* 6. Print your name to a file called myname.txt
	 *    in a method then return the file name
	 *    Print your name by 
	 *    using the myName method */
	
	public static String getFileName() {
		return JOptionPane.showInputDialog("Please enter the filename as shown\n"
				+ " in this example: myname.txt");
	}
	
	public static void writeToFile(String fileName, String name) throws IOException
	{
		FileWriter fName = new FileWriter(fileName, false);
		PrintWriter outFile = new PrintWriter(fName);
		outFile.println(name);
		outFile.close();
		System.out.println("Your file has been created");
	}
	
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
