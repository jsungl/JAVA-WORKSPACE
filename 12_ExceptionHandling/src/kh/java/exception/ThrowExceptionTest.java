package kh.java.exception;

import java.util.Scanner;

public class ThrowExceptionTest {

	public static void main(String[] args) {

		ThrowExceptionTest t = new ThrowExceptionTest();
		//t.test1();
		t.test2();
		System.out.println("----------정상종료--------");
	}
	
	
	/*
	 * 성인인증해야 가능한 게임
	 * 1. 성인인증
	 * 2. 게임시작
	 */
	public void test1() { //if문을 통한 흐름분기
		
		boolean isAdult = checkAge();
		
		if(!isAdult) {
			System.out.println("성인이 아닙니다. 게임을 종료합니다");
			return;
		}
		
		System.out.println("성인 고스톱 게임을 시작합니다 후방주의");
	}
	
	public boolean checkAge() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if(age >= 20)
			return true;
		else
			return false;
	}
	
	
	/*
	 * 예외를 통한 프로그램 흐름 분기
	 */
	public void test2() {
		try {
			checkAgeAndThrowException(); //예외처리를 안하면 비정상종료된다
		}catch(Exception e) {
			System.out.println(e.getMessage()); //RuntimeException을 던질때 포함한 예외메시지를 출력
			return;
		}
		System.out.println("성인 고스톱 게임을 시작합니다 후방주의");
	}
	//나이를 입력받고 미성년자인 경우에는 예외를 던지는 메소드
	public void checkAgeAndThrowException() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
//		if(age < 20)
//			throw new UnderAgeException(String.valueOf(age));
		
		
		if(age < 20)
			throw new RuntimeException("미성년자 : " + age); //예외메시지 포함
		
		
	/*	
		if(age < 20)
			throw new Exception("미성년자 : " + age); //checked예외를 던질때(RuntimeException은 unchecked예외, 예외처리안해도 에러가 안남)
		---------> public void checkAgeAndThrowException() throws Exception { 로 바꾼후
		---------> 호출한 test2()에서 checkAgeAndThrowException()을 무조건 try-catch로 예외처리해줘야한다(예외처리 강제화)
		
		제일좋은것은 Exception class을 직접 만들어서 처리  : customExceptionClass -> UnderAgeException
	*/
	}

}
