package com.kh.test.condition;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 test4 = new Test4();
		test4.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 10 ������ ������ �Է� : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 10) {
			if(num % 2 == 0) {
				System.out.println("¦��");
			}else
				System.out.println("Ȧ��");
		}else {
			System.out.println("�ݵ�� 1~10������ ������ �Է��ؾ� �մϴ�.");
		}
		
	}

}
