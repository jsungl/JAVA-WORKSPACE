package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 test5 = new Test5();
		test5.test();
		
		
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(cm) : ");
		int height = sc.nextInt();
		System.out.print("몸무게(kg) : ");
		int weight = sc.nextInt();
		
		double bmi = weight / ((height * 0.01) * (height * 0.01));
		double result = Math.floor(bmi * 10) / 10; //소수첫째자리까지만 출력
		
		if(result < 18.5) {
			System.out.println("저체중");
		}else if(result >= 18.5 && result < 23) {
			System.out.println("정상체중");
		}else if(result >= 23 && result < 25) {
			System.out.println("과체중");
		}else if(result >= 25 && result < 30) {
			System.out.println("비만");
		}else{
			System.out.println("고도비만");
		}
		
		
		
	}

}
