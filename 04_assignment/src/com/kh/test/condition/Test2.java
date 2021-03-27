package com.kh.test.condition;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
		test2.test();
	}
	
	
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int tot = kor + eng + math;
		double avg = (kor + eng + math) / 3;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("합격");
		}else
			System.out.println("불합격");
		
	}
}
