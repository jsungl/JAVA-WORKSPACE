package com.kh.test.condition;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
		test2.test();
	}
	
	
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int tot = kor + eng + math;
		double avg = (kor + eng + math) / 3;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("�հ�");
		}else
			System.out.println("���հ�");
		
	}
}
