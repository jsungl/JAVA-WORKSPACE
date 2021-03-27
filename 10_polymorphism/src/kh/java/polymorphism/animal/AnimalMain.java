package kh.java.polymorphism.animal;

public class AnimalMain {

	public static void main(String[] args) {

		AnimalMain am = new AnimalMain();
		//am.test1();
		//am.test2();
		//am.test3();
		
		//다형성의 활용
		//1. 매개변수 선언부
		//am.test4();
		
		
		//2.리턴값 처리
		//am.test5();
		
		//동적바인딩
		am.test6();
		
		//am.test7();
		
		//am.test8();
	}

	/*
	 * 자식객체를 부모타입의 참조변수에 담아 제어할 수 있다
	 * 단, 자식클래스에 선언된 자원은 사용될 수 없다
	 * 
	 */
	
	public void test1() {
		
		Cat cat = new Cat();
		cat.say();
		cat.punch();
		
		Animal animal1 = cat;
		System.out.println(cat == animal1); //true
		animal1.say();
//		animal1.punch(); //부모타입 변수에 담으면 자식클래스의 선언된 자원(필드,메소드)를 사용할수없다
		
		Object obj1 = cat;
//		obj1.say();
//		obj1.punch();
		
		System.out.println("-------------------------");
		//다시 자식타입의 변수에 담으면 자식타입의 자원 사용 가능
		Animal animal2 = (Animal)obj1;
		animal2.say(); //Animal에 있는 say()를 사용할수있다
//		((Animal)obj1).say(); //위 2줄을 한줄로 요약하여 사용할수있다(괄호필수)
		
		Cat cat2 = (Cat)animal2;
		cat2.say();
		cat2.punch();
//		((Cat)obj1).say();
//		((Cat)obj1).punch();
		
	}
	
	
	
	/*
	 * 형변환
	 * - upcasting : 부모타입으로 형변환, 자동(암묵적)형변환(cat -> animal)
	 * - downcasting : 자식타입으로 형변환, 수동(명시적)형변환(animal -> cat)
	 * 
	 */
	public void test2() {
		
		Animal animal = new Dog(); //upcasting
		Dog dog = (Dog)animal; //downcasting
		dog.kick();
	}
	
	
	/*
	 * 
	 * 부모타입의 배열에 자식객체를 담을 수 있다
	 * 
	 */
	public void test3() {
		
		Animal[] arr = new Animal[3];
		arr[0] = new Cat();
		arr[1] = new Dog();
		//arr[2] = new Animal(); //위 2줄같이 보통 자식타입만 대입한다
		arr[2] = new Cat();
		
		System.out.println(arr[0] instanceof Cat); //true
		System.out.println(arr[0] instanceof Dog); //false
		System.out.println(arr[0] instanceof Animal); //true
		System.out.println(arr[0] instanceof Object); //true
		
		for(Animal animal : arr) {
			animal.say();
			//instanceof : 해당타입의 객체인경우 true리턴
			//true가 리턴되면 해당타입으로의 안전한 형변환 보장 -> ClassCastException이 안생긴다
			//Cat객체인 경우
			if(animal instanceof Cat)
				((Cat)animal).punch(); //확인후 형변환할것
			//Dog객체인 경우
			else if(animal instanceof Dog)
				((Dog)animal).kick();
		}
	}
	
	
	public void test4() {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		attack(cat);
		attack(dog);
	}
	
	public void attack(Animal animal) { //부모타입객체를 받는 메소드를 만들면 아래 두개의 메소드를 따로 만들필요가 없음
		if(animal instanceof Cat)
			((Cat)animal).punch();
		else if(animal instanceof Dog)
			((Dog)animal).kick();
	}
	
//	//Overloading
//	public void attack(Cat cat) {
//		cat.punch();
//	}
//	public void attack(Dog dog) {
//		dog.kick();
//	}
	
	
	//리턴값을 다형성 이용해서 처리하기
	public void test5() {
//		Animal cat = makeCat();
//		Animal dog = makeDog();
		
		Animal[] arr = new Animal[100];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0)
				arr[i] = makeDog();
			else
				arr[i] = makeCat();
		}
		
		for(Animal animal : arr) {
			attack(animal);
		}
	}
	
	public Cat makeCat() {
		return new Cat();
	}
	
	public Dog makeDog() {
		return new Dog();
	}
	
	
	/*
	 * 동적바인딩이 일어날수있는 조건
	 * 1. 상속 & 부모클래스의 메소드 오버라이딩
	 * 2. 자식객체를 부모타입으로써 제어, 해당 메소드 호출
	 * 자동으로 자식타입의 재작성한 메소드가 호출된다
	 * downcasting없이 자식메소드 사용가능
	 * 
	 * 정적바인딩
	 * 동일한 타입의 메소드가 호출된다
	 * 
	 */
	public void test6() {
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		a1.say(); //자식클래스에서 오버라이딩한 메소드가 호출된다(동적바인딩)
		a2.say();
		
		//다형성을 이용한 attack
		Animal[] arr = new Animal[100];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0)
				arr[i] = makeDog();
			else
				arr[i] = makeCat();
		}
		
		for(Animal animal : arr)
			animal.attack(); //실제 실행하면 오버라이딩한 자식클래스의 메소드가 호출된다
		
	}
	
	
	/*
	 * 추상클래스 Animal
	 */
	public void test7() {
//		Animal a = new Animal(); //추상클래스는 객체화 할 수 없다
		Animal a = new Cat(); //이건 가능
		Animal b = new Dog();
		
		//추상클래스 Animal을 상속한 자식클래스는 무조건 추상메소드 attack구현을 보장받는다
		a.attack();
		b.attack();
	}

	
	
	/*
	 * 인터페이스는 객체화 할 수 없다
	 * 인터페이스 역시 부모타입으로 다형성을 적용할 수 없다
	 * 
	 */
	public void test8() {
//		Runnable r = new Runnable();
		Runnable r1 = new Dog();
		Runnable r2 = new Cat();
		
		r1.run();
		r2.run();
	
		//사용불가 메소드
//		r1.say(); //Animal의 재작성메소드
//		r1.attack(); //Animal의 재작성메소드
//		r1.kick(); //Dog의 kick
		
		((Dog)r1).say();
		((Dog)r1).attack();
		((Dog)r1).kick();
		
		//상수
		System.out.println(Runnable.LEGS);
		
		
		Bitable b1 = new Dog();
		Bitable b2 = new Cat();
		b1.bite("멍멍~");
		b2.bite("냐옹~");
		
		System.out.println("----------------");
		
		Dog d1 = (Dog)b1;
		d1.attack();
		d1.bite("멍멍");
		d1.kick();
		d1.say();
		
		System.out.println("-----------------");
		
		Animal a1 = d1;
		a1.attack();
		a1.say();
	}
}
