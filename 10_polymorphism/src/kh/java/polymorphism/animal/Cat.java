package kh.java.polymorphism.animal;

public class Cat extends Animal implements Runnable,Bitable{
	
	public void punch() {
		System.out.println("냥냥펀치");
	}

	@Override
	public void say() {
		System.out.println("안녕하세요 저는 고양이입니다");
	}
	
	@Override
	public void attack() {
		punch();	
	}
//인터페이스 메소드 구현
	@Override
	public void run() {
		System.out.println("고양이가 뜁니다");
	}
	
	@Override
	public void bite(String str) {
		System.out.println("고양이가 뭅니다" + str);
	}
}
