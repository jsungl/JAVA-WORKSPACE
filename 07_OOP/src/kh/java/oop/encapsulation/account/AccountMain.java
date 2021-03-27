package kh.java.oop.encapsulation.account;

public class AccountMain {

	public static void main(String[] args) {

		Account a = new Account();
		//a.name = "홍길동";
		//a.setName("홍길동");
		a.setName(null);		
		System.out.println(a.getName());
		
		
		//a.balance = 1_000_000;
		a.setBalance(1_000_000);
		System.out.println(a.getBalance());
		
		//입금
		//a.balance += 500_000;
		a.deposit(500_000);
		//System.out.println(a.getName() + "님 계좌 잔액 : " + a.getBalance() + "원");
		
		//출금
		//a.balance -= 100_000;
		a.withdraw(100_000);
		//System.out.println(a.getName() + "님 계좌 잔액 : " + a.getBalance() + "원");

		
	}

}
