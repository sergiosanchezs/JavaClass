/**
 * 
 */
package week9Class;

/**
 * @author Sergio Sanchez
 *
 */
public class FirstClass extends SecondClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Created a object to access the fields and methods
		SecondClass obj1 = new SecondClass();
		
		// Assign values
		obj1.name = "Bob";
		obj1.age = 100;
		obj1.money = 50.50;
		obj1.grade = 'A';
		
		// Declare new variables
//		String	 a = obj1.name = "Bobby";
//		int		 b = obj1.age = 102;
//		double	 c = obj1.money = 51.50;
//		char	 d = obj1.grade = 'B';
		
		// Print
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.money);
		System.out.println(obj1.grade);

		// Call Methods
		obj1.firstMethod();
		int number = obj1.secondMethod(12, 13);
		System.out.println(number);
		
	}

}
