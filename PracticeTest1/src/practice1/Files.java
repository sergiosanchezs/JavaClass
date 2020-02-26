/**
 * 
 */
package practice1;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * @author Sergio Sanchez
 *
 */
public class Files {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException 
	{ 
		// Writing a file overwritten the information.
		PrintWriter outFile = new PrintWriter("overwrite.txt");
		outFile.println("Ivan");
		outFile.println("Sergio");
		outFile.println("Tiago");
		
		outFile.close();

	}

}
