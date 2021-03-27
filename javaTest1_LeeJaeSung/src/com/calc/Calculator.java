package com.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9사이의 정수 하나를 입력 > ");
		int num1 = sc.nextInt();
		System.out.print("1 ~ 9사이의 정수 하나를 입력 > ");
		int num2 = sc.nextInt();
//		if((num1 >= 1 && num1 <= 9) && (num2 >= 1 && num2 <= 9) == false) {
//			System.out.println("1 ~ 9사이의 정수가 아닙니다");
//			return;
//		}
		System.out.println("합 : " + (num1 + num2));
		System.out.println("차 : " + (num1 - num2));
		System.out.println("곱 : " + (num1 * num2));
		System.out.print("나누기 : ");
		System.out.println(num2 <= 0 ? "0" : (num1 / num2));
	}

}
