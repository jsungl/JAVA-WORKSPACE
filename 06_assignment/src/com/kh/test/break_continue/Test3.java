package com.kh.test.break_continue;

import java.util.Scanner;

/**
 * 
 *	2보다 큰 정수를 입력 받고, 입력 받은 정수가 소수이면 “소수다“, 소수가 아니면 “소수가 아니다.” 출력하고 프로그램을 종료하는 코드를 작성하세요.
     	단, 입력 받은 정수가 2보다 작은 경우 “잘못 입력하셨습니다. 다시 입력하세요.” 출력 후 다시 정수를 입력 받도록 하세요.
    ** 소수란? : 어떠한 정수를 1부터 자기 자신까지로 나누었을 때, 나누어 떨어지는 수가 1과 자기 자신 뿐인 수를 소수라고 한다.
 *
 *
 */

public class Test3 {

	public static void main(String[] args) {

		new Test3().test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		int num; //입력받은 정수
		int cnt = 0;
		
		while(cnt != 2) {
			System.out.print("2보다 큰 정수를 입력하세요 > ");
			num = sc.nextInt();
			
			if(num < 2) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			}	
			//소수 판별 : 1부터 자기자신까지로 나눴을때 나누어 떨어지면 count한다. 나누어떨어지는 경우의 수가 2가지인경우(1과 자기자신) 소수다
			for(int i = 1;i <= num;i++) {
				if(num % i == 0) {
					cnt++;
				}
			}
			
			if(cnt == 2) {
				System.out.println("소수다");
			}else {
				System.out.println("소수가 아니다");
				break;
			}
		}
	}
}
