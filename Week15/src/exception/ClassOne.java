/**
 * 
 */
package exception;

/**
 * @author Sergio Sanchez
 *
 */
public class ClassOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arrayOne = new int[2];
		try {
			arrayOne[0] = 1;
			arrayOne[1] = 1;
			arrayOne[2] = 1;			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid");
		}

	}

}
