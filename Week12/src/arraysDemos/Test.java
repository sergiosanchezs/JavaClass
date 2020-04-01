/**
 * 
 */
package arraysDemos;

/**
 * @author W10
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//1. Print the length of the array
		String[] cellphone = {"samsung", "apple"};
		System.out.println(cellphone.length);
		
		//2. Print the length of the array
		int[] numbers = {10, 20};
		System.out.println(numbers.length);
		
		double[] accountBalance = {100.50, 88.25};
		
		//3. Print all the elements of the array
		for (int i = 0; i <accountBalance.length; i++)
		{
			System.out.print(accountBalance[i]+" ");
		}

		//4. for each loop/ enhanced loop
		char[] letters = {'A', 'B', 'C'};
		for(char i : letters)
			
		{
			System.out.println(i);
		}
		

	}

}
