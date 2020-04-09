/**
 * 
 */
package week13;

import java.util.ArrayList;

/**
 * @author sergi
 *
 */
public class WeekArrayList {
	
	public static void main(String[] args) {
		// Array List
		ArrayList<String> arrList = new ArrayList<String>(5); 
		
		// 1. Add five name to the list
		arrList.add("Bob");
		arrList.add("Bobby");
		arrList.add("Bill");
		arrList.add("Billy");
		arrList.add("Bam");
		
		// 2. Get the size of the list, and print it.
		int sz = arrList.size();
		System.out.println(sz);
		
		// 3. Get the value of the first element, and print it.
		arrList.get(0);
		
		// 4. Print the list Strings
		System.out.println(arrList);
		
		// 5. Remove Bam element from the list
		arrList.remove(4);
		
		// 6. Replace Billy with your name
		arrList.set(3, "Billy was removed from here");
		
		// 7. Print the list again as Strings
		System.out.println(arrList);
		
		// 8. Print all elements of the list
		for (String names : arrList)
			System.out.println(names + " ");
	}

}
