package workshop4;

public class Cuboid extends Rectangle {
	double height;

	public Cuboid(double width, double length, double height) {
		super(width, length);
		this.height = height;
	}
	
	public Cuboid() {
		this.height = 1;
	}
}
