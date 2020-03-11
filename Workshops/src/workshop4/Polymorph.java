/**
 * 
 */
package workshop4;

/**
 * @author sergi
 *
 *
 */
class parentClass{
	public void m1() {
		System.out.println("I am in parent class");
	}
}

interface I1 {
	int a=4;
	void m1();
}

interface I2 {
	int b=5;
	void m1(int a);
}

public class Polymorph extends parentClass implements I1, I2 {
	@Override
	public void m1() {
		super.m1();
		System.out.println("I am in the child class");
	}

	@Override
	public void m1(int a) {
		// TODO Auto-generated method stub
		
	}
}
