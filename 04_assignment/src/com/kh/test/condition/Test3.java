package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		
		Test3 test3 = new Test3();
		test3.test();
	}
	
	public void test() {
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		char ch = sc.next().charAt(0);
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("잘못 입력 하셨습니다. 프로그램을 종료합니다.");
		}else {
			if(ch == '+') {
				result = num1 + num2;
				System.out.printf("%d %c %d = %d",num1,ch,num2, result);
			}else if(ch == '-') {
				result = num1 - num2;
				System.out.printf("%d %c %d = %d",num1,ch,num2, result);
			}else if(ch == '*') {
				result = num1 * num2;
				System.out.printf("%d %c %d = %d",num1,ch,num2, result);
			}else if(ch == '/') {
				result = num1 / num2;
				System.out.printf("%d %c %d = %d",num1,ch,num2, result);
			}else {
				System.out.println("잘못 입력 하셨습니다. 프로그램을 종료합니다.");
			}
		}
		
	}

}
