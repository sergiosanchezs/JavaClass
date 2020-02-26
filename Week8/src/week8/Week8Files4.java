/**
 * 
 */
package week8;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * @author Sergio Sanchez
 *
 */
public class Week8Files4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{

		PrintWriter outFile = new PrintWriter("src/name.txt");
		
		outFile.println("Sergio");
		
		outFile.close();

	}

}
