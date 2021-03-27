package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		new Test1().test1();
		new Test1().test2();
		
	}
	
	//1) 정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요  => ");
		int n = sc.nextInt();
		int i = 1;
		int mul = 1; //곱셈결과값
		
		while(i <= n) {
			if(i % 2 != 0) //홀수면
				mul *= i;
			i++;
		}
		System.out.println(mul); //1부터 입력 받은 정수까지의 홀수의 곱
	}

	
	//2) 사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요. => ");
		int num1 = sc.nextInt();
		System.out.print("다른 정수를 하나 입력하세요. => ");
		int num2 = sc.nextInt();		
		int big_num,small_num;
		int sum = 0;
		
		if(num1 > num2) {
			small_num = num2;
			 big_num = num1;
		}else if(num1 < num2) {
			small_num = num1;
			 big_num = num2;
		}else {
			System.out.println("같은 정수를 입력하였습니다.");
			return;
		}
		
		int i = small_num; //입력받은 작은정수를 임시저장
		while(i <= big_num) {
			if(i % 2 != 0) //홀수면
				sum += i; //홀수의 합
			i++;
		}
		System.out.println("====================");
		System.out.println(small_num + "부터 " + big_num + "까지의 홀수의 합은 " + sum + "입니다.");
		
	}
}
