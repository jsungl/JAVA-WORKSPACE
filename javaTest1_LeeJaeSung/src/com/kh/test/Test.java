package com.kh.test;

import com.kh.test.person.model.vo.Person;

public class Test {

	public static void main(String[] args) {

		Person[] arr = new Person[3];
		arr[0] = new Person("kane",'남');
		arr[1] = new Person("dele",'여');
		arr[2] = new Person("son",'남');
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
	}

}
