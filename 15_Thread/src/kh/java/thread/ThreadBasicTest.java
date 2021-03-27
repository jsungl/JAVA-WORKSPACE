package kh.java.thread;

public class ThreadBasicTest {

	public static void main(String[] args) {

		ThreadBasicTest t = new ThreadBasicTest();
		//t.test0();
		//t.test1();
		t.test2();
		System.out.print("메인끝");
	}

	/*
	 * 싱글 쓰레드
	 */
	public void test0() {
		//작업A
		for(int i = 0; i < 100; i++) {
			System.out.println('|');
		}
		
		//작업B
		for(int i = 0; i < 100; i++) {
			System.out.println('-');
		}
		//A실행 후 B실행
	}
	
	/*
	 * 쓰레드 생성방법
	 * 1. Thread 클래스 상속
	 * 
	 */
	public void test1() {
		Thread th1 = new CustomThread1('|');
		Thread th2 = new CustomThread1('-');
	
		//우선순위 지정(1~10) 기본값5 -> 크게 달라지진 않음
//		th2.setPriority(10);
		th2.setPriority(Thread.MAX_PRIORITY);
		th1.setPriority(Thread.MIN_PRIORITY);

		//작업시작
		th1.start(); 
		th2.start();
		//매번 결과가 다를수있다(Thread 작업순서지정 불가 os가 관장)
	
		
	
	}
	
	
	/*
	 * 쓰레드 생성방법2
	 * Runnable 인터페이스 구현
	 */
	public void test2() {
		Runnable run1 = new CustomThread2('|');
		Runnable run2 = new CustomThread2('-');
		
		Thread th1 = new Thread(run1);
		//Thread th1 = new Thread(new CustomThread2('|')); 와 같다
		Thread th2 = new Thread(run2);
		//Thread th2 = new Thread(new CustomThread2('-')); 와 같다
		
		th1.start();
		th2.start();
		
	}
	
	
	
	
	
	
	
	
	
}
