package exception;

public class Account {

	private String account;
	private double balance;
	private double interestRate;
	public Account() {
		
	}
	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance * interestRate * 0.01;
	}
	
	public void deposit(double money) throws Exception {
		if(money < 0) {
			throw new Exception("입급금액이 0보다 적습니다");
		}
	}
	
	public void withdraw(double money) throws Exception {
		if(money < 0 || money > balance) {
			throw new Exception("금액이 0보다 적거나 현재 잔액보다 많습니다");
		}
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
	
	
	
}
