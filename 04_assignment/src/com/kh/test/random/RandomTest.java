package com.kh.test.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {

		RandomTest randomtest = new RandomTest();
		randomtest.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("===���� ���� �� ����===");
		System.out.print("���ڸ� �����ϼ���(1.���� / 2.���� / 3.��) : ");
		int user = sc.nextInt(); //�����
		int com = rnd.nextInt(3) + 1; //��ǻ��
		
		System.out.println("=========���=========");
		if(user == 1 && com == 1) {
			System.out.println("����� ������ �½��ϴ�.");
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
			System.out.println("====================");
			System.out.println("�����ϴ�.");
		}else if(user == 1 && com == 2) {
			System.out.println("����� ������ �½��ϴ�.");
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
			System.out.println("====================");
			System.out.println("����� �����ϴ�.");
		}else if(user == 1 && com == 3) {
			System.out.println("����� ������ �½��ϴ�.");
			System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
			System.out.println("====================");
			System.out.println("����� �̰���ϴ�.");
		}else if(user == 2 && com == 1) {
			System.out.println("����� ������ �½��ϴ�.");
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
			System.out.println("====================");
			System.out.println("����� �̰���ϴ�.");
		}else if(user == 2 && com == 2) {
			System.out.println("����� ������ �½��ϴ�.");
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
			System.out.println("====================");
			System.out.println("�����ϴ�.");
		}else if(user == 2 && com == 3) {
			System.out.println("����� ������ �½��ϴ�.");
			System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
			System.out.println("====================");
			System.out.println("����� �����ϴ�.");
		}else if(user == 3 && com == 1) {
			System.out.println("����� ���� �½��ϴ�.");
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
			System.out.println("====================");
			System.out.println("����� �����ϴ�.");
		}else if(user == 3 && com == 2) {
			System.out.println("����� ���� �½��ϴ�.");
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
			System.out.println("====================");
			System.out.println("����� �̰���ϴ�.");
		}else {
			System.out.println("����� ���� �½��ϴ�.");
			System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
			System.out.println("====================");
			System.out.println("�����ϴ�.");
		}
	}

}
