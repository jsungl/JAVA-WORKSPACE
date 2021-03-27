package com.oop.method.static_;

public class StaticMethod {

	//static method
    //1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
    //메소드명 : toUpper(String) : String
	public static void toUpper(String s) {
		String change_s = s.toUpperCase();
		System.out.println(change_s);
	
	}
    
    //2. 첫번째 문자열의 전달받은 인덱스의 문자를 전달받은 문자로 변경하는 static 메소드
    //메소드명 : setChar(String, int, char)
    public static void setChar(String s, int a, char ch) {	
    	
    	String s_new = "";
    	for(int i = 0; i < s.length(); i++) {
    		if(i == a) 
    			s_new += ch;
    		else
    			s_new += s.charAt(i);
    	}
    	System.out.println(s_new);
    	
    	/* 강사님코드
    	 * 
    	 * char[] arr = str.toCharArray(); //문자열을 char형 배열로 바꾼다.
		   arr[index] = ch;
		   return new String(arr); //char형 배열을 문자열로 바꾼다. 
		   String 클래스 소스코드참조
    	 * 
    	 */
    	 
    }
	
    //3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
    //메소드명 : getAlphabetLength(String) : int
    public static int getAlphabetLength(String s) {
    	int cnt = 0;
    	for(int i = 0; i < s.length(); i++) {
    		if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
    			cnt++;
    	}
    	return cnt;
    	
    	/* 강사님 코드
    	 * 
    	 * int cnt = 0;
		   for(int i = 0; i < s.length(); i++) {
		   		char ch = s.charAt(i);
		   		if(Character.isUpperCase(ch) || Character.isLowerCase(ch)) //대문자인지 소문자인지 확인
					cnt++;
		}
		  return cnt; 
    	 */
    }
    
    
    //4. 전달한 문자열값을 하나로 합쳐서 리턴 
    //메소드명 : concat(String, String) : String
    public static String concat(String s1,String s2) {
    	return s1.concat(s2);
    	//return s1 + s2;
    	
    }



}
