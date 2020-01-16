/**
 * 
 */
package week2;

/**
 * @author Sergio Sanchez
 *
 */
public class DiscountCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare values
		double price = 2500;
		double discountPercent = 0.15;
		double discount = price * discountPercent;
		double discountPrice = price - discount;
		// Output
		System.out.println("The price is $" + price + " you will receive a discount of $"
				+ discount + " and the total price after discount is $" + discountPrice);

	}

}
