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
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int tot = kor + eng + math;
		
		if(tot >= 250) {
			
			System.out.println("������Դϴ�.");
		}
		
		
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A�� ����(���� ����) : ");
		int aincome = sc.nextInt();
		System.out.print("B�� ����(���� ����) : ");
		int bincome = sc.nextInt();
		System.out.print("C�� ����(���� ����) : ");
		int cincome = sc.nextInt();
		
		if(aincome >= 5000) {
			System.out.println("A�� ��׿������Դϴ�.");
			if(bincome >= 5000) {
				System.out.println("B�� ��׿������Դϴ�.");
				if(cincome >= 5000) {
					System.out.println("C�� ��׿������Դϴ�.");
				}
			}else if(cincome >= 5000) {
				System.out.println("C�� ��׿������Դϴ�.");
			}
		}else if(bincome >= 5000) {
			System.out.println("B�� ��׿������Դϴ�.");
			if(cincome >= 5000) {
				System.out.println("C�� ��׿������Դϴ�.");
			}
		}else if(cincome >= 5000) {
			System.out.println("C�� ��׿������Դϴ�.");
		}
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("�Է��� ������ ¦���Դϴ�.");
			
		}else
			System.out.println("�Է��� ������ Ȧ���Դϴ�.");
	}

}
