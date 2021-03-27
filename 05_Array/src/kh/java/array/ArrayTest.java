package kh.java.array;

import java.util.Arrays;

public class ArrayTest {

	
	public static void main(String[] args) {
		
		ArrayTest a = new ArrayTest();
		//a.test0();
		//a.test4();
		//a.test5();
		//a.test6();
		a.test7();
	}
	//배열을 안쓰고 변수지정을 통해 총점,평균 구하는 경우
	public void test0() {
		//동일한 자료형을 가진 여러값
		int kor = 80;
		int math = 70;
		int eng = 90;
		int society = 75;
		int science = 43;
		
		
		//총점,평균
		int tot = kor + math + eng + society + science;
		double avg = (double)tot / 5;
		System.out.printf("총점 : %d , 평균 : %.2f%n",tot,avg);
		
	}
	
	
	/*
	 * 배열 : 동일한 자료형의 값이 여러개인 경우
	 * 
	 * 
	 */
	public void test1() {
		//1. 배열선언
		
		int[] arr;
		//int arr[]; 이렇게 선언도 가능(주로 C언어에서 선호)
		
		//2. 배열할당 : 배열길이를 반드시 지정할것
		//메모리 heap영역에 int값을 담을 수 있는 공간 할당
		//배열은 각 타입별 초기값을 미리 처리됨
		//기본형 - int 0, double 0.0, char ' ', boolean false (실제값이 들어있음)
		//참조형 - null(값 없음) (주소값이 들어있음)
		arr = new int[5];
		
		//3. 배열 각번지에 값대입
		arr[0] = 80;
		arr[1] = 70;
		arr[2] = 90;
		arr[3] = 75;
		arr[4] = 43;
		
		
		//int tot = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		//반복문을 통한 배열 총점구하기
		//의미를 찾기 힘든 magic number(아래 반복문의 5) 대신 변수,상수를 사용하자
		int tot = 0;
		for(int i = 0; i < 5; i++) {
			tot += arr[i];
		}
		double avg = (double)tot / 5;
		//double avg = (double)tot / arr.length; 배열의 길이로 나눠도 된다
		
		System.out.printf("총점 : %d , 평균 : %.2f%n",tot,avg);
	}
	
	/*
	 * int, double, long ...  => 기본형
	 * int[], double[], long[] ... => 참조형
	 * 
	 */
	
	public void test2() {
		
		double[] arr;
		//배열할당 : heap영역에 배열객체를 생성하고, 주소값을 arr에 대입
		arr = new double[3];
		//double[] arr = new double[3];
		
		//배열요소(각 인덱스)에 값 대입
		arr[0] = 1.1;
		arr[1] = 2.2;
		arr[2] = 3.3; //배열의 마지막 인덱스 : arr.length - 1
		
	}
	
	/*
	 * 초기화
	 * 배열변수 선언 + 배열 할당(heap) + 인덱스별 값대입
	 */
	public void test3() {
		
		char[] chArr = {'a','b','c'};
		//char[] chArr = new char[] {'a','b','c'}; 이런식의 초기화도 가능하지만 위의것이 제일 간결하다
		
/*		
		//위와 동일한 선언
		char[] chArr;
		chArr = new char[3];
		chArr[0] = 'a';
		chArr[1] = 'b';
		chArr[2] = 'c';
*/
		
	}
	
	
	/*
	 * 배열의 요소에 담긴 값에 규칙이 있다면, 값 대입시에 반복문을 사용할수있다.
	 * {1,2,3,4,5,....,100}
	 * {'a','b','c'}
	 * {2,4,6,8,10}
	 */
	public void test4() {
		
		int[] arr = new int[100];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 101;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	/*
	 * 알파벳 소문자가 담긴 char배열을 생성하고 출력
	 */
	public void test5() {
		
		char[] chArr = new char[50];
		int tmp = 97;
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = (char)tmp;
			if(tmp == 122)
				System.out.println(chArr[i]);
			else
				System.out.print(chArr[i] + ", ");
			tmp++;
			if(tmp == 123) {
				break;
			}
		}
		
	}
	
	
	
	/*
	 * String[]
	 * 
	 */
	public void test6() {
		String[] strArr = new String[3];
		//String[] strArr = {"홍길동", "신사임당", "장영실"};
		strArr[0] = "홍길동";
		strArr[1] = "신사임당";
		strArr[2] = "장영실";
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
	}
	
	
	
	/*
	 * 배열의 특징
	 *  - 배열의 길이는 변경할 수 없다
	 */
	public void test7() {
		int[] arr = new int[10]; //10개의 배열크기를 가진 arr배열 선언
		//System.out.println(arr.length);
		arr = new int[7]; //위 배열의 연결을 끊고 7개의 배열크기를 가진 arr배열을 다시 만든다(heap 공간에 새로운 주소값을 가리킨다)
		//System.out.println(arr.length);
		
		//System.out.println(arr.hashCode());
		//hashcode 비교 : 객체 주소값에 접근할수있는 key값
		//hashcode값이 같다면 객체 주소값이 같다
		
		//toString : 객체를 문자열 정보로 표현
		System.out.println(arr.toString());
		System.out.println(arr); //위와 동일한 결과값을 출력한다
		
		//참조형 변수의 기본값 null
		arr = null; //삭제
		//System.out.println(arr.length); 삭제된 배열객체의 길이를 출력하려고해서 NullPointerException에러발생
	}
	
}