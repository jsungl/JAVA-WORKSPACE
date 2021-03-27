package kh.java.polymorphism.animal;

public class Dog extends Animal implements Runnable,Bitable{

	public void kick() {
		System.out.println("킥날림");
	}
	
	@Override
	public void say() {
		System.out.println("안녕하세요 저는 개입니다");
	}
	
	@Override
	public void attack() {
		kick();	
	}
//인터페이스 메소드 구현	
	@Override
	public void run() {
		System.out.println("개가 뜁니다");
	}
	
	@Override
	public void bite(String str) {
		System.out.println("개가 뭅니다" + str);
	}
}
