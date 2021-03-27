package kh.java.condition;

import java.util.Scanner;

/**
 * 
 * byte,short ,char, int, String ,열거형 으로 처리되는 변수 또는 계산식
 * (boolean, float, double, long은 올 수 없다)
 * 
 * switch(변수 또는 계산식){
 * case 값1 : 처리구문1;
 * 			  break;
 * case 값2 : 처리구문2;
 * 			  break;
 * ...
 * default : 기본처리구문;//생략가능
 *   }
 * 
 * 
 * 계산식의 값이 일치하는 해당 case문이 실행되고, break문을 만나면 switch문을 빠져나온다.
 * 범위처리는 switch문이 불편하다
 */


public class SwitchConditionTest {

	public static void main(String[] args) {
		
		SwitchConditionTest s = new SwitchConditionTest();
		//s.test1();
		//s.test2();
		s.test3();
		//s.test4();
		//s.test5();
	}
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 과일을 좋아하세요 ?(1.사과 2.바나나 3.오렌지) >");
		int fruit = sc.nextInt();
		
		switch(fruit) {
		
		case 1:
			System.out.println("사과를 좋아합니다.");
			break;
		case 2:
			System.out.println("바나나를 좋아합니다.");
			break;
		case 3:
			System.out.println("오렌지를 좋아합니다.");
			break;
		default:
			System.out.println("잘못입력하였습니다.");
		}
	}
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		String menu = "=============\n"
						+ "오늘의 메뉴\n"
						+ "---------------\n"
						+ "1.순대국\n"
						+ "2.미역국\n"
						+ "3.김치찌개\n"
						+ "---------------\n"
						+ "선택 : ";
		
		System.out.print(menu);
		int num = sc.nextInt();
		int price = 0;
		
		switch(num) {
		case 1:
			price = 7000;
			break;
		case 2:
			price = 8000;
			break;
		case 3:
			price = 6000;
			break;
		default :
			System.out.println("잘못입력하였습니다.");
			return; //조기리턴 : 이하코드는 실행하지않고 메소드호출부로 돌아감
		}
		System.out.println(price + "원을 결제해주세요");
	}
	
	/*
	 * switch fall-through
	 */
	public void test3() {
		
		int mark = 99;
		char grade = ' ';
		
		switch(mark) {
		case 100 : 
			grade = 'A';
			System.out.println("grade = " + grade);
			break;
		case 99: 
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			grade = 'B';
			System.out.println("grad = " + grade);
			break;
			
		}
	}
	
	/*
	 * 90~100 A
	 * 80~89 B
	 * 70~79 C
	 * 60~69 D
	 * ~59 F
	 * 
	 */
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력 : ");
		int n = sc.nextInt();
		char grade = ' ';
		
		switch(n / 10) {
		//10으로 나눴을때 앞자리가 9거나 10이면 A ...
		case 10:
			grade = 'A'; //10이나 9나 A이기 때문에 break없앤다
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("학점 : " + grade);
	}
	
	public void test5() {
		
		int choice = menu();
		System.out.println(choice);
		
	}
	public int menu() {
		Scanner sc = new Scanner(System.in);
		String menu = "=============\n"
						+ "오늘의 메뉴\n"
						+ "---------------\n"
						+ "1.순대국\n"
						+ "2.미역국\n"
						+ "3.김치찌개\n"
						+ "---------------\n"
						+ "선택 : ";
		System.out.print(menu);
		int n = sc.nextInt();
		int price = 0;

		switch(n) {
		case 1:
			price = 7000;
			break;
		case 2:
			price = 8000;
			break;
		case 3:
			price = 6000;
			break;
		default :
			System.out.println("선택한 메뉴가 없습니다.");
			return -1; //조기리턴 : 이하코드는 실행하지않고 메소드호출부로 돌아감
		}
		return price;
	}
}
