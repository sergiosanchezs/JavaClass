/**
 * 
 */
package week5;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * @author Sergio Sanchez
 *
 */
public class BobCurrencyCalv3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String username;
		boolean isAccessGranted = false;
		
		username = JOptionPane.showInputDialog("Please enter your username:");
		
		if (username.equalsIgnoreCase("ssanchez")) 
		{
			String password;
			password = JOptionPane.showInputDialog("Please enter your password:");
			if (password.equals("Abc123")) {
				JOptionPane.showMessageDialog(null, "CONGRATULATIONS! Access granted.");
				isAccessGranted = true;
			}
			else
				JOptionPane.showMessageDialog(null, "ACCESS DENIED! Please check your password.");
		}
		else
			JOptionPane.showMessageDialog(null, "ACCESS DENIED! Please check your username.");
		
		
		if (isAccessGranted) {
			

			double	USD,
					CAD = 1.33,
					COP = 2350,
					value;
			
			DecimalFormat ft = new DecimalFormat("$###,##0.00");
			
			int option;
			
			option = Integer.parseInt(JOptionPane.showInputDialog("Please select the currency that\n"
					+ "you want to convert from USD.\n"
					+ "Enter 1 for COP and 2 for CAD"));
			
			switch(option) {
				case 1:		// This option is to convert USD to COP
					USD = Double.parseDouble(JOptionPane.showInputDialog("Please enter your USD$ that you want to convert"));
					value = USD * COP;
					JOptionPane.showMessageDialog(null, "USD " + ft.format(USD) + " is equal to COP " + ft.format(value));
					break;
				case 2:		// This option is to convert USD to CAD
					USD = Double.parseDouble(JOptionPane.showInputDialog("Please enter your USD$ that you want to convert"));
					value = USD * CAD;
					JOptionPane.showMessageDialog(null, "USD " + ft.format(USD) + " is equal to CAD " + ft.format(value));
					break;
				default:	// Incorrect option selected
					JOptionPane.showMessageDialog(null, "You don't chose the correct option, try again later!");
					break;
			}
			
		}
		
		System.exit(0);
	}

}
