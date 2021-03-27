package com.kh.test.dimentional.array.test;

import java.util.Random;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.exercise1();
	}

	private void exercise1() {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][5];
		Random rnd = new Random();
		
		//배열에 1~100 사이의 random값 저장
		for(int i =0 ; i< arr.length ; i++) {
			for (int j =0 ; j<arr[i].length ; j++) {
				arr[i][j] = rnd.nextInt(100)+1;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("===============\n");
		
		int row, col;
		for(row =0 ; row<arr.length ; row++) {
			int sum =0;	
			for (col=0 ; col<arr[row].length ; col++) {
				sum  += arr[row][col];
			}
			if(sum %5 == 0) {
				System.out.print("행 "+(row+1) +" : ");
				for(int i =0 ; i< arr[row].length ; i++) {
						System.out.print(arr[row][i]+" ");
					}
					System.out.println("\t / 총합 : "+sum);
			}
		}
	
	}

}
