/**
 * 
 */
package bob;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * @author Sergio Sanchez
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare values
		String payRate;
		double bobSalary;
		double hours;
		double finalSalary;
		char number = 64;
		
		// Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
		// DecimalFormat Object
		DecimalFormat ft = new DecimalFormat("$###,###.##");
		
		// Input Dialog
		payRate = JOptionPane.showInputDialog("Please enter the Pay Rate:");
		bobSalary = Double.parseDouble(payRate);
		
		// Input Console
		System.out.println("Enter your hours?");
		hours = keyboard.nextDouble();
		
		// Calculation
		finalSalary = bobSalary * hours;
		
		// Output
		JOptionPane.showMessageDialog(null, "Your total pay is " + ft.format(finalSalary));
		System.out.println("The ascii is " + number + " "
							+ ""
							+ ""
							+ "and the unicode is \u0040");
		
		keyboard.close();
		System.exit(0);


	}

}
