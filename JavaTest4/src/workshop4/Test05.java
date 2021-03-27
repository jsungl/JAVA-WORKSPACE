package workshop4;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 5까지의 정수입력 : ");
		int data = sc.nextInt();
		int sum = 0;
		int idx = 0;
				
		for(int i = data; i <= 10; i++) {
			if(i % 3 != 0 && i % 5 != 0) {
				if(idx == 0) {
					System.out.print(i);
					idx++;
				}else
					System.out.print("+" + i);
				sum += i;
			}
		}
		
		System.out.println();
		System.out.println("결과 : " + sum);
	}
}
