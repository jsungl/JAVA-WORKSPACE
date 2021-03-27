package com.exception.charcheck;

import java.util.Scanner;

public class Run {

	CharacterProcess cp = new CharacterProcess();
	
	public static void main(String[] args) {

		Run r = new Run();
		r.test1();
		
	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		try {
			int cnt = cp.countAlpha(str);
			System.out.println("전달받은 문자열에서 영문자의 개수는 " + cnt);
		}catch(CharCheckException e) {
			System.out.println(e.getMessage());
			return;
		}
	}

}


/**
 * 강사님 코드
 * public class Run {

	public static void main(String[] args) {
		new Run().test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		try {
			String s = sc.nextLine();
			
			CharacterProcess cp = new CharacterProcess();
			System.out.println(cp.countAlpha(s));
			
		} catch (CharCheckException e) {
			//에러메세지만 출력!
			System.out.println(e.getMessage());
		} 
		
		
	 }
	
 }
*/



/**
 * IO Stream을 사용하였을경우
	public void test() {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("문자열을 입력하세요 : ");
	try {
		String s = br.readLine();
		
		CharacterProcess cp = new CharacterProcess();
		System.out.println(cp.countAlpha(s));
		
	} catch (CharCheckException e) {
		//에러메세지만 출력!
		System.out.println(e.getMessage());
	} catch (IOException e) {
		e.printStackTrace();
	}

  }
*/