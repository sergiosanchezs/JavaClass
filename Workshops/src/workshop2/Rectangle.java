/**
 * 
 */
package workshop2;

/**
 * @author Sergio Sanchez
 *
 */
public class Rectangle {
	
	private double width;
	private double lenght;
	
	public Rectangle(double width, double lenght) {
		this.width = width;
		this.lenght = lenght;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
	public double getArea() {
		return this.lenght * this.width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", lenght=" + lenght + ", Area=" + getArea() + "]";
	}
	
}
