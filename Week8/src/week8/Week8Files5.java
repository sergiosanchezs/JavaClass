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
		if (fileName.isFile()) {
			
			Scanner inputFile = new Scanner(fileName);
			
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
			
			// deleting a file
			fileName.delete();
			System.out.println("The file called " + fileName + " was deleted");
			
		}
		else 
			System.out.println("The file called " + fileName + " does not exist!");
			

	}

}
