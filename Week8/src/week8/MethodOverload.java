/**
 * 
 */
package week8;

/**
 * @author Sergio Sanchez
 *
 */
public class MethodOverload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte a = 123;
		short b = 1230;
		int c = 12367;
		long d = 123456789;
		char ch = 'S';
		float f = 12.45f;
		double dou = 12.34;
		
		method(a);
		method(b);
		method(c);
		method(d);
		method(ch);
		method(f);
		method(dou);
	}
	/**
	 * 
	 * @param first receive a byte to print on the console
	 */
	public static void method(byte first) {
		System.out.println(first);
	}
	/**
	 * 
	 * @param first receive a short to print on the console
	 */
	public static void method(short first) {
		System.out.println(first);
	}
	/**
	 * 
	 * @param first receive a integer to print on the console
	 */
	public static void method(int first) {
		System.out.println(first);
	}
	/**
	 * 
	 * @param first receive a long to print on the console
	 */
	public static void method(long first) {
		System.out.println(first);
	}
	/**
	 * 
	 * @param first receive a char to print on the console
	 */
	public static void method(char first) {
		System.out.println(first);
	}
	
	/**
	 * 
	 * @param first receive a float to print on the console
	 */
	public static void method(float first) {
		System.out.println(first);
	}
	
	/**
	 * 
	 * @param first receive a double to print on the console
	 */
	public static void method(double first) {
		System.out.println(first);
	}


}
