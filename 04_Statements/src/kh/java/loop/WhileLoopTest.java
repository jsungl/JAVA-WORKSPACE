package kh.java.loop;

import java.util.Scanner;

/**
 * 
 * 초기식
 * while(조건식) {
 * 
 * 	//반복실행구문
 * 
 * 	증감식
 * 
 * }
 *
 */



public class WhileLoopTest {

	public static void main(String[] args) {
		
		WhileLoopTest w = new WhileLoopTest();
		//w.test1();
		w.test2();
		//w.test3();
		//w.test4();
		//w.test5();
		//w.test6();
		//w.test7();
		//w.test8();
	}
	
	public void test1() {
		
		int i = 1;
		while(i <= 10) {
			System.out.println("hello world " + i);
			i++;
		}
	}
	
	public void test2() {
		
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.print("\n");
		
		i = 1;
		while(i <= 20) {
			if(i % 2 != 0)
				System.out.print(i + " ");
			i++;
		}
		System.out.print("\n");
		
		i = 1;
		while(i <= 20) {
			if(i % 2 == 0)
				System.out.print(i + " ");
			i++;
		}
		System.out.print("\n");
		
		i = 10;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		System.out.print("\n");
		
		i = 20;
		while(i >= 1) {
			if(i % 2 == 0)
				System.out.print(i + " ");
			i--;
		}
		System.out.print("\n");
	}
	
	//구구단 8단
	public void test3() {
		int dan = 8;
		int i = 1;
		while(i <= 9) {
			System.out.println(dan +  " x " +  i + " = " + dan*i );
			i++;
		}
	}
	
	/*
	 * 실습문제 : 사용자에게 양수하나를 입력받고 1부터 입력한 수 사이의 3의 배수 개수를 출력하세요
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양수하나 입력 : ");
		int num = sc.nextInt();
		int i = 1;
		int cnt = 0;
		
		while(i <= num) {
			if(i % 3 == 0) {
				cnt++;
			}
			i++;
		}
		System.out.println("3의 배수 개수 : " + cnt);
	}

	//do-while문
	//1번은 무조건 실행
	//menu를 계속해서 제공시 주로 사용
	public void test5() {
		int i = 1;
		
		do {
			System.out.println("hello");
			i++;
		}while(i <= 10);
	}
	
	
	public void test6() {
		
		Scanner sc = new Scanner(System.in);
		String menu = "==============\n"
					+ "1. 참치김밥---2500원\n"
					+ "2. 멸치김밥---3500원\n"
					+ "3. 김치김밥---2000원\n"
					+ "-----------------\n"
					+ "선택 : ";
		char yn = 'y';
		int sum = 0;
		
		do {
			System.out.print(menu);
			int num = sc.nextInt();
			System.out.println(num + "을 선택하셨습니다.");
			
			//금액 누적합계 구하기
			switch(num) {
			case 1 : sum += 2500;break;
			case 2 : sum += 3500;break;
			case 3 : sum += 2000;break;
			default : System.out.println("잘못입력하셨습니다.");
			}
			System.out.print("추가 주문하시겠습니까?(y/n) : ");
			yn = sc.next().charAt(0);
			
		
		}while(yn == 'y');
		
		System.out.println("결제할 금액은 [" + sum + "]원 입니다.");
		
		System.out.println("===주문완료===");
	}
	
	
	/*
	 * 사용자에게 2~9사이의 단수를 입력받고 해당 단수의 구구단을 출력
	 * 계속할지 여부를 물어보고 반복실행
	 * 단,2~9사이의 수가 아니라면 잘못입력하였다고 출력
	 */
	public void test7() {
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		char ch = 'y';
		
		
		do {
			System.out.print("2 ~ 9 사이의 수를 입력하세요 : ");
			int num = sc.nextInt();
			if((num >= 2 && num <= 9) == false) {
				System.out.println("잘못입력하였습니다.");
				return;
			}
			while(i<=9) {
				System.out.println(num + " x " + i + " = " + num*i);
				i++;
			}
			System.out.print("계속하겠습니까?(y/n) ");
			ch = sc.next().charAt(0);
			i = 1; //i 초기화
		}while(ch == 'y');
		
		System.out.println("종료");
	}
	
	public void test8() {
		Scanner sc = new Scanner(System.in);
		String mainMenu = "==========\n"
						+ "1. 저장\n"
						+ "2. 조회\n"
						+ "3. 수정\n"
						+ "4. 삭제\n"
						+ "0. 프로그램 종료\n"
						+ "==========\n"
						+ "선택 : ";
		
		int choice = 0;
		
		do {
			System.out.print(mainMenu);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 : save();break;
			case 2 : selectList();break;
			case 3 : update();break;
			case 4 : delete();break;
			case 0 : 
				System.out.println("프로그램 종료");return;
			default:
				System.out.println("잘못 입력하였습니다.");
			}
		}while(choice != 0);
	}
	
	public void save() {System.out.println("save를 선택하였습니다");}
	public void selectList() {System.out.println("selectList를 선택하였습니다");}
	public void update() {System.out.println("update를 선택하였습니다");}
	public void delete() {System.out.println("delete를 선택하였습니다");}
	
	
}
