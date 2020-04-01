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
					+ ft.format(obj.packageAPrice) + "):\nIf you don't want any just put 0."));
			obj.packageBHours = Integer.parseInt(JOptionPane.showInputDialog("How many hours do you want for package B (" 
					+ ft.format(obj.packageBPrice) + "):\nIf you don't want any just put 0."));
			
			// Storage
			obj.storageSmallDays = Integer.parseInt(JOptionPane.showInputDialog("How many days do you want for a small storage (" 
					+ ft.format(obj.storageSmallPrice) + "):\nIf you don't want any just put 0."));
			obj.storageLargeDays = Integer.parseInt(JOptionPane.showInputDialog("How many hours do you want for a large storage (" 
					+ ft.format(obj.storageLargePrice) + "):\nIf you don't want any just put 0."));
			
			// Which type Box the customer wants
			obj.boxType = JOptionPane.showInputDialog("Which type of box do you want?\n" + 
					"type 'S' or 's' for small (" + ft.format(obj.smallBoxesPrice) + ")\n" + 
					"type 'L' or 'l' for large (" + ft.format(obj.LargeBoxesPrice) + ")\n");
			
			// Calculating the Service Cost
			
			if (obj.packageAHours > 0 && obj.packageBHours > 0)		// selecting both packages
				obj.serviceCost(obj.packageAHours, obj.packageBHours);
			else if (obj.packageAHours > 0)				// Selecting the package A
				obj.serviceCost(obj.packageAHours, 'A');
			else if (obj.packageBHours > 0)				// Selecting the package B
				obj.serviceCost(obj.packageAHours, 'B');
			else 	// No package selected
				obj.serviceCost();
			
			// Calculating the Item Cost
			
			if (obj.storageSmallDays > 0 && obj.storageLargeDays > 0)	// selecting both storages
				obj.itemCost(obj.storageSmallDays, obj.storageLargeDays, obj.boxType);
			else if (obj.storageSmallDays > 0)			// selecting small storage
				obj.itemCost(obj.storageSmallDays, "S", obj.boxType);
			else if (obj.storageLargeDays > 0)			// selecting large storage
				obj.itemCost(obj.storageSmallDays, "L", obj.boxType);
			else	// No storage selected
				obj.itemCost(obj.boxType);
			
			// Calculating the Total Cost
			obj.totalCost();
			
			// Display all the cost to the user.
			JOptionPane.showMessageDialog(null, "Hi " + obj.firstName + obj.lastName + ",\n" + 
												"The Service Cost is " + ft.format(obj.serviceCostValue) + "\n" +
												"The Items Cost is " + ft.format(obj.itemCostValue) + "\n" +
												"The Total Cost is " + ft.format(obj.totalCostValue));
			
		}
		else 
			JOptionPane.showMessageDialog(null, "You have exceeded your try’s, goodbye.!");
		

		System.exit(0);
	}

}
