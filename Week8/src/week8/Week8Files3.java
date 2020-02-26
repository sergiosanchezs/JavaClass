/**
 * 
 */
package week8;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * @author Sergio Sanchez
 *
 */
public class Week8Files3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{

		FileWriter filename = new FileWriter("names.txt", true);
		PrintWriter outFile = new PrintWriter(filename);
		
		outFile.println("Sergio");
		outFile.println("Maria F.");
		
		outFile.close();

	}

}
