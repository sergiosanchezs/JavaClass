/**
 * 
 */
package week9;

import com.sun.tools.sjavac.server.SysInfo;

/**
 * @author Sergio Sanchez
 *
 */
public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SecondClass obj1 = new SecondClass();
		
		obj1.firstMethod();
		
		System.out.println(obj1.secondMethod(12, 13));
		

	}

}
