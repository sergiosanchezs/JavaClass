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
public class Week8Files2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		
		PrintWriter firstfile = new PrintWriter("name.txt");
		
		firstfile.println("Sergio");
		
		firstfile.close();
		

	}

}
