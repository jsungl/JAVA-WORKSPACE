package kh.java.thread;

public class CustomThread1 extends Thread {

	private char ch;
	
	public CustomThread1(char ch) {
		this.ch = ch;
	}
	/*
	 * 쓰레드 작업내용
	 * 쓰레드 메인메소드 개념(시작과 끝을 의미)
	 */
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.print(ch);
		}
	}
}
