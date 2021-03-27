package kh.java.thread;

public class MultipleThread implements Runnable {

	private int num;
	private long millis;
	
	public MultipleThread(int num,long millis) {
		this.num = num;
		this.millis = millis;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 100; i++) {
			int result = num * i;
			
			if(result > 100)
				return;
				
			try {
				Thread.sleep(millis); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
				
				
			System.out.println("[" + Thread.currentThread().getName() + " - " + result + "]");
			
			
		}
	}

}
