package kh.java.thread;

public class CustomThread2 implements Runnable {

	private char ch;
	
	public CustomThread2(char ch) {
		this.ch = ch;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++) {
			System.out.print(ch);
		}
		System.out.print("<" + ch + "끝>");
	}

}
