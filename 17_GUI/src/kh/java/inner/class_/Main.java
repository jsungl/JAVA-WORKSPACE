package kh.java.inner.class_;

public class Main {

	public static void main(String[] args) {

		OuterClass outer = new OuterClass();
		OuterClass.A a = outer.new A(); //멤버 내부클래스
		a.aaa();
		
		OuterClass.B b = new OuterClass.B(); //static 내부클래스
		b.bbb();
		
		//지역내부클래스는 외부에서 절대접근할수없다.
		outer.test(); //메소드 호출만 할수있다

	}

}
