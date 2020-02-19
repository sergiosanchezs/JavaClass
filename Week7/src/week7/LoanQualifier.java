/**
 * 
 */
package week7;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
/**
 * @author Sergio Sanchez
 *
 */
public class LoanQualifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double	salary,
				yearsWorked,
				percentRate = 0.0;
		
		int creditScore;
		
		DecimalFormat percentage = new DecimalFormat("#0.0%");
		
		salary = Double.parseDouble(JOptionPane.showInputDialog("Please enter your salary:"));
		
		if (salary > 80000.00) {
			
			yearsWorked = Double.parseDouble(JOptionPane.showInputDialog("Please your years worked:"));
			
			if (yearsWorked > 5.0) {
				creditScore = Integer.parseInt(JOptionPane.showInputDialog("Please enter your credit score:"));
				
				if (creditScore > 400) {

					if (creditScore >= 501 && creditScore <= 800) {
						percentRate = 0.025;
					} else if (creditScore >= 401 && creditScore <= 500){
						percentRate = 0.035;
					}
					JOptionPane.showMessageDialog(null, "You are qualified and your percentage rate will be " + percentage.format(percentRate));
					
				} else {
					JOptionPane.showMessageDialog(null, "You are NOT qualified. Your credit score is low!");
				}
				
			} else {  // yearsWorked <= 5.0 years
				JOptionPane.showMessageDialog(null, "The time that you have worked is too short, you worked time must be over 5 years!");
			}
			
		} else { // salary <= $80,000
			JOptionPane.showMessageDialog(null, "Your salary is to low, it must be above $80,000.00!");
		}
		
	}

}
