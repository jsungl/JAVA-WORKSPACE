package kh.java.object.array.person;

import java.util.Scanner;


/**
 * 
 * 연관관계
 * PersonManager는 Person을 field로써 참조한다
 * PersonManager ────────> Person
 * 
 *
 */

public class PersonManager {
	
	private Person[] arr = new Person[3]; //객체배열
	private Scanner sc = new Scanner(System.in); //필드로 선언하면 여러 클래스에서 공유가능
	
	//Person 정보 입력 메소드
	public void inputPerson() {
		for(int i = 0; i < arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 > ");
			String name = sc.next();
			System.out.print("나이 > ");
			int age = sc.nextInt();
			arr[i] = new Person(name,age); //Person클래스의 파라미터생성자 호출
			Person p = arr[i];
		}
	
	}
	
	//Person 정보 출력 메소드
	public void printPerson() {
		for(Person p : arr) {
			p.printPerson();
		}
		
	}
}
