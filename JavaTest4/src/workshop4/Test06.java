package workshop4;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr;
		boolean chk = false;
		
		while(true) {
			
			System.out.print("2개의 정수 입력 : ");
			String data = sc.nextLine();
			
			arr = data.split(" ");
			
			if(arr.length < 2 || arr.length > 2) {
				System.out.println("다시입력하세요");
				continue;
			}else {
				for(String s : arr) {	
					if(Integer.parseInt(s) < 1 || Integer.parseInt(s) > 5) {
						System.out.println("숫자를 확인하세요");
						chk = true;
						break;
					}
				}
				if(chk == true) {
					chk = false;
					continue;
				}
				
			}
		
			
			int num1 = Integer.parseInt(arr[0]);
			int num2 = Integer.parseInt(arr[1]);
			int[][] arr2 = new int[num1][num2];
			
			for(int i = 0; i < arr2.length; i++) {
				for(int j = 0; j < arr2[i].length; j++) {
					arr2[i][j] = (int)(Math.random() * 5) + 1;
				}
			}
			
			for(int i = 0; i < arr2.length; i++) {
				for(int j = 0; j < arr2[i].length; j++) {
					System.out.print(arr2[i][j] + " ");
				}
				System.out.println();
			}
			
			int sum = 0;
			int cnt = 0;
			for(int i = 0; i < arr2.length; i++) {
				for(int j = 0; j < arr2[i].length; j++) {
					sum += arr2[i][j];
					cnt++;
				}
			}
			
			System.out.println("sum = " + (double)sum);
			System.out.printf("avg = %.1f%n",(double)sum / cnt);
			
			System.out.print("again?(Y/N) ");
			char c = sc.next().charAt(0);
			if(c == 'Y' || c == 'y') {
				sc.nextLine();
				continue;
			}else if(c == 'N' || c == 'n') {
				break;
			}else {
				System.out.println("프로그램종료");
				return;
			}
		}
	}
}
