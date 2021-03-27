package kh.java.type;

/**
 * 
 * 자료형 Data Type
 * 
 * 1. 기본형 Primitive Type(원시형)
 * 	- 값(literal)을 저장
 * 	- 8가지 : 문자형(char),논리형(boolean),정수형(byte,short,int,long),실수형(float,double)
 * 
 * 2. 참조형 Reference Type
 * 	- 주소값을 저장(4byte)
 *	- 기본형을 제외한 모든 타입 : String,System,Date,Calendar 등 모든 클래스는 자료형이다
 *	
 *
 * bit
 * byte - 8bit
 * kilo byte - 1024 byte
 * mega byte - 1024 kilo byte
 * giga byte - 1024 mega byte
 * tera byte
 * peta byte
 * exa byte
 * zetta byte
 * yotta byte
 * 
 */

public class PrimitiveTypeTest {

	public static void main(String[] args) {
		
		PrimitiveTypeTest p = new PrimitiveTypeTest();
		//p.test1();
		//p.test2();
		//p.test3();
		p.test4();
		
	}
	
	/*
	 * 기본형
	 * 1. 논리형
	 * 		boolean(1byte) : true | false
	 * 2. 문자형
	 * 		char(2byte) 0 ~ 65535 : 'a', '가', '1'
	 * 3. 정수형
	 * 		byte(1byte) -128 ~ 127
	 * 		short(2byte) -32768 ~ 32767
	 * 		int(4byte) -21억 ~ 21억
	 * 		long(8byte) -922경 ~ 922경
	 * 4. 실수형
	 * 		float(4byte) 소수점 이하 7자리까지 표현
	 * 		double(8byte) 소수점이하 16자리까지 표현
	 */
	
	public void test1() {
		boolean bool = true;
		System.out.println("bool = " + bool);
		boolean bool2 = 5 > 2; //크기비교도 boolean에 넣을수있다. 또한 좌항기준으로 비교를 한다 (>,<,>=,<=,==,!=)
		System.out.println("bool2 = " + bool2);
		
		char ch = 'a';
		System.out.println("ch = " + ch);
		
		byte b = 120;
		System.out.println("b = " + b);
		System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE); //Byte의 범위를 알수있다
		
		short sh = 30000;
		System.out.println("sh = " + sh);
		System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE); //Short의 범위를 알수있다
		
		int i = 100000;
		System.out.println("i = " + i);
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE); //Int의 범위를 알수있다
		
		long l = 1234567890123L; //기본적으로 정수형은 int로 잡히기때문에 l이나 L을 붙여 long형인것을 알려준다 
		System.out.println("l = " + l);
		System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE); //Long의 범위를 알수있다
		
		float f = 0.12345f; //실수형의 기본형은 double이므로 뒤에 f를 붙여 float형인것을 알려준다
		System.out.println("f = " + f);
		
		double d = 0.123456789; //16자리이후는 값이 날라갈수있음
		System.out.println("d = " + d);
	}
	
	public void test2() {
		
		//변수는 값대입없이 사용할수없다
		//같은 타입인경우 한줄에 여러개 변수선언, 초기화가 가능한다.
		int aa = 2 , bb = 3; 
		
	}
	
		/*
		 * 상수
		 * 한번 값대입후 값을 변경할 수 없는 변수
		 * final
		 * 
		 */
	public void test3() {
		
		final int AGE = 20;   //Alt+shift+R => 변수이름 한번에 다바꿀때 사용
		//age = 30; 변경불가
		System.out.println(AGE);
		
		int myAge = AGE + 10;
		System.out.println(myAge);
		
		//jdk가 지정해둔 상수
		System.out.println(10 * 10 * Math.PI);
		
	}
	/*
	 * Date overflow
	 */
	public void test4() {
		
		int i = Integer.MAX_VALUE;
		System.out.println(i);
		
		i = i+1;
		System.out.println(i); //int의 범위를 넘어서면 다시 가장 최소값으로 돌아간다		
		
	}
	
}
