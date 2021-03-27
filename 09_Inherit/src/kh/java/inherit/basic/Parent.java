package kh.java.inherit.basic;

/**
 * 상속 Inheritance
 * 부모클래스가 가지고 있는 member변수/메소드를 자식클래스에서 선언하지않고 사용할 수 있게하는것
 * 부모클래스와 자식클래스는 일반화관계
 * 부모클래스────>자식클래스(구체화) , 자식클래스────>부모클래스(추상화) 
 * 추상화 - 클래스간의 공통점을 찾아내서 공통의 조상을 만드는 작업  
 * 구체화 - 상속을 통해 클래스를 구현, 확장하는 작업
 * 
 * 
 * - public class 자식클래스 extends 부모클래스{}
 * 이점
 * - 중복을 제거해서 효율적으로 코드를 관리할 수 있다
 * - 공통적인 코드를 부모클래스에서 관리할 수 있다
 * 
 * 특징
 * 1. 부모클래스 필드/메소드는 자식클래스에서 선언없이 접근가능
 * 2. 모든 클래스의 최상위 부모클래스는 Object
 *  - 아무 클래스도 상속하지 않았다면 extends Object가 생략된것
 *  - Object의 메소드를 모든 클래스에서 사용가능 (toString , hashCode, equals.....)
 * 3. 부모클래스의 생성자, 초기화블럭은 상속안됨
 *  - 부모클래스 생성자 호출 super()가 필요
 * 4. 부모클래스의 메소드는 자식클래스에서 재작성해서 쓸 수 있다
 * 5. 부모클래스의 private필드/메소드는 상속은 되지만 직접접근할 수 없다 
 *  - getter/setter를 이용
 *  - 값대입시에 부모생성자(super)를 호출해서 부모클래스안에서 값대입
 *
 *
 */

//public class Parent extends Object {
public class Parent {
	
	String name;
	int age;
	
	
	public Parent() {
		System.out.println("Parent 부모클래스 생성자 호출");
	}
	
	public void say() {
		System.out.println("제가 아버지입니다");
	}
	
	public void printInfo() {
		System.out.println(name + ", " + age);
	}

	
	
}
