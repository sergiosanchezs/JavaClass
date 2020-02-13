/**
 * 
 */
package week5;
import javax.swing.JOptionPane;
/**
 * @author Sergio Sanchez
 *
 */
public class BobCurrencyCalv2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double	USD,
				CAD = 1.33,
				value;
		
		USD = Double.parseDouble(JOptionPane.showInputDialog("Please enter your USD$ that you want to convert to CAD$"));
		
		value = USD * CAD;
		JOptionPane.showMessageDialog(null, "USD$" + USD + " is equal to CAD$"+value);
		
		System.exit(0);

	}

}
