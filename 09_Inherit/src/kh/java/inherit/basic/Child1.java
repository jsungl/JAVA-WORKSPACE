package kh.java.inherit.basic;

public class Child1 extends Parent{

	public Child1() {
		//super(); 부모생성자를 호출(생략해도 자동으로 호출) -----> 부모생성자는 상속이안된다
		//무조건 맨첫줄에 작성되어야한다
		//this와 동시 사용불가
		System.out.println("Child1 생성자 호출");
		
	}
	
	/*
	 * Method Overriding(메소드 재작성)
	 */
	public void say() {
		System.out.println("제가 아들입니다");
	}
	
	/*
	 * 기능추가(Parent클래스에는 없는 메소드)
	 */
	public void game() {
		System.out.println("아들이 게임중");
	}
}
