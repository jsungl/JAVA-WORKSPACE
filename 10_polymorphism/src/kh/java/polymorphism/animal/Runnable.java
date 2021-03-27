package kh.java.polymorphism.animal;

/**
 * 컴파일된 결과는 Runnable.class로 클래스와 동일하다
 *
 */
public interface Runnable {

	//상수와 추상메소드만 가질 수 있다
	
	//public static final이 자동추가된다
	int LEGS = 4; //public static final이 앞에 생략되있다. 안써줘도 된다.
	
	//public abstract가 자동추가된다
	void run(); //public abstract가 앞에 생략됨.안써줘도됨
	
	
	
}
