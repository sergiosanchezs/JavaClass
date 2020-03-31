/**
 * 
 */
package assignment5_6;

import java.text.DecimalFormat;

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
		DecimalFormat ft = new DecimalFormat("$#,##0.00");
		
		int count = 0;
		do {
			count++;
			userObj.username = JOptionPane.showInputDialog("Please, enter your username: ");
			userObj.password = JOptionPane.showInputDialog("Please, enter your password: ");
			if (!userObj.isUserPassValid() && count < 3)
				JOptionPane.showMessageDialog(null, "Please verify your username and password.");
			
		} while (count < 3 && !userObj.isUserPassValid() );
		
		if (userObj.isUserPassValid()) {
			JOptionPane.showMessageDialog(null, "Access Granted!");
			
			Quote obj = new Quote();
			obj.firstName = JOptionPane.showInputDialog("Please, enter your first name: ");
			obj.lastName = JOptionPane.showInputDialog("Please, enter your last name: ");
			
			// Packages
			obj.packageAHours = Integer.parseInt(JOptionPane.showInputDialog("How many hours do you want for package A (" 
					+ ft.format(obj.packageAPrice) + "):\nIf you don't want it just put 0."));
			obj.packageBHours = Integer.parseInt(JOptionPane.showInputDialog("How many hours do you want for package B (" 
					+ ft.format(obj.packageBPrice) + "):\nIf you don't want it just put 0."));
			
			// Storage
			obj.storageSmallDays = Integer.parseInt(JOptionPane.showInputDialog("How many days do you want for a small storage (" 
					+ ft.format(obj.storageSmallPrice) + "):\nIf you don't want it just put 0."));
			obj.storageLargeDays = Integer.parseInt(JOptionPane.showInputDialog("How many hours do you want for a large storage (" 
					+ ft.format(obj.storageLargePrice) + "):\nIf you don't want it just put 0."));
			
			// Boxes
			obj.smallBoxesNumber = Integer.parseInt(JOptionPane.showInputDialog("How many small boxes (" 
					+ ft.format(obj.smallBoxesPrice) + ") do you want? :\nIf you don't want it just put 0."));
			obj.LargeBoxesNumber = Integer.parseInt(JOptionPane.showInputDialog("How many large boxes (" 
					+ ft.format(obj.LargeBoxesPrice) + ") do you want? :\nIf you don't want it just put 0."));
			
			JOptionPane.showMessageDialog(null, "The Service Cost is " + ft.format(obj.serviceCost()));
			JOptionPane.showMessageDialog(null, "The Items Cost is " + ft.format(obj.itemCost()));
			JOptionPane.showMessageDialog(null, "The Total Cost is " + ft.format(obj.totalCost()));
		}
		else 
			JOptionPane.showMessageDialog(null, "You have exceeded your try’s, goodbye.!");
		

	}

}
