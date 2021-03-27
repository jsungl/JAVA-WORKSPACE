package test.controller;

import java.util.Scanner;

//키보드로 2개의 정수형 데이터를 입력 받아, 두 수가 모두 1부터 9까지의 수일 때만 두 수의 곱이 한자리 수인지 두자리 수인지를 출력한다.
public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력 > ");
		int num1 = sc.nextInt();
		System.out.print("정수 하나를 입력 > ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
			if(num1 * num2 < 10)
				System.out.println("한 자리 수 입니다");
			else if((num1 * num2 >= 10) && (num1 * num2 < 100))
				System.out.println("두자리 수 입니다");
		}else
			System.out.println("1 ~ 9사이의 정수가 아닙니다");
		
	}

}
