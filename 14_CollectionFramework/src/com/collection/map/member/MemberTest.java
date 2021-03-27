package com.collection.map.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class MemberTest {
	
	Map<String,Member> map = new HashMap<String,Member>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTest mt = new MemberTest();
		mt.test1();
		mt.test2();
		mt.test3();
		mt.test4();
	}
	
	public MemberTest() {
		map.put("1", new Member("honggd","1234","홍길동",35,"01012341234"));
		map.put("2", new Member("sinsa","1234","신사임당",50,"01012341234"));
		map.put("3", new Member("leess","1234","이순신",43,"01012341234"));
		map.put("4", new Member("yooon","1234","윤봉길",37,"01012341234"));
		map.put("5", new Member("jangbg","1234","장보고",29,"01012341234"));
	}
	
	public void test1() {
		String menu = "==================================================\r\n"
				 	+ "아이디	비밀번호	이름	나이	전화번호\r\n"
				 	+ "--------------------------------------------------\r\n";
		System.out.println(menu);
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			Member value = map.get(key);
			System.out.println(value);
		}
		System.out.println("--------------------------------------------------");
	}
	
	public boolean isUserExist(String userId) {
		
		if(map.containsValue(new Member(userId))) //
			return true;
		else
			return false;
	}
	
	public void test2() {
		System.out.println();
		System.out.println("janbg is Existence? " + isUserExist("jangbg"));
		System.out.println("sejong is Existence? " + isUserExist("sejong"));
	}
	
	public void test3() {
//		if(map.containsValue(new Member("yooon")))	
//			//map.replace("4",new Member("yooon","1234","윤봉길",37,"01012341234") , new Member("yooon","5678","윤동주",27,"01034563456"));
//			map.put("4", new Member("yooon","5678","윤동주",27,"01034563456"));
		Member m = map.get("4");
		m.setUserId("yooon");
		m.setUserPwd("5678");
		m.setUserName("윤동주");
		m.setAge(27);
		m.setPhoneNumber("01034563456");
		//System.out.println(m);
		test1();
	}
	
	public void test4() {
		map.remove("2");
		System.out.println();
		test1();
	}

}
