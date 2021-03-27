package kh.java.test.array;

import java.util.Scanner;

/**
 * 주민등록번호 성별자리 이후부터 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 
    변경하세요
     
    힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - clone() 매소드 이용
 * 
 * 
 *
 */
public class Test5 {

	public static void main(String[] args) {
		new Test5().test();
		
	}
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 입력(-없이 입력) > "); //13자리
		String st = sc.next();
		char[] chArr = new char[st.length()];
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = st.charAt(i);
		}
		char[] copyArr = new char[chArr.length]; //원본배열 복사본
		char[] starArr = new char[chArr.length]; //*로 선언된 배열
		
		for(int i = 0; i < starArr.length; i++) {
			starArr[i] = '*'; //원본배열 길이만큼 *로 선언
		}
		
		System.arraycopy(chArr, 0, copyArr, 0, 7); //성별자리까지는 원본배열에서 복사
		System.arraycopy(starArr, 7, copyArr, 7, 6); //성별자리 이후부터 *로 복사 
		
		
//		for(int i = 7; i < copyArr.length; i++) {
//			copyArr[i] = '*';
//		}
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]); 
		}
	}

}
