package com.kh.print;

public class PrintTest {
	
	
	public static void main(String[] args) {
		
		PrintTest p = new PrintTest();
		//p.test1();
		p.test2();
		//p.test3();
		
	}
	/*
	 * 문자열더하기 연산
	 * 1. 문자열 + 문자열 => 문자열
	 * 2. 문자열 + 숫자 => 문자열
	 * 3. 숫자 + 숫자 => 숫자
	 * 
	 */
	
	public void test3() {
		
		System.out.println("123" + 4);
		System.out.println(12 + "34" + 56);
		System.out.println(12 + 34 + "56");
		System.out.println("12" + 3 * 7);
	}
	
	public void test2() {
		System.out.println("\tShakeIT 알람 \n" + "--------------------------\n" + 
	"  흔들기   쏴리질러   터치하기  원터치  \n" + "--------------------------\n");
	
		System.out.println("홍길동\n\t" + "\"신사임당\" \n\t\t" + "세종대왕\\\"\\\'\\/");
	}
	
	/*
	 * escape 문자
	 * (\ + 특정문자)
	 * 
	 * \n 개행문자(윈도우 \r\n)
	 * \t 탭
	 * 
	 * \\ \(역슬래시) 출력
	 * \" \"(쌍따옴표) 출력
	 */
	
	public void test1() {
		System.out.println("안녕");
		System.out.print("하");
		System.out.print("하");
		System.out.print("하");
		
		//C:\dev\eclipse\eclipse.exe
		//윈도우 디렉토리 구분자는 역슬래시를 사용한다
		System.out.print("C:\\dev\\eclipse\\eclipse.exe");
		System.out.println("C:/dev/eclipse/eclipse.exe"); //그냥 슬래시도 가능
		
	}
}
