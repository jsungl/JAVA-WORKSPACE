package com.collection.map.member;

import java.util.Objects;

import kh.java.collection.set.Person;

public class Member {

	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private String phoneNumber;
	
	public Member() {
		
	}
	public Member(String userId, String userPwd, String userName, int age, String phoneNumber) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	public Member(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return userId + "  " + userPwd + "  " + userName + "  "+ age + "  " + phoneNumber ;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(userId);
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(this == o)
			return true;
		
		if(o == null || o instanceof Member == false)
			return false;
		
		Member other = (Member)o;
		
		if(userId == null) { 
			
			if(other.userId != null)
				return false;
			
		}else {
			if(userId.equals(other.userId) == false)
				return false;
		}
		
		return true;
	}
	
}
