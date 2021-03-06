package com.oop.constructor;

import java.util.Date;

/**
 * 생성자 constructor
 * new 연산자를 통해 호출되는 메소드
 * 객체 생성시 마지막에 호출되어 객체 필드 초기화 처리를 담당
 * 리턴타입이 없고, 클래스명과 동일해야한다
 * - 기본생성자 : 파라미터 생성자가 없다면 JVM에 의해 자동생성
 * 			  파라미터생성자가 하나라도 있다면 자동생성 안됨. 직접작성  
 * - 파라미터생성자 : 필드값을 넘겨받아서 한번에 값세팅
 * 
 * 기본생성자가 필요한이유
 * 1. 상속시 자식클래스에서 부모클래스의 기본생성자를 호출
 * 2. java ee 스펙에 따라 사용자 객체 생성시 내부적으로 호출
 * 
 */


public class User {

	private String userId;
	private String password;
	private Date regDate;
	
	//생성자안의 중복된 코드제거
	//다른생성자를 호출해서 생성자 안의 중복된 코드 제거
	//this()
	//딱 한번 맨 첫줄에서만 호출이 가능
	
	public User() {
		//기본 생성자 : 파라미터 없음
		System.out.println("User 객체 생성");
	}
	
	public User(String userId, String password, Date regDate) {
		//파라미터 생성자
		this(userId,password); //중복된 코드 제거용
		this.regDate = regDate;
		
	}
	
	public User(String userId,String password) {
		this.userId = userId;
		this.password = password;
	}
	
	
	public void printUser() {
		System.out.println(userId + ", " + password + ", " + regDate);
	}
	
	
	
	//getter setter 메소드 단축키 --> 마우스오른쪽버튼 -->source -->generate getter and setter 

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	
	
}
