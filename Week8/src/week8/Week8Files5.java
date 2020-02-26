/**
 * 
 */
package week8;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Sergio Sanchez
 *
 */
public class Week8Files5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		String str;
		
		// Reading a file
		File fileName = new File("names.txt");
		
		// Checking if the file exist
		if (fileName.isFile()) {
			
			Scanner inputFile = new Scanner(fileName);	// Reading the file with Scanner class
			
			if (inputFile.hasNextLine()) // If the file has content it will read the content
				System.out.println("The content of the file is:");
			else	// if the file doesn't has content show a message to the user
				System.out.println("No lines to be read");
			
			while(inputFile.hasNextLine()) // while the file has lines to read it will keep reading and printing
			{
				str = inputFile.nextLine();
				System.out.println(str);
			}
			
			inputFile.close();	// closing the file
			
			// deleting a file
			fileName.delete();
			System.out.println("The file called " + fileName + " was deleted");
			
		}
		else 
			System.out.println("The file called " + fileName + " does not exist!");
			

	}

}
