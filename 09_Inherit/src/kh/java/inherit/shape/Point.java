package kh.java.inherit.shape;

public class Point {

	private int x; //가로축 좌표   왼쪽가장자리 위가 0,0이다
	private int y; //세로축 좌효
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Object 클래스에 있는 toString()를 내입맛에 맞게 오버라이드함
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
