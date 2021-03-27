package kh.java.collection.map.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * properties : 옛날것이지만 아직 많이쓰이는중
 * key,value 타입을 String, String으로 제한한 map
 * - 파일 입출력메소드를 지원
 * - 설정정보 표현에 최적의 형태
 */
public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertiesTest p = new PropertiesTest();
		//p.test1();
		p.test2();
	}
	
	
	/*
	 * 입력
	 */
	public void test1() {
		Properties  prop = new Properties();
		prop.setProperty("url", "http://localhost:9090/kh-java");
		prop.setProperty("userName", "hoggd");
		prop.setProperty("password", "1234");
		
		System.out.println(prop); //저장된 순서는 보장되지않는다
		
		//파일에저장
		//.properties
		//.xml
		
		try {
			prop.store(new FileWriter("userInfo.properties"), "userInfo.properties");//두번째인자는 그냥주석(설명)
//			prop.storeToXML(new FileOutputStream("userInfo.xml"), "userInfo.xml"); //.xml
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	
	/*
	 * 출력
	 */
	public void test2() {
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("userInfo.properties")); //prop에 적재
//			prop.loadFromXML(new FileInputStream("user.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(prop); //순서가 바뀌어서 출력
		
		//1. 요소가져오기
		String url = prop.getProperty("url");
		String userName = prop.getProperty("userName");
		String password = prop.getProperty("password");
		System.out.println(url + ", " + userName + ", " + password);
		
		//2. 전체 열람 메소드 Enumeration타입
		Enumeration<?> en = prop.propertyNames(); //?는 모든타입처리 , name(key)모음
		while(en.hasMoreElements()) {
			String name = (String)en.nextElement();
			String value = prop.getProperty(name);
			System.out.println(name + "= " + value);
		}
		
		
	}

}
