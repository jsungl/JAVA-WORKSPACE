package kh.java.test.array;

import java.util.Scanner;

/**
 * 	사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
     
        힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - clone() 매소드 이용
- 메소드명 : public void test2()
    위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
    * java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
    * 문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.

 * 
 * 
 *
 */
public class Test4 {

	public static void main(String[] args) {

		Test4 test = new Test4();
		test.test1();
		//test.test2();
	}

	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		char[] chArr = new char[11];
		System.out.print("사용자의 전화번호 입력(-없이 입력) > ");
		String phone_num = sc.next();
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = phone_num.charAt(i);
		}
		char[] copyArr = new char[chArr.length];
		
		System.arraycopy(chArr, 0, copyArr, 0, 3); //처음 3자리는 원본배열에서 복사
		for(int i = 3; i < 7; i++) {
			copyArr[i] = '*'; //가운데 4자리는 *로 대입
		}
		System.arraycopy(chArr, 7, copyArr, 7, 4); //뒤 4자리는 원본배열에서 복사
		
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]);
		}
		
	}
	
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자의 전화번호 입력(-없이 입력) > ");
		String phone_num = sc.next();
		String change = phone_num.substring(3, 7); //가운데 4자리를 가져와 변경할 변수에 저장
		change = "****"; //가운데 4자리를 *로 변경
		String change_num = phone_num.substring(0, 3) + change + phone_num.substring(7, 11);
		System.out.println(change_num);
		
		
		
	}
}
