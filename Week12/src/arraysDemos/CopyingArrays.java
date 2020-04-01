/**
 * 
 */
package arraysDemos;

/**
 * @author W10
 *
 */
public class CopyingArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int[] firstArray = {5, 10, 15, 20, 25 };
		int[] secondArray = new int[5];
		for (int i = 0; i < firstArray.length; i++)
		  secondArray[i] = firstArray[i];

		
		for(int a : firstArray )
			
		{
			System.out.println(a);
		}
		
		for(int b : secondArray )
			
		{
			System.out.println(b);
		}
		
	}

}
