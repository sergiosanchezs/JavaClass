/**
 * 
 */
package workshop2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Sergio Sanchez
 *
 */
public class Workshop2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1) Defensive programming and validation loop!
		// 2) Array, ArrayList, LinkList
		// 3) DataBase Connectivity
		
		/*
		* input ----> process ----> output
		* Garbage in/out
		* validation loop ---> if you have a right type 
		* of input but its out of range.
		* Defensive programming ---> if the user give you
		* the wrong sort of input! Five
		*/
		
		// a number from the user and keep adding them up until
		// there have no more numbers. (0 - 100) # Five
		
//		int num, sum = 0;
//		char answer = 0;
//		
//		while(true) {
//			
//			try {
//				System.out.println("Please Enter a number between 0 to 100: ");
//				Scanner keyboard = new Scanner(System.in);
//				num = keyboard.nextInt();
//				if (num > 100 || num < 0) {
//					System.out.println("Input is out of range!");
//				} else {
//					sum += num;
//					System.out.println("Type no if you have no other number: ");
//					answer = keyboard.nextLine().charAt(0);
//					
//					if (answer != 'n' || answer != 'N') {
//						System.out.println("The sum is " + sum);
//						System.out.println("Thanks for using the program!");
//						break;
//					} 
//				}
//			} catch(Exception e) {
//				System.out.println("wrong type of input");
//			} 
//			
//		}
//		System.out.println("The sum is " + sum);
		
		//========== Data Collection ==============
//		int [] arr = new int[5];
//		arr[0] = 5;
//		
////		System.out.println(arr); // address
//		
//		// --------- Normal loop ------------
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("arr["+i+"]="+arr[i]);
//		}
//		
//		// --------- Enhanced loop ------------
//		for (int number : arr) {
//			System.out.println(number);
//		}
//
//		
//		Rectangle rec1 = new Rectangle(3, 4);
//		System.out.println(rec1);
//		// toString() is a method that includes
//		// in any classes!
//		System.out.println(rec1.toString());
//		
//		Rectangle [] recArr = new Rectangle[5];
//		
//		for (int i = 0; i < recArr.length; i++) {
//			recArr[i] = new Rectangle(i, i+2);
//		}
//		
//		for (Rectangle rectangle : recArr) {
//			System.out.println(rectangle);
//		}
		
		// ========== ArrayList ======= LinkList ===========
		// First its dynamic! by default it holds 10 memory location
		// ArrayList can only hold objects!
		ArrayList<Rectangle> recArraList = new ArrayList<Rectangle> ();
		ArrayList<String> stringArrayList = new ArrayList<String> ();
		ArrayList<Double> floatArrayList = new ArrayList<Double> ();
		
		floatArrayList.add(3.45);
		floatArrayList.add(13.45);
		floatArrayList.add(32.45);
		
		System.out.println(floatArrayList);
		System.out.println(floatArrayList.get(0));
		floatArrayList.add(2, 11.11);
		System.out.println(floatArrayList);
		System.out.println(floatArrayList.size());	// getting the size
		floatArrayList.remove(3);	// removing by index
		System.out.println(floatArrayList);
		
		
		// Search for vector and LinkList
		
	}

}
