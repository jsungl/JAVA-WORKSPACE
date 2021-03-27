package com.oop.method.nonstatic;

import java.util.Random;
import java.util.Scanner;

public class NonStaticSample {

	public static void main(String[] args) {
		
		NonStaticSample nss = new NonStaticSample();
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 45까지의 임의의 정수 6개 출력(중복금지)");
		nss.printLottoNumbers();
		System.out.print("정수하나를 입력해주세요 > ");
		int num = sc.nextInt();
		System.out.print("문자하나를 입력해주세요 > ");
		char ch = sc.next().charAt(0);
		nss.outputChar(num,ch);
		System.out.println("알파벳 범위의 임의의 영문자를 하나 발생");
		System.out.println(nss.alphabet());
		sc.nextLine();
		System.out.print("문자열을 입력해주세요 > ");
		String s = sc.nextLine();
		System.out.print("시작인덱스를 입력해주세요 > ");
		int start_num = sc.nextInt();
		System.out.print("끝 인덱스를 입력해주세요 > ");
		int end_num = sc.nextInt();
		System.out.println(nss.mySubstring(s, start_num, end_num));
		
		

	}
	//1. 반환값 없고 매개변수 없는 메소드
    //실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
    //메소드명 : printLottoNumbers
    public void printLottoNumbers() {
    	int[] rnd = new int[6];
    	
    	for(int i = 0; i < rnd.length; i++) {
    		rnd[i] = (int)(Math.random() * 45) + 1;
    		for(int j = 0; j < i; j++) {
    			if(rnd[j] == rnd[i])
    				i--; //중복발생시 가장바깥 for문으로 돌아가 해당i번째 for문을 다시 반복한다
    		}
    	}
    	for(int i = 0; i < rnd.length; i++)
    		System.out.print(rnd[i] + " ");
    	System.out.println();
    }
    
    //2. 반환값 없고 매개변수 있는 메소드
    //실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
    //메소드명 : outputChar
    public void outputChar(int a,char ch) {
    	for(int i = 0; i < a; i++) {
    		System.out.print(ch);
    	}
    	System.out.println();
    }
    
    //3. 반환값 있고 매개변수 없는 메소드
    //실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
    //메소드명 : alphabet
    public char alphabet() {    	
    	while(true) {
    		Random rnd = new Random();
    		int num = rnd.nextInt(122) + 1;
    		if((num >= 65 && num <= 90) || (num >= 97 && num <= 122))
    			return (char)num;
    	}
    	
    	/* 강사님 코드
    	 * 
    	 * //26가지 경우의 수를 가지고  0이면 대문자 65, 1이면 소문자 97으로 최초값을 설정한다.
		   int num = (int)(Math.random()*26)+((int)(Math.random()*2)==0?65:97);
		
		   return (char)num;
    	 * 
    	 */
    	
    }
    
    //4. 반환값 있고 매개변수 있는 메소드
    //실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
    //추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
    //메소드명 : mySubstring
    public String mySubstring(String s,int s1,int s2) {
    	String ss = "";
    	for(int i = s1; i <= s2; i++) {
    		ss += s.charAt(i);
    	}
    	if(ss == "") {
    		return null;
    	}
    	return ss;
    	
    	/* 강사님 코드
    	 * 
    	 * if(str==null) return null;
		   String result = str.substring(begin, end);
		   return result;
    	 * 
    	 * 
    	 */
    	
    	
    	
    }
    
}
