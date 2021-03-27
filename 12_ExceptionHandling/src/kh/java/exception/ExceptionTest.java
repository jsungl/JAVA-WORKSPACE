package kh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * Exception
 * 예외처리를 통해서 정상복구될수있는 오류
 * 
 * 1.checked exception : RuntimeException의 후손클래스가 아님. 예외처리 강제화
 * 
 * 2.unchecked exception : RuntimeException의 후손클래스
 * 
 * 
 * 
 * 
 */
public class ExceptionTest {

	public static void main(String[] args) {

		ExceptionTest e = new ExceptionTest();
		//e.test1();
		e.test2();
		//e.test3();
		//e.test4();
		//e.test5();
		try {
			e.test6();
		}catch(FileNotFoundException e1) {
			
		}
		System.out.println("------정상종료------");
	}
	
	/*
	 * try절
	 * catch절
	 * - 여러개의 예외클래스를 처리할 수 있도록 catch절을 여러개 작성할 수 있다.
	 * - 부모 예외클래스 타입의 catch절로 통합해서 처리할수있다(다형성)
	 * - 여러개의 예외클래스 타입의 catch절을 사용하는 경우, 자식-부모 타입순으로 작성한다
	 * 
	 * 
	 */
	
	
	public void test1() {
		
//		String s = null;
//		System.out.println(s.length()); //java.lang.NullPointerException
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수입력 : ");
//		int num = sc.nextInt(); //java.util.InputMismatchException
		
//		System.out.println(num / 0); //수를 0으로 나눌수없다
		//java.lang.ArithmeticException: / by zero
		
		
	
		//예외처리
		try {
			//예외가 발생할 수 있는 코드 작성
			String s = null;
			System.out.println(s.length()); //java.lang.NullPointerException
			
			Scanner sc = new Scanner(System.in);
			System.out.print("정수입력 : ");
			int num = sc.nextInt(); //java.util.InputMismatchException
			
			System.out.println(num / 0); //수를 0으로 나눌수없다
			//java.lang.ArithmeticException: / by zero
		}catch(InputMismatchException e) {
			//해당 예외가 발생했을 경우 처리코드 작성
			System.out.println("정확한 값을 입력해주세요");
//			
//		}catch(ArithmeticException e) {
//			
//			System.out.println("수를 0으로 나눌수 없습니다");
//		
//		}catch(NullPointerException e) {
//			
//			System.out.println("NPE 발생");
//			
//			e.printStackTrace(); //예외가 발생했을때의 콜스택의 상황 출력
		
		//catch절에도 다형성이 적용된다
		//부모타입의 예외처리로 한번에 처리
		//자식타입의 예외처리보다 먼저 작성되면 안된다 -> 위의 예외처리부터 차례로 되기떄문에 나중에 작성되야한다
		} catch(RuntimeException e) {	
			e.printStackTrace(); 
		
		} catch(Exception e) { //위 RuntimeException보다 훨씬 더 많은 예외처리가 가능하다
			e.printStackTrace();
		}
		
		
		
	}
	
	
	/*
	 * 처리순서
	 * 
	 * finally절  : try절에서 예외가 던져지든 아니든 무조건 실행되는 코드
	 * 			     자원반납등의 목적으로 사용
	 * 			     조기 리턴시에도 실행된다
	 * 
	 */
	public void test2() {
		
		try {
			
			if(true)
				return; //조기리턴
			
			int[] arr = new int[3];
			
			System.out.println(arr[3]); //java.lang.ArrayIndexOutOfBoundsException
		
		} catch(Exception e) {
		
			e.printStackTrace();
		
		} finally {
		
			System.out.println("finally절 실행");
		
		}
	}
	
	
	
	/*
	 * 사용자의 입력에 대해 예외처리하기
	 */
	public void test3() {
		
		//Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 : ");
				System.out.println(sc.nextInt());
				
				//정상입력한경우
				break;
				
			} catch(Exception e) {
				System.out.println("올바른 정수를 입력하세요"); //다시 입력을 받고싶을때 반복문안에 try-catch문을 넣는다
//				sc.next(); //사용자의 잘못된 입력값이 남겨진 버퍼 비우기용(Scanner를 반복문 밖에서 받는경우)
//				continue;
			}
		
		
		}
	}
	
	
	/*
	 * 사용자로부터 정수 2개를 입력받고 합을 출력하는 프로그램
	 * 부정입력이 있다면 처음부터 다시 입력받으세요
	 */
	public void test4() {
		
		while(true) {	
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 입력1 : ");
				int num1 = sc.nextInt();
				System.out.print("정수 입력2 : ");
				int num2 = sc.nextInt();
				int sum = num1 + num2;
				System.out.println("두 정수의 합은 " + sum);
				break;
			
			}catch(Exception e) {
				System.out.println("다시 입력하시오");
			}
			
			//System.out.println(num1 + num2); try-catch문 밖에서 선언해야한다
		}
	}
	
	
	/*
	 * Checked Exception
	 * 예외처리 강제화
	 * 1. try-catch
	 * 2. throws절 통해 회피
	 * 		- 복수개의 예외를 던지는게 가능하다
	 * 		- 다형성을 적용할수있다
	 */
	public void test5() {
		
	//1. try-catch로 처리
		try {
			FileReader fr = new FileReader("test.txt");
			System.out.println("파일을 찾았습니다");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	//2. throws를 통해 예외회피
	public void test6() throws FileNotFoundException{ //호출하는쪽에다가 던진다(책임전가) -> 호출하는쪽에서 예외를 처리해야한다
		//public void test6() throws IOException 도 가능하다. 
		//FileNotFoundException이 IOException의 자손이기 때문에 단, 호출하는 쪽에서 IOException을 처리해야한다
		FileReader fr = new FileReader("test.txt");
	}

}
