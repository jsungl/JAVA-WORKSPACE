package kh.java.email.model.vo;

import java.io.Serializable;

/**
 * 실제 데이터가 담길곳
 *
 */
public class Email implements Serializable{

	private String email;

	public Email() {
		
	}
	
	public Email(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Email [email=" + email + "]";
	}
	
	
}
