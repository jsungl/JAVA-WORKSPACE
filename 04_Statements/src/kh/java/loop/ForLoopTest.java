package kh.java.loop;

import java.util.Scanner;

/**
 * for(초기식;조건식;증감식){
 * 		//반복 실행할 코드
 * }
 * 
 * - 초기식 : for문이 시작하면서 단한번 실행 ,증감변수 선언
 * - 조건식 : true면 반복문 1회 실행, false면 반복문 중지
 * - 증감식 : 증감변수 처리식(증가/감소)
 *
 * 처리순서
 * 1.초기식
 * 2.조건식
 * 3.반복 실행 코드 -> true(false면 빠져나온다)
 * 4.증감식 -> 2.조건식으로
 * 
 */

public class ForLoopTest {

	public static void main(String[] args) {

		ForLoopTest f = new ForLoopTest();
		//f.test1();
		//f.test2();
		//f.test3();
		f.test4();
	}
	
	public void test1() {
		
		for(int i=1;i<=10;i++) {
			System.out.println("hello world");
		}
		
	}
	/*
	 * 실습문제
	 * 사용자에게 이름을 입력받고 숫자를 입력받아서 해당이름을 해당횟수만큼 반복출력하세요
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String s = sc.next();
		System.out.print("숫자 : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println(s);
		}	
	}
	
	/*
	 * 1 ~ 10까지 합계구하기
	 * 1 + 2 + 3 + ... + 10
	 */
	public void test3() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i; 
		}
	}
	
	
	public void test4() {
		for(int i = 1;i <= 10; i++) {
			System.out.print(i != 10 ? i + "," : i + " ");
		}
	}

}
