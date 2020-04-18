/**
 * 
 */
package assignment7;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * This program has a security access to each of the 
 * users accounts and let them access and see their balance.
 * Moreover, it allows the use to enter a deposit and a withdraw,
 * update the balance and store it into a file. For next time
 * the user enter again he can see the actual balance on his account.
 * 
 * This is the Class1 = MainClass.
 * This is the Class2 = BankAccount.
 * 
 * @author Sergio Sanchez
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		BankAccount obj1 = new BankAccount();	// Instantiate BankAccount 
		
		if(obj1.isAccessGranted()) { // Request credentials and check if are right
			obj1.deposit();	// Make a deposit
			obj1.withdraw();	// Make a withdraw
			obj1.writeBalanceToFile();	// write the new balance to the file
		}

	}

}
