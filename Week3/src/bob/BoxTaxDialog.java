/**
 * 
 */
package bob;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * @author Sergio Sanchez
 *
 */
public class BoxTaxDialog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// This program will calculate Bob Taxes
		// Declare values
		String salary;
		double taxRate = 0.26;
		double bobSalary;
		
		// DecimalFormat Object
		DecimalFormat ft = new DecimalFormat("$###,###.##");
		
		// Take the user's input as string
		salary = JOptionPane.showInputDialog("Enter Bob's salary");
		bobSalary = Double.parseDouble(salary); // Converting the string into double
		
		// Calculations
		double taxOwed = taxRate * bobSalary;
		double finalSalary = bobSalary - taxOwed;
		
		// Output
		JOptionPane.showMessageDialog(null, "Bob owes $" + ft.format(taxOwed) + 
											" in taxes and " + 
											"Bob's take home pay is "
											+ ft.format(finalSalary));
		
		System.exit(0);

	}

}
