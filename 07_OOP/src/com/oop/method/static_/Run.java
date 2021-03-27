package com.oop.method.static_;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 하나를 입력해주세요 > ");
		String s = sc.nextLine();
		System.out.print("대문자로 변환된 문자열 > ");
		StaticMethod.toUpper(s);
		System.out.print("문자열 하나를 입력해주세요 > ");
		String s1 = sc.nextLine();
		System.out.print("문자열의 변경할 인덱스 하나를 입력해주세요 > ");
		int num = sc.nextInt();
		System.out.print("변경할 문자 하나를 입력해주세요 > ");
		char ch = sc.next().charAt(0);
		System.out.print("변경된 문자열 > "); 
		StaticMethod.setChar(s1, num, ch);
		sc.nextLine();
		System.out.print("영문자 및 숫자를 포함한 문자열 하나를 입력해주세요 > ");
		String s2 = sc.nextLine();
		System.out.println("입력한 문자열의 영문자 개수 > " + StaticMethod.getAlphabetLength(s2));
		System.out.print("문자열 하나를 입력해주세요 > ");
		String s3 = sc.nextLine();
		System.out.print("문자열 하나를 입력해주세요 > ");
		String s4 = sc.nextLine();
		System.out.println(StaticMethod.concat(s3, s4));
		
	}

}
