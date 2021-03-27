package com.kh.test.break_continue;

import java.util.Random;
import java.util.Scanner;

/**
 * 1~100 사이의 임의의 난수를 발생시키고, 
       정수 한 개를 입력 받아, 
       난수가 입력 받은 정수보다 작으면 “입력하신 정수보다 작습니다.” 출력, 
       난수가 입력 받은 정수보다 크면 “입력하신 정수보다 큽니다.” 출력하세요.
       단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복되도록 하고, 
       정답인 경우 “정답입니다. 5회 만에 정답을 맞추셨습니다.”와 같이 
       몇 회 만에 정답을 맞추었는지 출력하도록 작성하세요.
 *
 */
public class Test2 {

	public static void main(String[] args) {

		new Test2().test();
	}

	
	public void test() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int num1 = rnd.nextInt(100) + 1; //1~100사이의 임의의 난수 발생 
		int num2; //입력받은 정수
		int cnt = 0;
		
		do{
			cnt++;
			System.out.print("정수 하나를 입력하세요 > ");
			num2 = sc.nextInt();
			if(num1 < num2) 
				System.out.println("입력하신 정수보다 작습니다.");
			else if(num1 > num2) 
				System.out.println("입력하신 정수보다 큽니다.");
			
		}while(num1 != num2);
		
		System.out.println("정답입니다. " + cnt + "회 만에 정답을 맞추셨습니다.");
	}
}