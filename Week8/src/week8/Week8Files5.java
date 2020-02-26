/**
 * 
 */
package week8;
import java.io.File;
import java.io.PrintWriter;
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
		File filename = new File("names.txt");
		Scanner inputFile = new Scanner(filename);
		
		if (inputFile.hasNextLine()) 
			System.out.println("The content of the file is:");
		else
			System.out.println("No lines to be read");
		
		while(inputFile.hasNextLine()) 
		{
			str = inputFile.nextLine();
			System.out.println(str);
			
		}
		
		inputFile.close();


	}

}
