package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		
		Test3 test3 = new Test3();
		test3.test();
	}
	
	public void test() {
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է��ϼ���(+,-,*,/) : ");
		char ch = sc.next().charAt(0);
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}else {
			if(ch == '+') {
				result = num1 + num2;
				System.out.printf("%d %c %d = %d",num1,ch,num2, result);
			}else if(ch == '-') {
				result = num1 - num2;
				System.out.printf("%d %c %d = %d",num1,ch,num2, result);
			}else if(ch == '*') {
				result = num1 * num2;
				System.out.printf("%d %c %d = %d",num1,ch,num2, result);
			}else if(ch == '/') {
				result = num1 / num2;
				System.out.printf("%d %c %d = %d",num1,ch,num2, result);
			}else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
		}
		
	}

}
