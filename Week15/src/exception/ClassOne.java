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
//			arrayOne[2] = 1;
			throw new ArrayIndexOutOfBoundsException("problems with subscripts");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2 is invalid: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Try again");
		} finally {
			System.out.println("Always runing");
		}

	}

}
