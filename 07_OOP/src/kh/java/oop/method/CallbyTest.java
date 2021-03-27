package kh.java.oop.method;


/**
 * call by value : 값을 전달(기본형)
 * 
 * call by reference : 주소값을 전달(참조형)
 * -String은 예외 --> String은 참조형이지만 call by value로 처리된다
 * 
 *
 */

class Sample{
	int num;
}
public class CallbyTest {

	public static void main(String[] args) {

		int a = 10;
		int[] arr = {1,2,3,4,5};
		
		CallbyTest c = new CallbyTest();
		c.test1(a); //call by value
		System.out.println(a);
		c.test2(arr); //call by reference
		System.out.println(arr[0]);
		Sample s = new Sample();
		s.num = 99;
		c.test4(s); //call by reference
		System.out.println(s.num);
	}

	public void test1(int x) {
		System.out.println(x);
		x = 20;
	}
	
	public void test2(int[] arr) {
		arr[0] *= 100;
	}
	
	public void test4(Sample sp) {
		sp.num *= 100;
	}
	
}
