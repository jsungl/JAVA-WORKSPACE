package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 test5 = new Test5();
		test5.test();
		
		
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(cm) : ");
		int height = sc.nextInt();
		System.out.print("������(kg) : ");
		int weight = sc.nextInt();
		
		double bmi = weight / ((height * 0.01) * (height * 0.01));
		double result = Math.floor(bmi * 10) / 10; //�Ҽ�ù°�ڸ������� ���
		
		if(result < 18.5) {
			System.out.println("��ü��");
		}else if(result >= 18.5 && result < 23) {
			System.out.println("����ü��");
		}else if(result >= 23 && result < 25) {
			System.out.println("��ü��");
		}else if(result >= 25 && result < 30) {
			System.out.println("��");
		}else{
			System.out.println("����");
		}
		
		
		
	}

}
