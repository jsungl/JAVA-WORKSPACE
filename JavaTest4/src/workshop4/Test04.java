package workshop4;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Calc c = new Calc();
		Scanner sc = new Scanner(System.in);
		System.out.print("5 ~ 10까지의 정수입력 : ");
		int data = sc.nextInt();
		System.out.println("결과 : " + c.caculate(data));
	}

}
