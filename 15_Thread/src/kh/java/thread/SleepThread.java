package kh.java.thread;

public class SleepThread implements Runnable {

	private char ch;
	private long millis; //밀리초
	
	public SleepThread(char ch,long millis) {
		this.ch = ch;
		this.millis = millis;
	}
	
	
	@Override
	public void run() {

		for(int i = 0; i < 100; i++) {
			System.out.print(ch);
			
			
			try {
				//현재쓰레드를 TIMED-WATING 상태로 변경
				Thread.sleep(millis); //해당밀리초만큼 쉬었다가 다시 Runnable상태로
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//쓰레드명 출력
		System.out.println(Thread.currentThread().getName());
	}

}
