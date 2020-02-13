/**
 * 
 */
package week5;
import java.util.Scanner;

/**
 * @author Sergio Sanchez
 *
 */
public class Password {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String password;
		
		System.out.println("Please enter your password: ");
		
		Scanner keyboard = new Scanner(System.in);
		
		password = keyboard.nextLine();
		
		if (password.equals("ABC123"))
			System.out.println("CONGRATULATIONS! Access granted.");
		else
			System.out.println("ACCESS DENIED!");
		
		
	}

}
