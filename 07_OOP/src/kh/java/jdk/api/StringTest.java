package kh.java.jdk.api;

/**
 * 동등비교 연산자
 * 1. 기본형의 값비교
 * 2. 참조형의 주소값 비교
 * 		-true 같은 객체를 가리키고 있다
 * 		-false 다른 객체를 가리키고 있다
 * 
 * String 참조형
 * String의 값비교는 equals를 사용해야한다
 * 1.기본형
 * 2.참조형
 *
 */



public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTest s1 = new StringTest();
		StringTest s2 = s1;
		System.out.println(s1 == s2); //true
		
		s2 = new StringTest();
		System.out.println(s1 == s2); //false
		
		//문자열 비교
		String ss1 = "java";
		String ss2 = new String("java");
		
		System.out.println(ss1 == ss2); //false : 주소값비교
		System.out.println(ss1.equals(ss2)); //true : 내용비교
		
		//test(null);
		
	}
	
	public static void test(String str) {
		//  || 좌항이 true면 우항은 검사안함(효율적)
		//  | 좌항우항 모두 검사(비효율적)
		System.out.println(str);
		if(str == null | str.length() == 0) { //null값이 들어오면 우항 호출자체가 오류
			System.out.println("String is empty");
		 }else {
			System.out.println("String is not empty");
		 }
	}

}
