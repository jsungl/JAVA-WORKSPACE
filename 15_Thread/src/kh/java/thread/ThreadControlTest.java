package kh.java.thread;

import javax.swing.JOptionPane;

public class ThreadControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadControlTest t = new ThreadControlTest();
		//t.test1();
		//t.test2();
		//t.test3();
		t.test4();
		System.out.println("[" + Thread.currentThread().getName() + "종료]");
	}
	
	public void test1() {
		Thread a = new Thread(new SleepThread('|',500)); //0.5초마다 찍어라(millisecond:천분의일초)
		Thread b = new Thread(new SleepThread('-',300)); //0.3초마다 찍어라
		
		a.setName("a쓰레드");
		
		a.start();
		b.start();
		
	}

	/*
	 * 3의 배수출력 쓰레드와 4의 배수출력 쓰레드를 생성하고 실행하세요
	 * [Thread이름 - 배수]로 출력
	 * 실행간격은 200밀리초
	 * 100초과시 중지할것
	 * 
	 */
	public void test2() {
		Thread a = new Thread(new MultipleThread(3,200)); //0.5초마다 찍어라(millisecond:천분의일초)
		Thread b = new Thread(new MultipleThread(4,200)); //0.3초마다 찍어라
		
		a.setName("3배수 쓰레드");
		b.setName("4배수 쓰레드");
		
		a.start();
		b.start();
	}
	
	
	/*
	 * 쓰레드간의 종속관계
	 * 일반쓰레드 - Daemon쓰레드
	 * 
	 * Daemon - linux계열의 컴퓨터에서 백그라운드 프로세스를 가리키는 말(윈도우에서 서비스같은것)
	 */
	public void test3() {
	
		Thread cnt = new CountDown(50); //50부터 카운트다운
		cnt.start();
//		
//		//main thread 일시정지
		JOptionPane.showMessageDialog(null, "확인을 누르면 메인쓰레드가 종료됩니다"); //확인버튼눌러야 메인쓰레드가 종료된다
		
		//Daemon쓰레드
//		Thread cnt = new CountDown(50);
//		cnt.setDaemon(true);
//		cnt.start();
		
//		JOptionPane.showMessageDialog(null, "확인을 누르면 메인쓰레드가 종료됩니다"); 
		//CountDown 쓰레드 진행중 확인버튼눌르면 CountDown 쓰레드는 진행중 종료된다
		
	}
	
	
	/*
	 * 쓰레드 종료시키기
	 * 1. interrupt() 메소드를 호출
	 * 2. InterruptedException 발생
	 * 3. catch절에 다음액션으로 종료를 작성
	 * 
	 */
	public void test4() {
		Thread cnt = new CountDown(20);
		cnt.start();
		
		JOptionPane.showMessageDialog(null, "확인을 누르면 카운트다운을 종료합니다");
		cnt.interrupt(); //확인버튼누르면 InterruptedException 발생
		
	}
	
	
	
	
	
	
	
	
	
	
}
