package kh.java.email.controller;

import java.util.List;

import kh.java.email.io.EmailIO;
import kh.java.email.model.vo.Email;

public class EmailController {
	
	private EmailIO emailIO = new EmailIO();

	public void insertEmail(Email email) {
		emailIO.insertEmail(email); //IO클래스로 넘김
		
	}

	public List<Email> loadEmailList() {
		return emailIO.loadEmailList();
	}
	

}
