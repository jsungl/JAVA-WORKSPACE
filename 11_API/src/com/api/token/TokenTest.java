package com.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {

		String data = "J a v a P r o g r a m ";
		System.out.println(data); 
		System.out.println(data.length());
		char[] ch = new char[data.length()];
		int idx = 0;
		StringTokenizer tokenizer = new StringTokenizer(data," ");
		
		while(tokenizer.hasMoreTokens()) { 
			String s = tokenizer.nextToken();
			ch[idx++] = s.charAt(0);
		}
		System.out.println(idx);
		
		for(int i = 0; i < idx; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		char[] c = new char[idx];
		for(int i = 0; i < idx; i++) {
			c[i] = ch[i];
		}
		
		String str = Arrays.toString(c);
		System.out.println(str.toUpperCase());
		
	/*	
	 * 강사님 코드
		String s = "J a v a P r o g r a m ";
		
		//토큰 처리전 글자 출력
		System.out.println(s);
		
		//전 글자갯수 출력
		System.out.println(s.length());
		
		//토큰 처리 후 글자갯수 출력 확인
		String[] sarr = s.split(" ");
		System.out.println(sarr.length);
		
		char[] carr = new char[sarr.length];
		
		for(int i=0; i<sarr.length; i++) {
			carr[i] = sarr[i].charAt(0);			
		}
		
		//char [] 값 출력
		System.out.println(Arrays.toString(carr));
		
		//char [] 을 다시 String 으로 바꾼 후 모두 대문자로 변환하여 출력
		System.out.println(new String(carr).toUpperCase());
	*/
	}

}
