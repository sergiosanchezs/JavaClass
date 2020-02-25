/**
 * 
 */
package practice1;
import java.util.Scanner;

/**
 * @author Sergio Sanchez
 *
 */
public class Exer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String passw, user, validuser = "ssanchez", validpassw = "Abc123";
		Scanner keyboard = new Scanner(System.in);
		
		do {
			
			user = "";
			System.out.println("username:");
			user = keyboard.nextLine();
			
			if (!user.equalsIgnoreCase(validuser))
				System.out.println("Your username is not valid! Please try again.");
			
		} while (!user.equalsIgnoreCase(validuser));
		
		do {
			System.out.println("Please enter your password:");
			passw = keyboard.nextLine();
			
			if (!passw.equals(validpassw))
				System.out.println("Your password is incorrect! Please try again.");
			
		} while (!passw.equals(validpassw));


	}

}
