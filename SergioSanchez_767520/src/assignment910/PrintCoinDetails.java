/**
 * 
 */
package assignment910;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.io.FileWriter;

/**
 * This Class allow receive the CoinMachine Class
 * in order to get the total of coins and the total
 * of value for all of them. Moreover, append this values 
 * on the total.txt file and print them into the screen.
 * 
 * @author Sergio Sanchez
 *
 */
public class PrintCoinDetails {
	
	CoinMachine obj;
	int totalCoins;
	double totalAmount;
	
	/**
	 * This constructor allow you create an obj by passing
	 * an object of CoinMachine.
	 * 
	 * @param obj This is the object you need to pass as argument
	 * in this method to initialized into the field obj.
	 */
	public PrintCoinDetails(CoinMachine obj) {
		this.obj = obj;
	}
	
	/**
	 * This method make the calculations of the total Amount and 
	 * the total coins and store them in to the corresponding fields.
	 */
	public void calculateTotals() {
		totalAmount = 0;
		totalCoins = 0;
		for (int i = 0; i < obj.qtyCoins.length; i++) {
			totalAmount += obj.qtyCoins[i] * obj.total[i];
			totalCoins += obj.qtyCoins[i];
		}
	}
	
	/**
	 * This method append the total amount and the total number of coins
	 * at the end of the total.txt file.
	 * @throws IOException The use of FileWriter and PrintWriter class. 
	 */
	public void appendTotalsToFile() throws IOException {
		FileWriter filename = new FileWriter("total.txt", true);	// Initializing FileWriter to append data to the document
		PrintWriter outFile = new PrintWriter(filename);	// Passing the filename object to append data
		DecimalFormat ft = new DecimalFormat("#0.00");		// Declaring the format of the decimal data
		
		// Formating first line with 3 lines one in each column
		String strToPrint = String.format("%-20s %-20s %-20s", "------", "------", "------");
		System.out.println(strToPrint);		// printing in the console
		outFile.println(strToPrint);		// printing in the file
		
		// Formating the data in the 3 columns
		strToPrint = String.format("%-20s %-20s %-20s", "Total", totalCoins, ft.format(totalAmount));
		System.out.println(strToPrint);		// printing in the console
		outFile.println(strToPrint);		// printing in the file
		
		outFile.close(); // Closing the file
	}
	
}