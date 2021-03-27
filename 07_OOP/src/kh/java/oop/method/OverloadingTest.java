package kh.java.oop.method;

/**
 * 
 * Method Overloading
 * 메소드명은 직관적으로 작성할것
 * 동사(+명사)
 * - setUserName
 * - getUserName
 * - printInfo
 * 
 * 메소드명은 동일해야한다
 * 매개변수 선언부는 달라야한다 -> 타입,개수,순서
 * 매개변수명, 접근제한자, 리턴타입은 상관하지 않는다
 * 
 */



public class OverloadingTest {

	public static void main(String[] args) {
		
	}
	
	public void test() {
		
	}
	public void test(int i) {
		
	}
	public void test(char ch) {
		
	}
	public void test(int a,int b) {
		
	}
/*
	//매개변수명이 다른것은 오버로딩이 아니다
	public void test(int b,int a) {}
	//리턴타입이 다른것은 오버로딩이 아니다
	public String test(String s) {}
	//접근제한자가 다른것은 오버로딩이 아니다
	private void test(String s) {}
*/
}
