/**
 * 
 */
package arraysDemos;

/**
 * @author W10
 *
 */
public class T2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		//1. Simple array which holds four elements 
		// from 0,1,2,3
		
		int first[] = new int [4];
		
		//2.Assign values for four elements
		
		first[0]=10;
		first[1]=10;
		first[2]=10;
		first[3]=10;
			 
		//2.1 Assign values for four elements
		// Position 4 is not accessible since our array starts from 0
		first[1]=10;
		first[2]=10;
		first[3]=10;
		//first[4]=10;
		
		//3. Create a array and init values
		
		//Print one element of the array
		int second[]= {99,20,30,40,50};
		System.out.println(first[0]);
		
		//Print all elements of the array
		
		for (int i :second)
		{
			System.out.println(i);
		}
		
		
		
		
	}

}
