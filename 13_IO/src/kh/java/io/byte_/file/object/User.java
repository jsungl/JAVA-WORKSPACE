package kh.java.io.byte_.file.object;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 직렬화 할 수 있는 Serializable
 * 
 * 객체 입출력 스트림에서 사용되어질 객체는 반드시 직렬화(Serializable)을 구현해야한다
 * 그렇지않으면 NotSerializableException을 발생시킨다
 *
 */


public class User implements Serializable{
	
	//필드도 직렬화를 구현해놨어야한다
	private String id;
	private String password;
	private String name;
	private Calendar regDate;
//	private transient String password2; //객체 입출력 스트림에서 해당값을 전송하지 않는다(민감한 정보) -> 저장할때부터 빼고 저장한다 -> 출력화면에서 null로 처리됨
	
	
	
	public User() {
		
	}
	public User(String id, String password, String name, Calendar regDate) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.regDate = regDate;
	}
	
	//getter,setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getRegDate() {
		return regDate;
	}
	public void setRegDate(Calendar regDate) {
		this.regDate = regDate;
	}
	
	
	
	
	//Source - generate toString()
	//toString() 오버라이드
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//sdf.applyPattern("yyyy년 MM월 dd일");
		
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", regDate=" + 
						sdf.format(regDate.getTime()) + "]";
	}
	
	
	
}
