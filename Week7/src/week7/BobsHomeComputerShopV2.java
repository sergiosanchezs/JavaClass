/**
 * 
 */
package week7;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Sergio Sanchez
 * %$2N
 */
public class BobsHomeComputerShopV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double	totalSales = 0.0,
				commissionRate = 0.0,
				advancePay = 0.0,
				moneyAdollarerAdvancePay = 0.0,
				commissionSales = 0.0;
		
		DecimalFormat dollar = new DecimalFormat("$##,##0.00");
		DecimalFormat percent = new DecimalFormat("#0%");
		
		totalSales = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount of monthly sales."));
		
		if (totalSales < 10000) {
			commissionRate = 0.05;
		}
		else if (totalSales >= 10000 && totalSales <= 14999) {
			commissionRate = 0.10;
		}
		else if (totalSales >= 15000 && totalSales <= 17999) {
			commissionRate = 0.12;
		}
		else if (totalSales >= 18000 && totalSales <= 21999) {
			commissionRate = 0.15;
		}
		else if (totalSales >= 22000) {
			commissionRate = 0.16;
		}
		
		commissionSales = commissionRate * totalSales;
		
		do {
			
			if (advancePay < 0 || advancePay > 1500) {
				System.out.println("AdvancePay: " + advancePay);
				JOptionPane.showMessageDialog(null, "Your advance pay should be between 0 and 1500");
			}
			
			advancePay = Double.parseDouble(JOptionPane.showInputDialog("Please enter the advance payment you want."));
			
		} while (advancePay > 1500);
		
		moneyAdollarerAdvancePay = commissionSales - advancePay;
		
		if (advancePay > 0) 
			JOptionPane.showMessageDialog(null, "You had an advance pay this month! " +
					"Commission is " + percent.format(commissionRate) + ".\n" +
					"Then, your commission sales adollarer the Advance Payment is " + dollar.format(moneyAdollarerAdvancePay) );
		else
			JOptionPane.showMessageDialog(null, "Congratulations! You didn't get an advance pay this month \n" +
				"Then, your commission sales is " + dollar.format(moneyAdollarerAdvancePay) );

	}

}
