package kh.java.api.string;

import java.util.Scanner;

public class Test {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.test1();
	}
	
	public void test1() {
		StringBuilder sb = new StringBuilder("");
		while(true) {
			System.out.print("파일에 저장할 내용을 입력하시오 : ");
			String str = sc.nextLine();
			if(str.equals("exit"))
				break;
			else {
				sb.append(str);
			}
		}
		
		System.out.println(sb);
	}
}
