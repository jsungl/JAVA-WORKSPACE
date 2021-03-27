package kh.java.oop.student;

public class StudentMain {

	public static void main(String[] args) {
		//학생 클래스를 new연산자를 이용하여 객체로 생성
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setPoint(90);
		//s1.printStudentInfo();
		System.out.println("이름 : " + s1.getName() + "\n점수 : " + s1.getPoint());
		
		
		Student s2 = new Student();
		s2.setName("신사임당");
		s2.setPoint(87);
		//s1.printStudentInfo();
		System.out.println("이름 : " + s2.getName() + "\n점수 : " + s2.getPoint());
	}

}
