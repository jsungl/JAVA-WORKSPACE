package kh.java.scanner;

import java.util.Scanner;

/**
 * 
 * Scanner
 * 1. next계열
 * 	-next() : String
 * 	-nextInt() : int
 * 	-nextDouble() : double
 * 	-nextBoolean() : boolean
 * 
 * 2. nextLine계열
 * 	-nextLine() : String
 * 
 *
 */


public class ScannerTest {

	public static void main(String[] args) {
		
		ScannerTest st = new ScannerTest();
		//st.test1();
		//st.test2();
		st.test3();
	}
	
	/*
	 * next계열
	 * - 입력버퍼에서 공백이나 개행문자 전까지 읽어서 반환한다.
	 * - 사용자입력값 이전의 공백/개행문자는 무시한다.
	 */
	public void test1() {
		//System.in 표준입력(키보드에서 입력)
		//System.out 표준출력(콘솔에출력)
		Scanner sc = new Scanner(System.in);
//		System.out.print("이름 : ");
//		String name = sc.next(); //사용자로부터 입력받은 값을 대입 ->입력후 enter
//		System.out.println(name);
		
		//실제 읽어오는값은 문자열로 읽어오지만 Scanner에서 자동으로  형변환해준다
//		System.out.print("정수를 입력하세요 : ");
//		int num = sc.nextInt(); 
//		System.out.println(num);
		
//		System.out.print("실수를 입력하세요 : ");
//		double dnum = sc.nextDouble();
//		System.out.println(dnum);
		
//		System.out.print("true or false를 입력하세요 : ");
//		boolean bool = sc.nextBoolean();
//		System.out.println(bool);
		
		//next의 특징
		System.out.print("주소입력 : ");
		String addr = sc.next(); //서울시 강남구 입력
		System.out.println(addr); //서울시만 출력 ->공백이나 개행문자 전까지만 출력
		addr = sc.next();
		System.out.println(addr); //강남구 출력
	}
	
	/*
	 * nextLine 계열
	 * - 입력버퍼에서 개행문자까지 읽어온후,개행문자를 제외하고 반환한다.
	 * - next()와 같이 쓰는경우 개행문자가 남은상태이기때문에 nextLine()에서는 더이상 입력받지않는다.
	 * - 개행문자 날리기용 코드를 하나 추가한다.
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름를 입력하세요 : ");
		String name = sc.next();
		System.out.println(name);
		
		//개행문자 날리기용
		sc.nextLine(); //입력버퍼를 비워둔다
		
		System.out.print("주소를 입력하세요 : ");
		String addr = sc.nextLine(); //공백포함 입력한 문자열 모두출력
		System.out.println(addr);
				
	}
	/**
	 * 
	 * 실습문제
	 * 사용자로부터 이름,나이,주소,키,몸무게 입력받고 출력한다
	 */
	
	public void test3() {
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc2.next();
		
		
		System.out.print("나이 : ");
		int age = sc2.nextInt();
		
		sc2.nextLine(); //개행문자 날리기용
		
		System.out.print("주소 : ");
		String addr = sc2.nextLine();
		
		
		System.out.print("키 : ");
		int height = sc2.nextInt();
		
		
		System.out.print("몸무게 : ");
		double weight = sc2.nextDouble();
		
		System.out.printf("이름은 %s%n나이는 %d살%n주소는 %s%n키는 %dcm%n몸무게는 %.1fkg%n",name,age,addr,height,weight);
		
		
	
		
		
		
		
		
	}
}
