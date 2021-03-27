package kh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopTest {

	public static void main(String[] args) {

		NestedLoopTest n = new NestedLoopTest();
		//n.test1();
		//n.test2();
		//n.test3();
		//n.test4();
		//n.test5();
		n.test6();
		//n.test7();
		//n.test8();
		
		
	}
	
	//중첩반복문
	public void test1() {
		
		for(int i = 0; i < 3; i++) { //행
			for(int j = 0; j < 5; j++) { //열
				//System.out.println(i + " , " + j);
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	//사용자로부터 행과 열을 입력받고 해당크기의 별을 출력하세요
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 입력 > ");
		int row = sc.nextInt();
		System.out.print("열 입력 > ");
		int col = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	
	
	//사용자로부터 행과 열을 입력받고 해당크기의 별을 출력하세요
	//1열의 별은 ☆ 나머지열은 ★로 출력하세요
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 입력 > ");
		int row = sc.nextInt();
		System.out.print("열 입력 > ");
		int col = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(j == 0)
					System.out.print("☆");
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	public void test4() {
		
		for(int i = 2; i < 10; i++) { //단
			System.out.println("--------" + i + "단--------");
			for(int j = 1; j < 10; j++) {
				System.out.println(i +  " * " + j + " = " + i*j);
			}
		}
		
	}
	
	
	
	/*
	 * label이 있는 break문
	 * 
	 * 단 x수 의 결과가 300미만일떄 까지만 출력 
	 */
	
	public void test5() {
		outer: //반복문 이름을 지정해준다,반복문위에 지정
		for(int i = 2; i < 100; i++) {
			System.out.println("--------" + i + "단--------");
			for(int j = 1; j < 10; j++) {
				if(i * j > 300)
					break outer; //전체 반복문에서 빠져나온다
				System.out.println(i +  " * " + j + " = " + i*j);
			}
		}
	}
	
	/*
	 * label있는 continue문
	 * 각 단에서 단,수가 동일한 때까지 출력
	 */
	public void test6() {
		outer: 
			for(int i = 2; i < 10; i++) {
				System.out.println("--------" + i + "단--------");
				for(int j = 1; j < 10; j++) {
					System.out.println(i +  " * " + j + " = " + i*j);
					if(i == j)
						continue outer; //가장 바깥의 for문으로 나간다
				}
			}
	}
	
	
	/*
	 * ●
	 * ●●
	 * ●●●
	 * ●●●●
	 */
	public void test7() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("●");
			}
			System.out.println();
		}
	}
	
	/*
	 * ●●●
	 * ●
	 * ●●●
	 * ●
	 * ●●●
	 */
	public void test8() {
		outer:
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 3; j++) { 
					System.out.print("●");
					if(i % 2 != 0) {
						System.out.println();
						continue outer;
					}
				}
				System.out.println();
			}
	}
	

}
