/**
 * 
 */
package assignment7;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * This is a Bank Account with  user authentication, 
 * store balance into file and read the existing balance 
 * when the file exist.
 * 
 * @author Sergio Sanchez
 */
public class BankAccount {
	
	String usernameCredentials[] =  {"bob", "bobby", "billy", "tony"};
	String passwordCredentials[] =  {"Abc1", "Abc2", "Abc3", "Abc4" }; // passwords
	String fileName[] =  {"bob.txt", "bobby.txt", "billy.txt", "tony.txt"};
	double balance;      // Account balance
	int idx = -1;
	
	/**
	 * This constructor sets the starting balance at 0.0.
	 */
	 public BankAccount()
	 {
	    balance = 0.0;
	 }
	 
	 /**
	  * This constructor sets the starting balance at the balance the user is specifying.
	  * @param balance To set as the start balance.
	  */
	 public BankAccount(double balance)
	 {
	    this.balance = balance;
	 }
	 
	 /**
	  * 
	  * @return boolean return a boolean if the user has gained access into the system.
	  * @throws IOException for File class to read the balance
	  */
	 public boolean isAccessGranted() throws IOException {
	    
		 String username = JOptionPane.showInputDialog("Please enter your username:");
		 
		 int i;
		 idx = -1;	// if the user does not exist in the system
		 
		 // for Loop to search if the user exist in the system 
		 for(i = 0; i < usernameCredentials.length; i++)
			 if (username.equalsIgnoreCase(usernameCredentials[i]))
				 idx = i;
		 
		 if (idx == -1) // The user does not exist
		 {
			 JOptionPane.showMessageDialog(null, "The user is not in the system!");
			 return false;
		 } else {
			 String password = JOptionPane.showInputDialog("Please enter your password:");
			 if (password.equals(passwordCredentials[idx])) {	// The user exist and password is correct
				 JOptionPane.showMessageDialog(null, "Your access has been granted");
				 readFromFileTheBalance();	// Read from the file the actual balance
				 return true;
			 }
		 }
		 JOptionPane.showMessageDialog(null, "The password is wrong!");	// The user exist but password is wrong.
		 return false;
	 }
	
	/**
	 * The deposit method makes a deposit into the account from user input.
	*/
	public void deposit()
	{
		balance += Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount to deposit"));
	}

	/**
	 * The withdraw method withdraws an amount from the account from user input.
	 */
	public void withdraw()
	{
		balance -= Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount to withdraw"));
	}
	
	/**
	 * Read the balance of the person is logged into the system
	 * @throws IOException for using File class to read the balance
	 */
	public void readFromFileTheBalance() throws IOException
	{
		DecimalFormat dollar = new DecimalFormat("$#0.00");		// Declaring the money format
		File fName = new File(fileName[idx]);	// read the corresponding file
		
		if (fName.isFile()) {	// if file exist it takes the current balance.
			Scanner inFile = new Scanner(fName);
			balance = inFile.nextDouble(); // The balance is equals to the data read from the file
		} else {	// if the file doesn't exist it assign 0 to the balance
			balance = 0.0;
		}
		
		// Printing the balance either it was read from the file or not.
		JOptionPane.showMessageDialog(null, "Your balance is " + dollar.format(balance));
	}
   
   /**
    * This method is in charge to store the balance in to a file.
    * @throws IOException for using PrintWriter class to write balance into the file.
    */
	public void writeBalanceToFile() throws IOException {
	   DecimalFormat dollar = new DecimalFormat("$#0.00");		// Declaring the money format
	   DecimalFormat ft = new DecimalFormat("#0.00");		// Declaring the format of the decimal to store data
	   PrintWriter outFile = new PrintWriter(fileName[idx]);	// Open the filename corresponding to the user
	   outFile.print(ft.format(balance));	// printing the value replacing the previous balance 
	   JOptionPane.showMessageDialog(null, "Your new account ballance is " + dollar.format(balance)); // Display on screen the new balance
	   outFile.close();  // closing the file
	}
   
}
