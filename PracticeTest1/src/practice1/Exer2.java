/**
 * 
 */
package practice1;
import javax.swing.JOptionPane;
/**
 * @author Sergio Sanchez
 *
 */
public class Exer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String passw, user, validuser = "ssanchez", validpassw = "Abc123";
		
		
		
		do {
			
			user = "";
			user = JOptionPane.showInputDialog("username:");
			
			if (!user.equalsIgnoreCase(validuser))
				JOptionPane.showMessageDialog(null, "Your username is not valid! Please try again.");
			
		} while (!user.equalsIgnoreCase(validuser));
		
		do {
			
			passw = JOptionPane.showInputDialog("Please enter your password:");
			
			if (!passw.equals(validpassw))
				JOptionPane.showMessageDialog(null, "Your username is not valid! Please try again.");
			
		} while (!passw.equals(validpassw));
		
		
		System.exit(0);
		

	}

}
