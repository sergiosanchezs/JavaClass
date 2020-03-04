/**
 * 
 */
package practice1;

/**
 * @author Sergio Sanchez
 *
 */
public class Test1Practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		test1();
		int g = 3;
//        System.out.print(++g * 8);
        
        String str1 = "Bob";
        str1 = "Bobby";
        g = 5;
        g = 6;
        
        String name = "Sergio";
        
//        showLength(name);
//        
//        System.out.println(name);
        
        switchTesting();
        
	}
	
	public static void switchTesting() {
		int a = 3;
		switch (a){
		default:
			System.out.println("d");
		case 1:
			System.out.println("a");
		case 2:
		case 3:
			System.out.println("c");
			break;
		}
	}
	
	public static void showLength(String str)
	{
		System.out.println(str + " is " + str.length() + " characters long.");
		str = "Joe"; // see next slide
	}

	
	private static void test1() {
		 double a, b,c;
         a = 3.0/0;
         b = 0/4.0;
         c = 0.0/0.0;

         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
	}

}
