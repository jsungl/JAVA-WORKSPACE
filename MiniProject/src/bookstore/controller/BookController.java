package bookstore.controller;

import java.util.List;

import bookstore.io.BookIO;
import bookstore.model.vo.Book;
import bookstore.model.vo.User;

/**
 * 0. 책방 셋팅
 * 	0-1. 책방 초기 셋팅
 * 	0-2. 책방 초기 셋팅 체크
 *  0-3. 책방 목록 불러오기
 *  
 * 1. Login 뷰 
 * 	1-1. 회원가입 
 * 	1-2. 로그인 
 *  1-3. 아이디 찾기
 *  1-4. 비밀번호 찾기
 * 
 * 2. Main 뷰
 *  2-1. 검색
 *  2-2. 등록
 *  2-3. 구매
 *  2-4. 판매
 */
public class BookController {
	
private BookIO bookIO = new BookIO(); //IO클래스의 객체
	
	// 0-1. 책방 초기 책리스트 셋팅
	// 프로그램 첫 실행시에 한번만 적용
	public void bookStoreSet() {
		bookIO.bookStoreSet();
	}
	
	// 0-2. 책방 초기셋팅 체크용
	// 가입한 유저가 있으면 초기셋팅 중지
	public List checkBookStore() {
		return bookIO.fileRead("user");
	}
	
	// 0-3. 책방 책 목록 불러오기
	// 현재 책방 책 리스트 리턴
	public List<Book> loadStoreBookList() {
		return bookIO.fileRead("book");
	}
	
	
	// 1-1. 회원가입
	// 회원가입용 유저 객체 정보 필요
	public boolean addUser(User user) {
		return bookIO.add(user);
	}
		
	// 1-2. 로그인 정보 체크(id, pwd)
	// 로그인 체크용 id, pwd 필요
	// id, pwd 비교체크 후 결과 반환, true시 static user에 로그인한 유저 할당
	public boolean loginSet(String login_id, String login_pwd) {
		return bookIO.loginSet(login_id, login_pwd);
	}
	
	// 1-3. 유저 아이디 찾기
	// 찾으려는 유저 이름값 필요
	// 비교 후 맞으면 아이디 리턴 
	public String userIdFind(String name) {
		return bookIO.userInfoFind(name, "id");
	}
	
	// 1-4. 유저 비밀번호 찾기
	// 찾으려는 유저 아이디값 필요
	// 비교 후 맞으면 비밀번호 리턴 
	public String userPwdFind(String id) {
		return bookIO.userInfoFind(id, "pwd");
	}

	
	// 2-1. 검색 뷰
	// 검색할 책 이름 정보 필요
	// 동일한 책이름 리스트 검색후 반환
	public List<Book> bookSerch(String name){
		return bookIO.serch(name);
	}
	
	// 2-2. 등록 뷰
	// 로그인한 유저 정보, 등록하려는 책 정보 필요
	// 등록한후 유저가 가진 리스트 반환
	public List<Book> addBook(User user, Book book) {	
		return bookIO.registration(user, book);
	}
	
	// 2-3. 구매 뷰
	// 로그인한 유저 정보, 사려는 책 정보가 필요
	// 구매 성공여부 리턴
	public boolean buy(User user, Book book) {
		return bookIO.buy(user, book);
	}
		
	// 2-4. 판매 뷰
	// 로그인한 유저 정보, 팔려는 책 정보가 필요
	public void sell(User user, Book book) {
		bookIO.sell(user, book);
	}
	
}
