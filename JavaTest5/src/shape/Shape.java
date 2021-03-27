package shape;

public abstract class Shape {

	private int width;
	private int height;
	private String color;
	
	public Shape() {
		
	}
	
	public Shape(int width, int height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public abstract double getArea(); //도형의 넓이를 리턴

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
