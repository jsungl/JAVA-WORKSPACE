package kh.java.oop.method;

/**
 * 
 * 재귀함수 Recursion
 * - 함수가 함수자신을 다시 호출
 * 
 * 재귀함수는 반드시 종료조건을 기술해야한다
 *
 */


public class RecursionTest {

	public static void main(String[] args) {

		RecursionTest r = new RecursionTest();
		int result = r.factorial(5);
		System.out.println("result = " + result);
	}
	
	public int factorial(int n) {
		if(n == 1)
			return 1;
		return n * factorial(n-1);
	}

}
