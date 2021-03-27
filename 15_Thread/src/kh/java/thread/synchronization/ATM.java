package kh.java.thread.synchronization;

public class ATM extends Thread {

	private Account acc;

	public ATM(Account acc) {
		super();
		this.acc = acc;
	}
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) { //잔액이 남아있다면
			int money = (int)(Math.random() * 3 + 1) * 100; //100,200,300원 중 하나
			acc.withdraw(money);
			
			try {
				Thread.sleep(1500); //1.5초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "종료");
	}
	
}
