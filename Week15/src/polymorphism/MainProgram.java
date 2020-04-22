/**
 * 
 */
package polymorphism;

/**
 * @author sergi
 *
 */
public class MainProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SuperClass versionOne = new SuperClass();
		SuperClass versionTwo = new SubClassOne();
		SuperClass versionThree = new SubClassTwo();
		
		versionOne.methodOne();
		versionTwo.methodOne();
		versionThree.methodOne();
		

	}

}
