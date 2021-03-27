package kh.java.polymorphism.animal;

public class Eagle extends Animal implements Flyable{

	
	@Override
	public void fly() {
		System.out.println("독수리가 날다");
	}
	
	@Override
	public void attack() {
		System.out.println("독수리가 공격");
	}
	
	@Override
	public void say() {
		System.out.println("안녕하세요 저는 독수리입니다");
	}

	public static void main(String[] args) {
		Flyable f = new Eagle();
		f.fly();
		
		Eagle e = (Eagle)f;
		e.fly();
		e.attack();
		e.say();
	
		Animal a = e;
		a.say();
		a.attack();
		
	}
	
}
