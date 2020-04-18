/**
 * 
 */
package assignment910;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * This is the class CoinMachine that allows the user to have 
 * 6 different coin denominations and let the user enter the
 * quantity of coins all coins through a method and save
 * all the values into a file and print them into the console.
 * 
 * @author Sergio Sanchez
 *
 */
public class CoinMachine {
	
	String coinDenomination[] = { "5¢", "10¢", "25¢", "50¢", "$1", "$2" };
	double coinValue[] = {0.05, 0.10, 0.25, 0.50, 1.00, 2.00 };
	int qtyCoins[];
	double total[];
	
	/**
	 * This constructor initialize the size of 
	 * the qtyCoins and total arrays.
	 */
	public CoinMachine() {
		this.qtyCoins = new int[6];
		this.total = new double[6];
	}
	
	/**
	 * This method get the user input for coins quantity 
	 * using JOptionPane dialog.
	 */
	public void getUserQtyForCoins() {
		for (int i = 0; i < qtyCoins.length; i++)
			qtyCoins[i] = Integer.parseInt(JOptionPane.showInputDialog(
					"Please enter the number of coins of " + coinDenomination[i] + " denomination:"));
	}
	
	/**
	 * This method calculate the total by multiplying
	 * the quantity of the coins and the value for each
	 * coin denomination.
	 */
	public void calculateTotal() {
		this.total = new double[6];
		for (int i = 0; i < total.length; i++)
			total[i] = qtyCoins[i] * coinValue[i];
	}
	
	/**
	 * This method write the coins denomination, amount or quantity, and the total
	 * 
	 * at the end of the total.txt file.
	 * @throws IOException The use of FileWriter and PrintWriter class. 
	 */
	public void writeCoinCountsToFile() throws IOException {
	   PrintWriter outFile = new PrintWriter("total.txt");
	   DecimalFormat ft = new DecimalFormat("#0.00");
	   
	   // Formating first line with the column names
	   String strToPrint = String.format("%-20s %-20s %-20s", "Coins", "Amount", "Total");
	   System.out.println(strToPrint);		// printing in the console
	   outFile.println(strToPrint);		// printing in the file
	   
	   // For loop to go through all the elements of coin denominations
	   for (int i = 0; i < coinDenomination.length; i++) {
		   // Formating the data in the 3 columns
		   strToPrint = String.format("%-20s %-20s %-20s", coinDenomination[i], qtyCoins[i], ft.format(total[i]));
		   System.out.println(strToPrint);		// printing in the console
		   outFile.println(strToPrint);		// printing in the file
	   }
	   outFile.close();
	}

}
