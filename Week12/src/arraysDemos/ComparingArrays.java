/**
 * 
 */
package arraysDemos;

import java.util.Arrays;

/**
 * @author W10
 *
 */
public class ComparingArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//== is not used
		int[] firstArray1 = { 5, 10, 15, 20, 25 };
		int[] secondArray1 = { 5, 10, 15, 20, 25 };
		if (firstArray1 == secondArray1) // This is a mistake.
		   System.out.println("The arrays are the same.");
		else
		   System.out.println("The arrays are not the same.");

		//Compare two arrays with the equals method and array class
		int[] firstArray2 = { 5, 10, 15, 20, 25 };
		int[] secondArray2 = { 5, 10, 15, 20, 25 };
		if (Arrays.equals(firstArray2, secondArray2)) 
		   System.out.println("The arrays are the same.");
		else
		   System.out.println("The arrays are not the same.");

	}

}
