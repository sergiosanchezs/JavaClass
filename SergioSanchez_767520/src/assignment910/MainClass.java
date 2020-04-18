/**
 * 
 */
package assignment910;
import java.io.IOException;

/**
 * This program allows the user to have count their coins, add them, and
 * print in the console and store in a file very organized that the user
 * can see the summary in a clear way.
 * 
 * This is the Class1 = MainClass.
 * This is the Class2 = CoinMachine.
 * This is the Class3 = PrintCoinDetails.
 * 
 * @author Sergio Sanchez
 * 
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		CoinMachine obj1 = new CoinMachine();	// creating an object of CoinMachine class
		obj1.getUserQtyForCoins();	// get user inputs for all types of coins
		obj1.calculateTotal();		// calculate the total column
		obj1.writeCoinCountsToFile();	// Storing and printing the information
		
		// creating the object of PrintCoinDetails by passing the previous object as argument
		PrintCoinDetails obj2 = new PrintCoinDetails(obj1);	
		obj2.calculateTotals();	// calculating total of coins and amount
		obj2.appendTotalsToFile();	// Storing and printing the information

	}

}
