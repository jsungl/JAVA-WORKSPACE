package kh.java.oop.student;


/**
 * class -> 객체(object(개념설명할때) , instance(메모리조각으로 설명할때))
 * 
 * 틀 , 설계도
 * 
 * 클래스를 프로그램의 지향하는 바에 따라 설계하는 것을 추상화라고 한다
 */
public class Student {
	//field : 학생객체의 속성(정적인 data), 클래스 영역에 작성, 기본적으로 field는 private으로 지정한다
	private String name; //학생이름
	private int point; //학생점수
	
	//method : 학생객체의 기능
	public void printStudentInfo() {
		//method에서는 field를 참조할수있다
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + point);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	public int getPoint() {
		return point;
	}
}
