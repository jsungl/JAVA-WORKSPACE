package my.test;

import java.util.Scanner;



public class Test {

	public static void main(String[] args) {

		String computer = "가위";
		Scanner sc = new Scanner(System.in);
		System.out.print("내가입력 > ");
		String me = sc.nextLine();
		
		if(me.equals(computer)) {
			System.out.println("true");
		}else
			System.out.println("false");
	}

	
}
