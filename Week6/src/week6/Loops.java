/**
 * 
 */
package week6;

/**
 * @author Sergio Sanchez
 *
 */
public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Examples of each loop
		boolean bob = true;
		boolean today = true;
		int age = 1;
		int number = 0;
		// while
		System.out.println("------------------------------------");
		System.out.println("--- While Loop - Boolean & Break ---");
		
		while(bob) 
		{
			System.out.println("Bob is " + age + " years old");
			age++;
			
			if (age >= 6) {
				break;
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("------- While Loop - Numbers -------");
		
		while (number != 100) 
		{
			System.out.println("The number is " + number);
			number++;
		}
		
		// do while
		System.out.println("------------------------------------");
		System.out.println("----- Do While Loop - Continue -----");
		System.out.println("------- Skipping number 102 --------");

		do
		{
			if (number == 102) {
				number++;
				continue;
			}
			
			System.out.println("The number is "+ number);
			number++;
			
		} while(number <= 105);
		
		System.out.println("------------------------------------");
		System.out.println("----- Do While Loop - Boolean ------");

		do
		{			
			System.out.println("Today is True");
			System.out.println("Today is True");
			today = false;
			
			
		} while(today);
		System.out.println("Today is now False, outside of the loop.");
		
		// for
		System.out.println("------------------------------------");
		System.out.println("-------------- For -----------------");
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("The number is "+ i);
		}
		
		// nested for loop
		System.out.println("------------------------------------");
		System.out.println("----------- Nested For -------------");
		for (int i = 0; i <= 5; i++) {
			System.out.println("out");
			for (int j = 0; j <= 5; j++) {
				System.out.println("in");
			}
		}

	}

}
