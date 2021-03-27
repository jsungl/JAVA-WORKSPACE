package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Test1 test = new Test1();
		test.test1();
		test.test2();
		test.test3();
	}
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int tot = kor + eng + math;
		
		if(tot >= 250) {
			
			System.out.println("우수생입니다.");
		}
		
		
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A의 연봉(단위 만원) : ");
		int aincome = sc.nextInt();
		System.out.print("B의 연봉(단위 만원) : ");
		int bincome = sc.nextInt();
		System.out.print("C의 연봉(단위 만원) : ");
		int cincome = sc.nextInt();
		
		if(aincome >= 5000) {
			System.out.println("A는 고액연봉자입니다.");
			if(bincome >= 5000) {
				System.out.println("B는 고액연봉자입니다.");
				if(cincome >= 5000) {
					System.out.println("C는 고액연봉자입니다.");
				}
			}else if(cincome >= 5000) {
				System.out.println("C는 고액연봉자입니다.");
			}
		}else if(bincome >= 5000) {
			System.out.println("B는 고액연봉자입니다.");
			if(cincome >= 5000) {
				System.out.println("C는 고액연봉자입니다.");
			}
		}else if(cincome >= 5000) {
			System.out.println("C는 고액연봉자입니다.");
		}
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("입력한 정수는 짝수입니다.");
			
		}else
			System.out.println("입력한 정수는 홀수입니다.");
	}

}
