package kh.java.type;

/**
 * 
 * 컴퓨터 작동원리
 * 1. 같은 자료형끼리 연산할 수 있다.
 * 2. 연산결과 역시 동일한 자료형이다.
 * 3. 같은 자료형의 변수에만 대입할 수 있다.
 * 
 * 위에 조건을 만족하기 위해서 암묵적/명시적 형변환이 필요하다.
 * 암묵적 : 자동으로 처리
 * 명시적 : 형변환 필요
 *
 */

public class CastingTest {

	public static void main(String[] args) {
		
		CastingTest c = new CastingTest();
		//c.test1();
		c.test2();
		//c.test3();
		//c.test4();
		//c.test5();
	}
	
	/*
	 * 자동 형변환
	 *  - 크기가 작은 타입에서 큰 타입으로 변환은 자동으로 처리
	 *  - 정수에서 실수로의 변환은 자동으로 처리
	 *  - byte -> short -> int -> long -> float -> double
	 *  		  char	
	 */
	
	public void test1() {
		
		int num = 300;
		long lnum = num; //int -> long으로 변환
		System.out.println(lnum); 
		
		int a = 3;
		double b = 1.5;
		System.out.println(a + b); //int + double -> double + double로 변환
		
		int c = 'a'; //char -> int로 변환
		System.out.println(c);
		System.out.println('c' + 1); //char + int -> int + int로 변환
		
	}
	
	/*
	 * 
	 * 명시적 형변환
	 * 1. 크기가 작은 타입으로 형변환 - 데이터 손실
	 * 2. 크기가 큰 타입으로 형변환
	 * 
	 */
	public void test2() {
		//데이터 손실이 있는 경우
		int num = (int)3.7; //double -> int로 변환 소수점이하를 날린다(데이터 손실) 
		System.out.println(num);
		
		//데이터 손실없이 큰 타입으로 변환하는 경우
		int a = 10;
		int b = 4;
		System.out.println((double)a / b); //int / int -> double(int) / int -> double / double로 변환
		System.out.println(a * 1.0 / b); //위와 비슷한 변환
		
		
		int i = Integer.MAX_VALUE;
		System.out.println((long)i + 1); //int의 범위를 넘어선 값을 출력하고싶을때
		//System.out.println(i + 1L);
	}
	
	
	/*
	 * 형변환 유의사항
	 * - byte, short, char 타입은 연산시 자동으로 int(정수 기본형)으로 변환되서 처리
	 * 
	 * 
	 */
	public void test3() {
		
		byte b1 = 20;
		byte b2 = 30;
		byte result = (byte)(b1 + b2); //위에 대입연산시 자동으로 int로 변환되기때문에 연산결과를 byte로 변환해야지 result변수에 넣을수있다
		System.out.println(result);
		
		
		boolean bool = 'a' > (b1 + b2); //char > (byte + byte) -> char > (int + int) -> int > int
		System.out.println(bool);
		
		char ch = 65; //char의 범위안에 숫자일경우 int -> char로 변환가능
		System.out.println(ch);
		
		ch = '\ud734'; //유니코드
		System.out.println(ch);
		
	}
	
	/*
	 * String
	 * - 참조형(객체 만들어 사용)
	 * - 기본형처럼 사용가능(리터럴을 대입하는 형태)
	 * 
	 */
	public void test4() {
		String name = "홍길동";
		String name2 = new String("홍길동"); //위와 같은 연산
		System.out.println(name2 + "만세"); //더하기 연산
		
		//char
		System.out.println(name + 'a'); //누구랑 연산하냐에 따라 결과값이 달라짐
		System.out.println(123 + 'a');
		System.out.println("abc" + 'z' + 123);
		System.out.println(123 + 'z' + "abc");
	}
	
	public void test5() {
		//char c = '1';
		//System.out.println(123 + c);
		
		String str = "Hello World";
		System.out.printf("%s%n",str);
		double b = 8.5321;
		System.out.printf("%f%n",b); //소수점 6자리 출력,7번째자리에서 반올림
		System.out.printf("%.3f%n",b); //소수점 3자리만 출력
		
		int num = 10;
		System.out.print("num = " + num + "\n");
		
	}
	
	/*
	 * 
	 * print문
	 * 
	 * int num = 10;
	 * System.out.print("num = " + num); -> num = 10
	 * 자동 줄바꿈이 안되므로 \n을 사용한다
	 * System.out.print("num = " + num + "\n");
	 * 
	 *
	 * printf문
	 * 
	 * %b	-	boolean형식으로 출력
	 * %d	-	10진수 정수로 출력
	 * %o	-	8진수 정수로 추력
	 * %x	-	16진수 정수로 출력
	 * %f	-	소수점 형식으로 출력
	 * %e	-	지수표현식 형식으로 출력
	 * %c	-	문자로 출력
	 * %s	-	문자열로 출력
	 * %n	-	줄바꿈
	 * 
	 * 
	 */

}
