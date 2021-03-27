package workshop5;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 : ");
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		
		for(int i = c.length-1; i >= 0; i--) {
			System.out.print(c[i] + " ");
		}
		
	}

}
