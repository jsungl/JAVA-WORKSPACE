package kh.java.random.number;


import java.util.Random;
import java.util.Scanner;


public class RandomNumberTest {

	public static void main(String[] args) {

		RandomNumberTest r = new RandomNumberTest();
		//r.test1();
		//r.test2();
		//r.test3();
		r.test4();
		
	}
	
	/*
	 * java.util.Random
	 */
	public void test1() {
		Random rnd = new Random();
		int num = rnd.nextInt(); //임의의 난수하나를 출력(int 범위)
		
		//경우의 수,시작값(최소값)
		int num2 = rnd.nextInt(10); //0~9까지 범위의 난수
		//int num2 = rnd.nextInt(10) + 1; //1~10까지 범위의 난수를 얻고싶을때 +1을 한다

		//101 ~ 200의 난수
		int num3 = rnd.nextInt(100) + 101;
		//0.0(포함) ~ 1.0(미포함)의 난수
		double dnum = rnd.nextDouble();
		//true 또는 false 중 랜덤으로 출력
		boolean bool = rnd.nextBoolean();
		
		
		System.out.println(num2);
		
		
	}
	
	
	/*
	 * Math.random()
	 * 
	 * 0.0(포함) ~ 1.0(미포함) 실수를 리턴
	 * 
	 */
	public void test2() {
		double num = Math.random();
		System.out.println(num);
		
		//정수형 난수
		//Math.random() * 경우의 수 + 최솟값
		int i = (int)(num * 10) + 1; //1~10까지의 정수형 난수
		System.out.println(i);
		
	}
	
	/*
	 * 동전게임
	 */
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("동전 앞/뒤를 입력(1.앞 2.뒤) > ");
		int user = sc.nextInt();
		
		int coin = (int)(Math.random() * 2) + 1;
//		Random rnd2 = new Random();
//		int coin = rnd2.nextInt(2) + 1;
//		int coin = rnd2.nextBoolean() ? 1 : 2;
		
		String result = user == coin ? "정답" : "오답";
		System.out.println(result);
		System.out.println("user = " + user + " , coin = " + coin);
	}
	
	
	/*
	 * 올림 ceiling : double
	 * 버림 floor : double
	 * 반올림 round : long
	 */
	public void test4() {
		//1.올림, 소수점 첫째자리에서 올림
		double num = 1.3;
		double result = Math.ceil(num);
		System.out.println("result = " + result);
		
		//2.버림, 소수점 첫째자리에서 버림
		result = Math.floor(num);
		System.out.println("result = " + result);
		
		//부동소수점 방식
		//올림해서 소수점 첫번째 자리까지 표현 : 1.3
		//1.23 * 10 => 12.3에서 올림 => 13.0 => 13.0/10 => 1.3
		num = 1.23;
		result = Math.ceil(num * 10) / 10;
		System.out.println(result);
		
		//3.반올림, 소수점 첫째자리에서 반올림
		double n = 3.75;
		long res = Math.round(n);
		System.out.println(res);
		
		//반올림 결과 3.8, 소수점을 이동시켜서 반올림후 다시 소수점 이동
		long res2 = Math.round(n * 10); 
		System.out.println((double)res2 / 10);
		
	}

}
