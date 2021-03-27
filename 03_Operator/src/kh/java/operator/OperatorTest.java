package kh.java.operator;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		
		OperatorTest op = new OperatorTest();
		//op.test1();
		//op.test1_1();
		//op.test2();
		//op.test2_1();
		//op.test3();
		//op.test4();
		op.test5();
	}
	
	
	/*
	 * 단항 연산자
	 * 
	 */
	public void test1() {
		
		int a = 10;
		System.out.println(+a + "," + -a);
		
		boolean bool = a != 10; //비교연산후 대입연산 진행, 애매하다싶으면 괄호를 쓰자
		System.out.println(bool);
		
		System.out.println((long)Integer.MAX_VALUE + 1);
		
		//증감 연산자 : ++ --
		//전위 증감연산자 : ++a,--a
		//후위 증감연산자 : a++,a--
		a++;
		System.out.println("a = " + a);
		a--;
		System.out.println("a = " + a);
		
		int k = 1;
		int m = k++;
		System.out.println("k = " + k + " m = " + m);
		
		int i = 3;
		int j = ++i + 10;
		System.out.println("i = " + i + " j = " + j);
		
	}
	
	public void test1_1() {
		
		int x = 10;
		int y = 10;
		int z = ++x;
		System.out.printf("x = %d, y = %d, z = %d%n",x,y,z);//11,10,11
		
		z = y++;
		System.out.printf("x = %d, y = %d, z = %d%n",x,y,z);//11,11,10
		
		x = 20;
		z = x++ + --y;
		System.out.printf("x = %d, y = %d, z = %d%n",x,y,z);//21,10,30
		
		//////////헷갈리는 부분/////////////
		int m = 20;
		int n = m++ + m; //41
		System.out.printf("m = %d, n = %d",m,n); //21,41
		
	}
	
	public void test2() {
		
		int a = 10;
		int b = 4;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(a + b * a / b -a % b);
		//System.out.println(a + ((b * a) / b) -(a % b));
		
		System.out.println(a > b);// 크다 gt
		System.out.println(a < b);// 작다 lt
		System.out.println(a >= b);// 크거나같다 ge
		System.out.println(a <= b);// 적가나 같다 le
		
	}
	
	/*
	 * 
	 * 이항연산자
	 * 논리 비교연산자 && ||
	 * - && AND
	 *	 a && b : a가 참이면서 b가 참인가?
	 * 	 좌/우항 모두 참이면 참, 하나라도 거짓이면 거짓
	 * 
	 * - || OR
	 * 	 a || b : a 혹은 b가 참인가?
	 * 	좌/우항 하나라도 참이면 참,둘다 거짓인경우 거짓
	 */
	public void test2_1() {
		
		int i = 3;
		System.out.println(i > 0 && i < 10);
		System.out.println(i == 0 || i < 10);
		
		int a = 1;
		int b = 1;
		System.out.println(a > 0 && ++b > 0); //둘다 참이므로 참
		System.out.println(a > 0 || ++b > 0); //좌항이 참이므로 우항은 볼필요도없다
		System.out.println(a == 0 || ++b > 0); //좌항이 거짓이므로 우항을 살펴봐야한다
		
		// &(AND) |(OR) 논리비교연산자
		// 좌항의 결과와 상과없이 우항을 무조건 검사
		a = 1;
		b = 1;
		System.out.println(a > 0 | ++b < 0); 
		System.out.println(a > 0 & ++b > 0); 
		
		
	}
	
	/*
	 * 삼항 연산자
	 * (논리식) ? (true일때 값) : (false일때 값)
	 * 
	 */
	public void test3() {
		
		System.out.println(10 > 3 ? "yes" : "no");
		int a = 10;
		int b = 5;
		int c = a > b ? a : b;
		System.out.println("c = " + c);
		
		//a는 b의 배수인가?
		String s = (a % b == 0) ? "a는 b의 배수입니다" : "a는 b의 배수가 아닙니다";
		System.out.println(s);
		
		//짝수,홀수 여부
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		System.out.println(num % 2 != 0 ? "홀수" : "짝수");
		
	}
	
	
	/*
	 * 복합 대입연산자
	 * +=
	 * -=
	 * *=
	 * /=
	 * %=		 
	 */
	public void test4() {
		
		int n = 10;
		n += 5; //n = n + 5
		System.out.println(n);
		
		n = 10;
		n -= 5;
		System.out.println(n);
		
		n = 3;
		n *= 3;
		System.out.println(n);
		
		n = 9;
		n /= 3;
		System.out.println(n);
		
		n = 10;
		n %= 4;
		System.out.println(n);
		
	}
	
	public void test5() {
		int a = 10;
		int b = a++; //10
		int c = b-- + b; //20
		int d = c++ + b; //28
		
		System.out.println("c = " + c + ",d = " + d);
		
	}
}
