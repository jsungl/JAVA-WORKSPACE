package kh.java.oop.encapsulation.account;


/**
 * 캡슐화
 * 
 * 구조체의 단점을 극복한 클래스
 * - private 접근제한자를 사용해 field의 직접접근을 방지
 * - public 접근제한자를 사용한 method를 이용해 우회적으로 사용
 * 
 *
 */
public class Account {
	
	//private : 같은 클래스 내부에서만 접근 가능
	private String name; //계좌주인
	private long balance; //잔액

	//public method를 통해 우회접근
	//setter : 필드값을 세팅하기
	//this : 현재객체를 가리키는 메소드안의 숨은 참조값
	public void setName(String name_) {
		name = name_;
		//this.name = name;  this를 사용하면 이름충돌없이 사용가능,여기서는 생략불가능
	}
	public void setBalance(long balance_) {
		balance = balance_;
		//this.balance = balance;
	}
	
	//getter : 필드값 가져오기
	public String getName() {
		return name;
		//return this.name;인데 this 생략가능
	}
	public long getBalance() {
		return balance;
		//return this.name;인데 this 생략가능
	}
	
	//입금 method
	public void deposit(long money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "님 계좌에 " + money + "원이 입금되었습니다");
		}else
			System.out.println("잘못된 금액이 입력되었습니다");
	}
	
	//출금 method
	public void withdraw(long money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "님 계좌에 " + money + "원이 출금되었습니다");
		}else
			System.out.println("잔액이 부족합니다");
	}
}
