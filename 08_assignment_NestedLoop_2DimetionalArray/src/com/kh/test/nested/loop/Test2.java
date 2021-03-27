package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("양수가 아닙니다.");
			return;
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = i; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
