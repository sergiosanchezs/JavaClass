/**
 * 
 */
package testing;

/**
 * @author sergi
 *
 */
public class Class2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Class1 obj = new Class1();
//		
//		System.out.println((int)obj.c);
		int[] x = {23, 55, 83, 19};
		int[] y = {36, 78, 12, 24};
		for(int a = 0; a < x.length; a++)
		{
			x[a] = y[a];
			y[a] = x[a];
		}
		System.out.println("X");
		for (int i = 0; i < x.length; i++)
			System.out.println(x[i]);
		System.out.println("Y");
		for (int i = 0; i < y.length; i++)
			System.out.println(y[i]);
	}

}
