package exception;

public class AccountTest {

	public static void main(String[] args) {

		Account account = new Account("441-0290-1203",500000.0,7.3);
		System.out.println("계좌정보 : " + account.getAccount() + " " + account.getBalance() + " " + account.getInterestRate());
		
		try {
			account.deposit(-10); //exception
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			account.withdraw(600000); //exception	
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("이자 : " + account.calculateInterest());
	}

}
