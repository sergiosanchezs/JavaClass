/**
 * 
 */
package practice1;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Sergio Sanchez
 *
 */
public class Files2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		// Writing a file with no overwrite, just append more information
		FileWriter fileName = new FileWriter("append.txt", true);
		PrintWriter outFile = new PrintWriter(fileName);
		
		outFile.println("Sergio");
		outFile.println("Maria");
		
		outFile.close();
		
		

	}

}
