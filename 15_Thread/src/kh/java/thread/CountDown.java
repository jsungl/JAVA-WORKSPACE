package kh.java.thread;

public class CountDown extends Thread {

	private int num;
	
	public CountDown(int num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		
		for(int i = num; i >= 0; i--) {
			System.out.println(i);
			
//			delay(100);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				//e.printStackTrace();
				break; //Exception발생시 바로 쓰레드종료
			}
		}
		System.out.println("[" + Thread.currentThread().getName() + "종료]");

	}
	
//	public void delay(long millis) {
//		
//		try {
//			Thread.sleep(millis);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
