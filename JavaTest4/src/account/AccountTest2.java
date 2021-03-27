package account;

public class AccountTest2 {

	public static void main(String[] args) {
		Account[] accArr = new Account[5];
		
		for(int i = 0; i < accArr.length; i++) {
			accArr[i] = new Account("221-0101-211"+Integer.toString(i+1),100000,4.5);
		}
		
		for(int i = 0; i < accArr.length; i++) {
			accArr[i].accountInfo();
			System.out.println();
		}
		
		for(int i = 0; i < accArr.length; i++) {
			accArr[i].setInterestRate(3.7);
			accArr[i].accountInfo();
			System.out.println(" 이자: " + (int)accArr[i].calculateInterest() + "원");
		}
	}

}
