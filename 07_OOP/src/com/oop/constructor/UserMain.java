package com.oop.constructor;

import java.util.Date;

public class UserMain {

	public static void main(String[] args) {

		//1. 기본생성자 + setter 호출
		User u = new User(); //지금까지 new연산자를 통해 생성자(User()) 호출이였음
		u.setUserId("hogged");
		u.setPassword("1234");
		u.setRegDate(new Date());
		u.printUser();
		
		//2. 파라미터 생성자
		User u2 = new User("sinsa","5678",new Date());
		u2.printUser();
		
		//아이디와 비번만 설정하고싶을때 아이디만 받는 파라미터를 따로 만든다
		User u3 = new User("sejong","1234");
		u3.printUser();
		
	}

}
