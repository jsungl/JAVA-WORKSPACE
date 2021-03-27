package kh.java.oop.access.modifier.class_;

/*
 * 의존관계
 * FruitRun --------> Apple
 * 사용클래스 -------> 피사용클래스
 * 
 */
public class FruitRun {
	
	public static void main(String[] args) {
		new Apple();
		//default class는 다른 패키지에서 접근할수없다
		//new PineApple();
	}
}
