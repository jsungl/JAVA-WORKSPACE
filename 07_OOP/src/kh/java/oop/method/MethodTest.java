package kh.java.oop.method;

/**
 * 
 * static method : 클래스명.메소드명 호출
 * static 자원(field,method)만 접근 가능
 * 
 * non - static method : 객체.메소드명 호출
 * non-static, static자원 모두 접근 가능
 * 
 * 
 *
 */

public class MethodTest {
	
	private int num = 100;
	private static int snum = 99;
	
	
	
	public static void main(String[] args) {
		//MethodTest.a();	클래스명.메소드명 호출
		//new MethodTest().b();	객체.메소드명 호출
		
		System.out.println(MyUtil.add(100, 7));
		System.out.println(MyUtil.add(80, 3));
	}

	//클래스 메소드,static 메소드
	public static void a() {
		System.out.println("a");
		//System.out.println(num); non-static 변수 참조불가능
		System.out.println(snum);
		//b(); non-static 메소드 참조불가능
	}
	
	//멤버 메소드,instance 메소드
	public void b() {
		System.out.println("b");
		System.out.println(num);
		System.out.println(snum); //static변수 참조가능
		a(); //static메소드 참조 가능
	}
}
