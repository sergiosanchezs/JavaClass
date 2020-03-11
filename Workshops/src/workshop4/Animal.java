/**
 * 
 */
package workshop4;

/**
 * @author sergi
 *
 */
public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public String speak() {
		return name + " says " + sound();
	}
	
	abstract String sound();
	
}

class Cow extends Animal{
	
	public Cow(String name) {
		super(name);
	}

	@Override
	String sound() {
		// TODO Auto-generated method stub
		return " moooo";
	}
	
}

class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}

	@Override
	String sound() {
		// TODO Auto-generated method stub
		return " wooof";
	}
	
}
