package kh.java.test.array;

import java.util.Scanner;

/**
 * 	문자열을 하나 입력 받아 문자배열에 넣고 검색할 문자를 하나 입력 받아 검색 문자가 문자열에 몇 개인지 개수를 출력하는 프로그램을 작성하세요.
    
    예) 입력값 : helloworld
    검색값 :ㅣ
    출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.

 * 
 * 
 *
 */
public class Test3 {

	public static void main(String[] args) {
		new Test3().test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 하나를 입력 > ");
		String st = sc.nextLine();
		char[] chArr = new char[st.length()]; //입력받은 문자열 길이만큼 문자배열을 할당한다
		
		for(int i = 0; i < st.length(); i++) {
			chArr[i] = st.charAt(i); //문자배열에 입력받은 문자열 하나씩 대입한다
		}
		
		System.out.print("검색할 문자 하나를 입력 > ");
		char ch = sc.next().charAt(0);
		int cnt = 0; 
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == ch)
				cnt++; ////입력받은 문자열과 검색할 문자가 같을 경우 count한다
		}
		
		System.out.println("입력하신 문자열 " + st + "에서 찾으시는 문자 " + ch + "은 " + cnt + "개 입니다.");
		
		

		
		
	}

}
