package com.thread.alphabet;

public class UpperAlphbetThread implements Runnable{

	private long millis;
	
	public UpperAlphbetThread(long millis) {
		this.millis = millis;
	}
	
	
	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		char c = 'A';
		while(c >= 'A' && c <= 'Z') {
			System.out.println(thName + " : " + c);
			c++;
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
				//break; //Exception발생시 바로 쓰레드종료
			}
		}
	}
}
