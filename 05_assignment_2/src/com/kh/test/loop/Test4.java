package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 t = new Test4();
		t.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String s = sc.nextLine();
		System.out.print("검색할 문자 입력 : ");
		char c = sc.next().charAt(0);
		int count = 0; //검색할문자가 있는지 체크할때 사용
		int tmp = 0;
		
		//입력받은 문자가 영문자가 아닌경우
		if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') == false) {
			System.out.println("영문자가 아닙니다.");
			return;
		}
		//입력받은 문자열의 길이개수만큼 for문이 진행된다.
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				if(tmp != 0) {
					count += 0;
				}else
					count++; //검색할 문자와 해당자리의 문자가 맞는경우 count한다.
					tmp++; //중복문자  제외하고 count할경우
			}
		}
		System.out.println("'" + c + "' 가 포함된 갯수 : " + count + "개");
	}
}
