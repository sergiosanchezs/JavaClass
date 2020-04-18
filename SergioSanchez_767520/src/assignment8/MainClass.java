/**
 * 
 */
package assignment8;

/**
 * This program calculate the feels like temperature, 
 * based upon the day, temperature & wind speed data on
 * the Temperature class.
 * 
 * This is the Class1 = MainClass.
 * This is the Class2 = Temperature.
 * 
 * @author Sergio Sanchez
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Temperature obj1 = new Temperature();	// Creating the object
		
		/* calling the method that perform the operation to request data from
		 * input and  tell him the feels like temperature.
		 */
		obj1.getDataFromUser();	

	}

}
