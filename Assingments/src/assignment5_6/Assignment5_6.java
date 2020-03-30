/**
 * 
 */
package assignment5_6;

import javax.swing.JOptionPane;

/**
 * @author Sergio Sanchez
 *
 */
public class Assignment5_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		UserAuth userObj = new UserAuth();
		
		int count = 0;
		do {
			count++;
			userObj.username = JOptionPane.showInputDialog("Please, enter your username: ");
			userObj.password = JOptionPane.showInputDialog("Please, enter your password: ");
			if (!userObj.isUserPassValid())
				JOptionPane.showMessageDialog(null, "Please verify your username and password.");
			
		} while (count < 3 && !userObj.isUserPassValid() );
		
		if (userObj.isUserPassValid()) {
			JOptionPane.showMessageDialog(null, "Access Granted!");
			
			
			
		}
		else 
			JOptionPane.showMessageDialog(null, "You have exceeded your try’s, goodbye.!");
		

	}

}
