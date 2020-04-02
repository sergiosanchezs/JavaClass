/**
 * 
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;
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
		Scanner keyboard = new Scanner(System.in);
		final int ARRAY_SIZE = 5;
		int[] numbers = new int[ARRAY_SIZE];
		
		System.out.println("Enter five numbers to be stored.");
		
		for (int idx = 0; idx < ARRAY_SIZE; idx++)
        {
			System.out.print("Number " + (idx + 1) + ": ");
			numbers[idx] = keyboard.nextInt();
        }
		
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
		for (int i = ARRAY_SIZE - 2; i < ARRAY_SIZE; i++)
		{
			System.out.print("number in position " + (i+1) + " is ");
			printValue(numbers[i]);
		}

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
