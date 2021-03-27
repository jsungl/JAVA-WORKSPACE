package kh.java.inner.class_;

import kh.java.inner.class_.OuterClass.A;

/**
 * 
 * 내부클래스
 * 1. static 내부클래스
 * 2. non-static 내부클래스
 * 3. 지역 내부클래스
 * 
 * 목적
 * - 외부클래스 안에서만 사용할때
 * - 외부클래스의 자원(private자원)에 쉽게 접근하기위해
 * 
 * 
 */


public class OuterClass {
	
	private int num;
	private static int snum = 99;
	
	//생성자(내부에서 접근할때)
	public OuterClass() {
		new A().aaa();
		//non-static에서는 static자원에 접근이 가능하다
		new B().bbb();
		test();
	}
	
	
	
	//non-static 내부클래스
	public class A {
		public void aaa() {
			System.out.println(num);
			System.out.println(snum);
		}
	}
	
	//static 내부클래스
	public static class B {
		public void bbb() {
//			System.out.println(num); //non-static 자원접근불가
			System.out.println(snum);
		}
	}
	
	
	/*
	 * 지역내부클래스는 지역변수와 마찬가지로 접근제한자를 가질수없다
	 */
	public void test() {
		class C {
			public void ccc() {
				System.out.println(num);
				System.out.println(snum);
			}
		}
		
		//외부에서 지역내부클래스를 호출하려면 이런방법밖에 없다
		//클래스선언이 먼저다
		C c = new C();
		c.ccc();
	}
	
	
	public static void main(String[] args) {

		new OuterClass(); //내부에서 사용할때 
		
	}

}
