package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test();

	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		String s = "";
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				s += "박";
			}else
				s += "수";
		}
		
		System.out.println(s);
	}
}
