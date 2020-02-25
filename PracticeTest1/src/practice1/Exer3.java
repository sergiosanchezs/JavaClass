/**
 * 
 */
package practice1;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author sergi
 *
 */
public class Exer3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double hours = 4120.4345;
		String str = "I'm a chain of characters";
		
		double p = 0.23412;
		
		DecimalFormat percent = new DecimalFormat("#0.00%");
		
		System.out.printf("I have worked %.2f hours\n", hours);
		System.out.printf("I have worked %,6.2f hours\n", hours);
		System.out.printf("%s \n", str);
		System.out.println(percent.format(p));
		
		String strFormat = String.format("I have worked %,6.2f hours\n", hours);
		System.out.printf(strFormat);
		JOptionPane.showMessageDialog(null, strFormat);
		
		System.exit(0);
		
	}

}
