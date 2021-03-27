package kh.java.inherit.shape;

import java.util.Arrays;

public class Rectangle extends Shape{

	//Point[] points, int width, int height
	
	private Point[] points = new Point[4]; //0번지-leftTop, 1번지-rightTop, 2번지-rightBottom, 3번지-leftBottom
	private int width;
	private int height;
	public Rectangle() {
		
	}
	
	public Rectangle(Point[] points, int width, int height) {
		super();
		this.points = points;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println("네 꼭지점이 " + points[0] + ", " + points[1] + ", " + points[2] + ", " + points[3] + "이고, "
							+ "너비가 " + width + ", 높이가 " + height + "인 사각형을 그린다.");
	}
	
	@Override
	public double getArea() {
		return width * height * 1.0;
	}
	
	@Override
	public String toString() {
		
		return "points = " + Arrays.toString(points) + ", width = " + width + ", height = " + height;
	}

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}

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
	
	
	
}
