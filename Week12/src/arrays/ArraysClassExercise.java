/**
 * 
 */
package arrays;

import java.util.Arrays;
/**
 * @author Sergio Sanchez
 *
 */
public class ArraysClassExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//1. Add five numbers to a fixed-length array of 5, through a user's input.
		separator();
		final int ARRAY_SIZE = 5;
		int[] numbers = new int[ARRAY_SIZE];
		numbers[0] = 15;
		numbers[1] = 12;
		numbers[2] = 9;
		numbers[3] = 6;
		numbers[4] = 3;
		
		for (int num : numbers)
			System.out.println(num);
		
		//2. Compare two arrays, any two of your choice.
		separator();
		int[] array1 = { 4, 8, 12, 16, 20 };
		int[] array2 = { 4, 8, 12, 16, 20 };
		
		if (Arrays.equals(array1, array2))
			System.out.println("The arrays are the same.");
		else
		   System.out.println("The arrays are not the same.");
		
		//3. Copy one array to another array.
		separator();
		int[] firstArray = {1, 1, 2, 3, 5, 8, 13, 21 };
		int[] secondArray = new int[8];
		for (int i = 0; i < firstArray.length; i++)
		  secondArray[i] = firstArray[i];
		
		System.out.println("Arrays copied!");
		for (int j = 0; j < firstArray.length; j++)
			System.out.println(firstArray[j] + " = " + secondArray[j]);

		//4. Print the last two elements of the array in Q#1 by using a method
		separator();
		for (int i = 3; i < ARRAY_SIZE; i++)
			printValue(numbers[i]);

	}
	
	public static void printValue(int num)
   {
      System.out.println(num);
   }
	
	public static void separator()
	{
		System.out.println("----------------------------------------");
	}

}
