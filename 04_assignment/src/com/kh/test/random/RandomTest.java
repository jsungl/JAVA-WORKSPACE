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
		System.out.println("===가위 바위 보 게임===");
		System.out.print("숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : ");
		int user = sc.nextInt(); //사용자
		int com = rnd.nextInt(3) + 1; //컴퓨터
		
		System.out.println("=========결과=========");
		if(user == 1 && com == 1) {
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println("====================");
			System.out.println("비겼습니다.");
		}else if(user == 1 && com == 2) {
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println("====================");
			System.out.println("당신이 졌습니다.");
		}else if(user == 1 && com == 3) {
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println("====================");
			System.out.println("당신이 이겼습니다.");
		}else if(user == 2 && com == 1) {
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println("====================");
			System.out.println("당신이 이겼습니다.");
		}else if(user == 2 && com == 2) {
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println("====================");
			System.out.println("비겼습니다.");
		}else if(user == 2 && com == 3) {
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println("====================");
			System.out.println("당신이 졌습니다.");
		}else if(user == 3 && com == 1) {
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println("====================");
			System.out.println("당신이 졌습니다.");
		}else if(user == 3 && com == 2) {
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println("====================");
			System.out.println("당신이 이겼습니다.");
		}else {
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println("====================");
			System.out.println("비겼습니다.");
		}
	}

}
