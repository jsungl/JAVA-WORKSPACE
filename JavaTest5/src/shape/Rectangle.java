package shape;

public class Rectangle extends Shape implements Resize {

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height, String color) {
		super(width, height, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return getWidth() * getHeight();
	}
	
	@Override
	public void setResize(int size) {
		setWidth(getWidth() + size);
	}

	@Override
	public String toString() {
		return "Rectangle\t" + getArea() + "\t" + getColor();
	}
	
	
	
}
