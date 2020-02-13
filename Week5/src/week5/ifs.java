/**
 * 
 */
package week5;

/**
 * @author Sergio Sanchez
 *
 */
public class ifs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number1 = 32,
			number2 = 25;
		
		// if
		System.out.println("--------------------------------");
		System.out.println("The if Statement");
		if (number1 == 32)
			System.out.printf("The number %d is equal to 32", number1);
		System.out.println();
		
		// if else
		System.out.println("--------------------------------");
		System.out.println("The if-else Statements");
		if (number1 < 10)
			System.out.printf("The number %d is less than 10", number1);
		else
			System.out.printf("The number %d is greater than 10", number1);
		System.out.println();
		
		// if else if
		System.out.println("--------------------------------");
		System.out.println("The if-else-if Statements");
		if (number1 < 10)
			System.out.printf("The number %d is less than 10", number1);
		else if (number2 < 20)
			System.out.printf("The number %d is less than 20", number2);
		else
			System.out.printf("The numbers %d and %d are greater than 10 and 20 respectively", number1, number2);
		System.out.println();
		
		// nested if else
		System.out.println("--------------------------------");
		System.out.println("The nested if-else Statements");
		if (number1 > 10)
			if (number2 > 24)
				System.out.printf("Congratulations! The numbers %d and %d are greater "
								+ "than 10 and 24 respectively", number1, number2);
			else
				System.out.printf("The number %d is greater than 10 and the number %d is less "
						+ "than 24", number1, number2);
		else
			System.out.printf("The number %d is less than 10", number1);
		System.out.println();
		
		// switch
		System.out.println("--------------------------------");
		System.out.println("The switch Statement");
		char toEvaluate = 'D';
		switch(toEvaluate) {
			case 'A':
				System.out.println("The letter is A");
				break;
			case 'B':
				System.out.println("The letter is B");
				break;
			case 'C':
				System.out.println("The letter is C");
				break;
			default:
				System.out.println("This is default case");
				break;
		}
		

	}

}
