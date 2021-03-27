package kh.java.loop;

/**
 * 
 * break : 반복문 블럭을 즉시 탈출(중지)
 * 
 * continue : 이하 코드를 실행하지않고 반복문시작으로 이동
 * 	-for문
 * 	-while문
 * 
 * 
 *
 */

public class BreakContinueTest {

	public static void main(String[] args) {
		
		BreakContinueTest b = new BreakContinueTest();
		//b.test1();
		//new BreakContinueTest().test1(); 객체변수이름 지정없이 바로 메소드호출해서 사용가능(위와 동일한 구문)
		//b.test2();
		b.test3();
		//b.test4();
	}
	
	public void test1() {
		int i = 1;
		while(true) {
			System.out.println(i);
			if(i++ == 100)
				break;
		}
		System.out.println("종료");
	}
	
	//11의 배수가 1000이 넘기 전까지만 출력
	public void test2() {
		final int num = 11;
		int i = 1;
		
		while(true) {
			if(num * i <= 1000) {
				System.out.println(num * i);
				i++;
			}else
				break;
		}
	}
	
	public void test3() {
		int i = 1;
		while(i <= 100) {
			i++;
			if(i % 2 != 0) 
				continue; //i가 홀수이면 반복문 시작으로 이동
			
			System.out.println(i);
		}
	}
	
	/*
	 * 아스키코드 범위에서 숫자와 영문자만 출력하기
	 * 단, continue를 무조건 사용해서 코드를 전개하세요
	 */
	public void test4() {
		
		int n = 0;
		while(n <= 127) { //아스키코드 범위는 0~127까지
			if((n >= 48 && n <= 57) || (n >= 65 && n <= 90) || (n >= 97 && n <= 122)) {  //0~9,A~Z,a~z
				System.out.println(n + " : " + (char)n); //문자로 변환하여 출력
				n++;
			}else {
				n++;
				continue;
			}
		}
	}
	
	
	
}
