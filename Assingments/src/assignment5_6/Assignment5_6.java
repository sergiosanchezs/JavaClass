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
		
		UserAuth userObj = new UserAuth();		// Instantiating the UserAuth Class as userObj
		DecimalFormat ft = new DecimalFormat("$#,##0.00");	// Instatiating the format to print the data
		
		int count = 0;	// Counter of number of attempts
		do {
			count++;	// incrementing the counter
			// Getting username and password to verify and give access to the system
			userObj.username = JOptionPane.showInputDialog("Please, enter your username: ");
			userObj.password = JOptionPane.showInputDialog("Please, enter your password: ");
			// checking if the username and password entered are incorrect to show a message to the user
			// and if the count is in the not on the 3 attempt.
			if (!userObj.isUserPassValid() && count < 3)
				JOptionPane.showMessageDialog(null, "Please verify your username and password and try it again.");
			
		} while (count < 3 && !userObj.isUserPassValid() );
		
		// if the username and password are valid access is granted.
		if (userObj.isUserPassValid()) {
			JOptionPane.showMessageDialog(null, "Access Granted!");
			
			/* Instantiating the objects Quote with the different constructors,
			 * but only using in the calculations the one that has the defaults values:
			 * Small Box Price = $2.50
			 * Large Box Price = $4.50
			 */
			Quote obj = new Quote();
			Quote obj2 = new Quote(2.67, "s");
			Quote obj3 = new Quote(5.13, "l");
			Quote obj4 = new Quote(2.58, 4.76);
			// Assigning to the object the first and the last name fields
			obj.firstName = JOptionPane.showInputDialog("Please, enter your first name: ");
			obj.lastName = JOptionPane.showInputDialog("Please, enter your last name: ");
			
			// Get packages from the user
			obj.packageAHours = Integer.parseInt(JOptionPane.showInputDialog("How many hours do you want for package A (" 
					+ ft.format(obj.packageAPrice) + "):\nIf you don't want any just put 0."));
			obj.packageBHours = Integer.parseInt(JOptionPane.showInputDialog("How many hours do you want for package B (" 
					+ ft.format(obj.packageBPrice) + "):\nIf you don't want any just put 0."));
			
			// Get storage from the user
			obj.storageSmallDays = Integer.parseInt(JOptionPane.showInputDialog("How many days do you want for a small storage (" 
					+ ft.format(obj.storageSmallPrice) + "):\nIf you don't want any just put 0."));
			obj.storageLargeDays = Integer.parseInt(JOptionPane.showInputDialog("How many hours do you want for a large storage (" 
					+ ft.format(obj.storageLargePrice) + "):\nIf you don't want any just put 0."));
			
			// Which type Box the user wants
			obj.boxType = JOptionPane.showInputDialog("Which type of box do you want?\n" + 
					"type 'S' or 's' for small (" + ft.format(obj.smallBoxesPrice) + ")\n" + 
					"type 'L' or 'l' for large (" + ft.format(obj.LargeBoxesPrice) + ")\n").substring(0,1);
			
			// Calculating the Service Cost
			
			if (obj.packageAHours > 0 && obj.packageBHours > 0)		// selecting both packages
				obj.serviceCost(obj.packageAHours, obj.packageBHours);
			else if (obj.packageAHours > 0)				// Selecting the package A
				obj.serviceCost(obj.packageAHours, "A");
			else if (obj.packageBHours > 0)				// Selecting the package B
				obj.serviceCost(obj.packageBHours, "B");
			else 	// No package selected
				obj.serviceCost();
			
			// Calculating the Item Cost
			
			if (obj.storageSmallDays > 0 && obj.storageLargeDays > 0)	// selecting both storages
				obj.itemCost(obj.storageSmallDays, obj.storageLargeDays, obj.boxType);
			else if (obj.storageSmallDays > 0)			// selecting small storage
				obj.itemCost(obj.storageSmallDays, "S", obj.boxType);
			else if (obj.storageLargeDays > 0)			// selecting large storage
				obj.itemCost(obj.storageLargeDays, "L", obj.boxType);
			else	// No storage selected
				obj.itemCost(obj.boxType);
			
			// Calculating the Total Cost
			obj.totalCost();
			
			// Display all the cost to the user.
			JOptionPane.showMessageDialog(null, "Hi " + obj.firstName + " " + obj.lastName + ",\n" + 
												"The Service Cost is " + ft.format(obj.serviceCostValue) + "\n" +
												"The Items Cost is " + ft.format(obj.itemCostValue) + "\n" +
												"The Total Cost is " + ft.format(obj.totalCostValue));
			
			// Printing the other object prices with the overloading constructors.
			JOptionPane.showMessageDialog(null, "Second object:\n" + 
												"Small Box Price: " + ft.format(obj2.smallBoxesPrice) + "\n" +
												"Large Box Price: " + ft.format(obj2.LargeBoxesPrice) + "\n" +
												"\nThird object:\n" + 
												"Small Box Price: " + ft.format(obj3.smallBoxesPrice) + "\n" +
												"Large Box Price: " + ft.format(obj3.LargeBoxesPrice) + "\n" + 
												"\nFourth object:\n" + 
												"Small Box Price: " + ft.format(obj4.smallBoxesPrice) + "\n" +
												"Large Box Price: " + ft.format(obj4.LargeBoxesPrice) + "\n");
			
		}
		else 	// if the user exceeded the number of attempts to enter into the system
			JOptionPane.showMessageDialog(null, "You have exceeded your try’s, goodbye.!");
		
		

		System.exit(0);
	}

}
