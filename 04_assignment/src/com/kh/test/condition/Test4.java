package com.kh.test.condition;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 test4 = new Test4();
		test4.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 10 사이의 정수를 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 10) {
			if(num % 2 == 0) {
				System.out.println("짝수");
			}else
				System.out.println("홀수");
		}else {
			System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
		}
		
	}

}
