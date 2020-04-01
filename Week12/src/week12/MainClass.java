/**
 * 
 */
package week12;

/**
 * @author Sergio Sanchez
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ClassOne obj1 = new ClassOne();
		
		System.out.println(obj1.name);
		
		obj1.name = "Bob";
		System.out.println(obj1.name);
		
		obj1.methodOne();

	}

}
