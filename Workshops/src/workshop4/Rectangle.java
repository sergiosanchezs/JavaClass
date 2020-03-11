/**
 * 
 */
package workshop4;

/**
 * @author sergi
 *
 */
public class Rectangle {

	private double width, length;
	/**
	 * 
	 */
	public Rectangle() {
		this(1,1);
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}

	public double getLenght() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public void setLenght(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	

}
