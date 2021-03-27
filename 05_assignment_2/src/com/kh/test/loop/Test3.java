package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력(1~9까지) : ");
		int num = sc.nextInt();
		
		if(!(num >= 1 && num <= 9)) {
			System.out.println("잘못입력하셨습니다. 프로그램종료합니다");
			return;
		}
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
		
	}
}
