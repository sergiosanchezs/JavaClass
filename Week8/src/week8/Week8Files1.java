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
public class Week8Files1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		
		PrintWriter firstfile = new PrintWriter("myname.txt");
		
		firstfile.println("Sergio");
		
		firstfile.close();
		

	}

}
