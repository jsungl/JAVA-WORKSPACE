package kh.java.inherit.shape;

/**
 * 
 * Circle has a Point : has a 포함관계(연관관계) 
 * Circle이 Point변수를 가지고 있으므로(ex.StudentManager가 StudentVO객체배열을 가지고 있어서 has a 관계)
 * Circle ────────> Point
 * 
 * Circle is a Shape : is a 상속관계(일반화 관계)
 * Circle ────────────▷Shape
 *
 */


public class Circle extends Shape{

	private Point center; //원의 중심
	private int r; //반지름
	public Circle() {
		//아무런 필드 대입이 없다면 기본값 중심(100,100),반지름 100 으로 세팅한다
		this.center = new Point(100,100); 
		this.r = 100;
	}
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	/*Override
	* 1. 메소드명, 파라미터선언부, 리턴타입 모두 동일해야한다
	* 	- @Override annotation --> 잘못오버라이드하면 컴파일 오류해서 알려주는 기능(안전장치)
	* 2. 접근제한자는 더 넓은 범위로 수정이 가능
	* 	- private - default - (protected - public)
	* 	- 거의 protected - public만 한다
	* 3. 메소드가 던지는 예외클래스는 줄이거나 자식클래스로 변경가능
	*/
	
	@Override
	public void draw() {
//		System.out.println("중심점이 (" + center.getX() + ", " + center.getY() 
//							+ ")이고, 반지름이 " + r + "인 원을 그리고 있다.");
		System.out.println("중심점이 " + center + "이고, 반지름이 " + r + "인 원을 그리고 있다.");
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	
}
