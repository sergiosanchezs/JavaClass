/**
 * 
 */
package Inheritance;

/**
 * @author sergi
 *
 */
public class SubClass extends SuperClass{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Instance
		SuperClass obj1 = new SuperClass();
		obj1.fName1 = "Sergio";
		obj1.lName1 = "Sanchez";
		obj1.methodOne();
		System.out.println(obj1.fName1 + " " + obj1.lName1);
		
		// Inheritance
		fName2 = "Sergio";
		lName2 = "Sanchez";
		methodTwo();
		System.out.println(fName2  + " " + lName2);
	}
	
	public static void methodTwo() {
		System.out.println("Only this one will run");
	}

}
