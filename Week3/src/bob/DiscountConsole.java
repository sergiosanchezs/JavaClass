/**
 * 
 */
package bob;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author Sergio Sanchez
 *
 */
public class DiscountConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare values
		double price;
		
		// DecimalFormat Object
		DecimalFormat ft = new DecimalFormat("$###,###.##");
		
		// Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
		// Console input
		System.out.println("Enter the price: ");
		price = keyboard.nextDouble();
		
		// Calculations
		double discountPercent = 0.15;
		double discount = price * discountPercent;
		double discountPrice = price - discount;
		
		// Output
		System.out.println("The price is " + ft.format(price) + " you will receive a discount of "
				+ ft.format(discount) + " and the total price after discount is " + ft.format(discountPrice));
		
		keyboard.close();

	}

}
