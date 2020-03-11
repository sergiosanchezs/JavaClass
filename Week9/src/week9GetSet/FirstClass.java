/**
 * 
 */
package week9GetSet;

/**
 * @author Sergio Sanchez
 *
 */
public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Created a object to access the fields and methods
		SecondClass obj1 = new SecondClass();
		
		// Output
		obj1.setName("Bob");
		System.out.println(obj1.getName());
		
		obj1.setAge(100);
		System.out.println(obj1.getAge());
		
		obj1.setMoney(50.50);
		System.out.println(obj1.getMoney());
		
		obj1.setGrade('A');
		System.out.println(obj1.getGrade());

	}

}
