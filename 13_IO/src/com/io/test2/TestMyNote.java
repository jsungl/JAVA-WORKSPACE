package com.io.test2;

import java.util.Scanner;

public class TestMyNote {
	

	public static void main(String[] args) {

		MyNote mn = new MyNote();
		Scanner sc = new Scanner(System.in);
		String menu = "******   MyNote  *******\n"
					+ "1. 노트 새로 만들기\n"
					+ "2. 노트 열기\n"
					+ "3. 노트 열어서 수정하기\n"
					+ "4. 끝내기";
		
		while(true) {
			System.out.println(menu);
			System.out.print("메뉴선택(번호입력) : ");
			int num = sc.nextInt();
			switch(num) {
			
				case 1 : mn.fileSave();break;
				case 2 : mn.fileOpen();break;
				case 3 : mn.fileAppend();break;
				case 4 : System.out.println("프로그램 종료");return;
				
			}
			
		}
		
		
	}

	
}
