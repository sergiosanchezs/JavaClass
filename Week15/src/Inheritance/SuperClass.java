/**
 * 
 */
package Inheritance;

/**
 * @author sergi
 *
 */
public class SuperClass {
	
	// Non-static
	String fName1;
	String lName1;
	
	// Static
	static String fName2;
	static String lName2;
	
	public void methodOne() {
		System.out.println("Non static method instance");
	}
	
	public static void methodTwo() {
		System.out.println("Static method inheritance");
	}
}
