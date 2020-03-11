package workshop4;

// Overload
class Calculate {
	public static int Add(int a, int b) {
		return a+b;
	}
	public static int Add(int a, int b, int c) {
		return a+b+c;
	}
	public static double Add(double a, double b, double c) {
		return a+b+c;
	}
}

public class workshop {

	public static void main(String[] args) {
		
		Animal c = new Dog("wolfy");
		Animal cow = new Cow("milky");
		
		System.out.println(cow.speak());
		System.out.println(c.speak());
		
		
		Polymorph p = new Polymorph();
		p.m1();
	}

}
