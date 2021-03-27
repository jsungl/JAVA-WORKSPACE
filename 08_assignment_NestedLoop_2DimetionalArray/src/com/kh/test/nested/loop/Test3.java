package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t = new Test3();
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
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < num-1; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = i;k < num-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
