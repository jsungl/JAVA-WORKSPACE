package kh.java.thread.synchronization;

public class Account {

	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	
	
	/*
	 * 출금메소드 : atm기는 이 메소드를 통해 출금가능 
	 * 
	 * 동기화처리
	 * 결국 객체단위로 동기화처리 : account객체를 임계영역으로 설정하게된다
 	 * 1. synchronized 메소드 만들기
 	 *  - atm1이 출금할때 lock을가지고 출금(Runnable상태) atm2는 blocked상태로
 	 *  - atm1이 출금완료하면 lock을 반납하고 blocked상태로 atm2는 lock을가지고 출금(Runnable상태)
 	 * 2. synchronized block 사용하기(추천)
	 */
	public void withdraw(int money) {
		
		String threadName = Thread.currentThread().getName();
		
		synchronized(this) { //임계영역 설정(블럭)
			//먼저들어간 쓰레드가 자원을 선점하고 lock을 걸어 둡니다
		
			System.out.println("[" + threadName + " -> 잔액 : ￦" + balance);
			if(money <= balance) {
				balance -= money;
				System.out.println("[" + threadName + " -> 출금 : ￦" + money + ", 잔액 : ￦" + balance + "]");
			}else {
				System.out.println("[" + threadName + " -> 출금 : ￦" + money + ",잔액이 부족합니다]");
			}
		}
	}
	
	public int getBalance() {
		return balance;
	}
}
