package kh.java.api.wrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * WrapperClass
 * 기본형에 대응하는 참조형 클래스
 * java.lang패키지에 존재
 * 기본형(값)을 감싼 형태이기떄문에 wrapper라고 부른다
 * 
 * 1. 기본형을 참조형으로 사용해야할때
 * 2. 기본형관련된 메소드 혹은 상수를 사용할때
 *
 */



public class WrapperClassTest {

	public static void main(String[] args) {
		
		WrapperClassTest wct = new WrapperClassTest();
		//wct.test1();
		wct.test2();
		
	}
	
	/*
	 * boolean - Boolean
	 * byte - Byte
	 * char - Character
	 * short - Short
	 * int - Integer
	 * long - Long
	 * float - Float
	 * double - Double
	 * 
	 */
	public void test1() {
		
		int num = 100; //기본형
		Integer i = new Integer(100); //참조형

		//auto-boxing : 기본형 -> Wrapper
		
		//auto-unboxing : Wrapper -> 기본형
		

		System.out.println(num + i); //200,intValue()가 자동으로 호출
		System.out.println(num + i.intValue()); //auto-unboxing
		
		Integer j = 3; //기본형을 Integer변수 j에 대입, 이래와 같은 구문
//		Integer j = new Integer(3); //auto-boxing
		
		System.out.println(j == 3); //객체와 값비교,아래와 같은 구문
		System.out.println(j.intValue() == 3); 

		//기본형이 아닌 참조형만 써야하는 경우
		//Generics
//		List<int> list = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
	}
	
	
	/*
	 * WrapperClass는 형변환 static메소드 지원
	 * 문자열 데이터를 각각의 타입으로 변환
	 */
	public void test2() {
		int i = Integer.parseInt("100"); //"100" -> 100
		System.out.println(i * 100);
		
		double d = Double.parseDouble("123.456"); //"123.456" -> 123.456
		System.out.println(d * 100);
		
		boolean b = Boolean.parseBoolean("true"); //"true" -> true
		System.out.println(!b);
		
		char ch = "abc".charAt(0); //"a"
		System.out.println((int)ch);
	}
}
