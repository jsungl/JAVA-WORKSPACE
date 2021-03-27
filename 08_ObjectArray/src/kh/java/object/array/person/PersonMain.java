package kh.java.object.array.person;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		PersonMain pm = new PersonMain();
		//pm.test1();
		//pm.test2();
		pm.test3();
	}
	
	public void test1() {
		//1.객체 배열 선언
		Person[] arr = new Person[3];
		
		//2.객체를 각각 할당
		//할당하기전 선언된 배열의 초기값은 null
		arr[0] = new Person("kiko",20);
		arr[1] = new Person("jiro",52);
		arr[2] = new Person("ui",44);
		
		//3.출력
		for(int i = 0; i < arr.length; i++) {
			//arr[i].printPerson();
			Person p = arr[i]; //변수 p에 arr배열의 주소값을 전달
			p.printPerson();
		}
	
	}
	
	/*
	 * 초기화 객체 배열 선언
	 */
	public void test2() {
		
		Person[] arr = {
				new Person("kiko",20),
				new Person("jiro",52),
				new Person("ui",44)
		}; //배열선언과 동시에 할당
		
		//향상된 for문(forEach문)
		for(Person p : arr) {
			p.printPerson();
		}
	}
	
	/*
	 * 사용자 입력받아서 3명의 Person정보를 배열에 담고 출력하세요
	 * 파라미터 생성자를 이용해서 객체 생성할것
	 */
	public void test3() {
		//1.입력
		Person[] arr = new Person[3];
		
		for(int i = 0; i < arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 > ");
			String name = sc.next();
			System.out.print("나이 > ");
			int age = sc.nextInt();
			arr[i] = new Person(name,age);
			
		}
		 
		//2.출력
		for(Person p : arr) {
			p.printPerson();
		}
		
	}

	
	
	
}
