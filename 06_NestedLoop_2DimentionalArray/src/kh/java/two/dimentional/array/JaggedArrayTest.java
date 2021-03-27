package kh.java.two.dimentional.array;

import java.util.Scanner;

/**
 * 가변배열 JaggedArray
 * 
 * int[][] arr = new int[3][]
 * 
 * 
 *
 */

public class JaggedArrayTest {

	public static void main(String[] args) {
		
		JaggedArrayTest jat = new JaggedArrayTest();
		jat.test1();
		//jat.test2();
		//jat.test3();
	}
	
	
	//가변배열
	public void test1() {
		int[][] arr = new int[3][]; //2차원배열에 아무것도 할당하지않으면 null이 나온다
		
		//2차원배열할당
		arr[0] = new int[10];
		arr[1] = new int[3];
		arr[2] = new int[7];
		
		//값 입력
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]); //null
			//System.out.println(arr[i].toString()); //객체의 정보를 문자열로 출력(hashcode값 포함)
			for(int j = 0; j < arr[i].length; j++) { //가변배열에서는 arr[i].length만 가능,arr[0].length 불가능
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	
	//구매목록 입력 받는데 의류5종,식료품2종류,기타물품3종류 담을수있는 가변배열을 선언하고 사용자로부터 각각 입력받으세요
	public void test2() {
		String[][] a = new String[3][];
		
		a[0] = new String[5];
		a[1] = new String[2];
		a[2] = new String[3];
		
		
		Scanner sc = new Scanner(System.in);
	/*
		for(int i = 0; i < a[0].length;i++) {
			System.out.print("의류 5종 입력 > ");
			a[0][i] = sc.next();
		}
		for(int i = 0; i < a[1].length;i++) {
			System.out.print("식료품 2종 입력 > ");
			a[1][i] = sc.next();
		}
		for(int i = 0; i < a[2].length;i++) {
			System.out.print("기타 물품 3종 입력 > ");
			a[2][i] = sc.next();
		}
	*/	
		
		
		
		for(int i = 0; i < a.length; i++) {
			switch(i) {
			case 0 : System.out.println("의류");break;
			case 1 : System.out.println("식료품");break;
			case 2 : System.out.println("기타물품");break;
			}
			System.out.println(a[i].length + "가지를 입력하세요");
			
			for(int j = 0; j < a[i].length; j++) { 
				System.out.print(j + 1 + " : ");
				a[i][j] = sc.next();
				
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < a.length; i++) {
			switch(i) {
			case 0 : System.out.print("의류 : ");break;
			case 1 : System.out.print("식료품 : ");break;
			case 2 : System.out.print("기타물품 : ");break;
			}
			for(int j = 0; j < a[i].length; j++) { 
				System.out.print(a[i][j]);
				System.out.print((j != a[i].length - 1) ? ", " : "");
			}
			System.out.println();
		}
	}
	
	
	
	//사용자에게 정수를 입력받고 입력한 정수에 따라 다음과 같이 처리
	//정수 : 5
	//0행길이 : 5
	//1행길이 : 4
	//2행길이 : 3
	//3행길이 : 2
	//4행길이 : 1
	//1 2 3 4 5
	//6 7 8 9
	//10 11 12
	//13 14
	//15
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[][] arr = new int[num][];
		//2차원배열 할당
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[num - i];
			System.out.println(i + "행 길이 : " + (num - i));
		}
		
		//값대입
		int s = 1;
		for(int j = 0; j < arr.length; j++) {
			for(int k = 0; k < arr[j].length; k++) {
				arr[j][k] = s++;
			}
		}
		//출력
		for(int j = 0; j < arr.length; j++) {
			for(int k = 0; k < arr[j].length; k++) {
				System.out.print(arr[j][k] + " ");
			}
			System.out.println();
		}
		
	}

}
