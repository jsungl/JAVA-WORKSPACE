package com.kh.test.dimentional.array.test;

import java.util.Random;

/**
 * 1. 3행짜리5열 2차원배열 선언 및 생성
    2. 1~100사이의 임의의 정수를 모든 방에 기록함
    3. 각 행별 열의 합계가 5의 배수인 행열값만 출력함
 *
 */
public class Sample {

	public static void main(String[] args) {

		Sample s = new Sample();
		s.exercise1();
		
	}
	
	public void exercise1() {
		int[][] arr = new int[3][5];
		Random rnd = new Random();
		int sum;
		
		for(int i = 0; i < arr.length; i++) {
			sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rnd.nextInt(100) + 1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			if(sum % 5 == 0) {
				System.out.println("--------" + (i+1) + "행----------");
				for(int k = 0; k < arr[i].length; k++) {
					System.out.print(arr[i][k] + " ");
				}
			}
			
		}

	}
	
	
}
