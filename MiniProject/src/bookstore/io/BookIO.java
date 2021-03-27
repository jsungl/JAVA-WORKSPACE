package bookstore.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import bookstore.model.vo.Book;
import bookstore.model.vo.User;
import bookstore.view.JoinFrame;
import bookstore.view.LoginFrame;

/**
 * 0. 셋팅 
 *  0-1. 책방 초기 셋팅
 *  0-2. 로그인 유저 셋팅
 * 
 * 1. 파일 
 * 	1-1. 파일쓰기
 *  1-2. 파일읽기
 * 
 * 2. 기능 
 * 	2-1. 추가
 * 	2-2. 조회
 * 	2-3. 삭제 
 * 	2-4. 검색 
 * 	2-5. 등록 
 * 	2-6. 구매 
 * 	2-7. 판매 
 * 	2-8. 유저 책 리스트 수정, 저장
 *  2-9. 유저 아이디, 비밀번호 찾기
 */
public class BookIO {

	File bookFile = new File("book/bookStoreList.txt"); // 책방 관리 파일
	File userFile = new File("user/userList.txt"); // 유저 관리 파일
	List<Book> bList = new ArrayList<>(); // 책방 목록
	List<User> uList = new ArrayList<>(); // 유저 목록
	String path = null; // 파일 경로

	// 0-1. 책방 초기셋팅
	public void bookStoreSet() {
		// 책방 책이 없을경우 초기 설정 (프로그램 첫실행)
		bList.add(new Book("햄릿", "윌리엄 셰익스피어", 7000, "최상", 2));
		bList.add(new Book("파우스트", "요한 볼프강 폰 괴테", 8000, "상", 1));
		bList.add(new Book("동물농장", "조지 오웰", 6000, "상", 3));
		bList.add(new Book("아라비안 나이트", "리처드 F.버턴", 11000, "중", 1));
		bList.add(new Book("해리 포터와 불의 잔", "J. K. 롤링", 8500, "상", 2));
		bList.add(new Book("왕좌의 게임", "조지 R.R 마틴", 16000, "최상", 4));
		bList.add(new Book("아마존에서 살아남기", "최덕희, 강경효", 4000, "하", 1));
		bList.add(new Book("원피스", "오다 에이치로", 3000, "중", 4));
		bList.add(new Book("수학의 정석", "홍성대", 13000, "최상", 5));
		bList.add(new Book("만개의 레시피", "만개의 레시피", 14000, "최상", 1));
		bList.add(new Book("아몬드", "손원평", 5000, "중", 1));
        bList.add(new Book("슬레이어즈", "칸자카 하지메", 2000, "하", 2));
        bList.add(new Book("달빛조각사", "남희성", 3000, "상", 13));
        bList.add(new Book("JAVA의 정석", "남궁성", 20500, "최상", 31));
        bList.add(new Book("이상한 나라의 엘리스", "루이스 캐롤", 23000, "하", 2));
        bList.add(new Book("삼국지", "나관중", 10000, "상", 50));
        bList.add(new Book("안네의 일기", "안네 프랑크", 5000, "상", 2));
        bList.add(new Book("돈 키호테", "미겔 데 세르반테스 사아베드라", 14000, "최상", 1));
        bList.add(new Book("모비 딕", "허먼 멜빌", 15000, "하", 1));
        bList.add(new Book("허클베리 핀의 모험", "마크 트웨인", 8000, "중", 1));
		fileWrite("book");
	}

	// 0-2 로그인 유저 셋팅
	public boolean loginSet(String id, String pwd) {
		fileRead("user"); // 유저 목록 읽어오기
		for (User u : uList) { // 읽어온 목록에서 해당 유저 찾기
			if (u.getId().equals(id) && u.getPwd().equals(pwd)) {
				LoginFrame.loginUser = u; // 해당유저면 static유저에 셋팅
				return true;
			}
		}
		return false;
	}

	// 1-1. 파일 쓰기
	public List fileWrite(String name) {
		// 쓸 파일 구분, book or user
		if (name.equals("book"))
			path = "book/bookStoreList.txt"; // 쓸파일 경로 설정
		else if (name.equals("user"))
			path = "user/userList.txt";

		// 파일쓰기
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(path)));) {
			if (name.equals("book")) { // 책파일일 경우
				for (Book b : bList) // 책 파일에 덮어쓰기
					oos.writeObject(b);
			} else if (name.equals("user")) { // 유저파일일 경우
				for (User u : uList) // 유저 파일에 덮어쓰기
					oos.writeObject(u);
			}
		} catch (IOException e) {
		}
		if (name.equals("book"))
			return bList;  
		else if (name.equals("user"))
			return uList; 
		return null;
	}

	// 1-2. 파일 읽기
	public List fileRead(String name) {
		if (name.equals("book")) { // 책파일 읽기일 경우
			path = "book/bookStoreList.txt";
			bList = new ArrayList<Book>(); // 책 리스트 초기화
		} else if (name.equals("user")) { // 유저 파일 읽기일 경우
			path = "user/userList.txt";
			uList = new ArrayList<User>(); // 유저 리스트 초기화
		}
		// 파일 읽기
		try (ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(path)));) {
			while (true) {
				// 책 파일일 경우
				if (name.equals("book")) {
					Book book = (Book) ois.readObject();
					bList.add(book); 
					// 유저 파일일 경우
				} else if (name.equals("user")) {
					User user = (User) ois.readObject();
					uList.add(user);
				}
			}
		} catch (IOException | ClassNotFoundException e) {
		}
		if (name.equals("book"))
			return bList;
		else if (name.equals("user"))
			return uList;

		return null;
	}

	// 2-1. 추가
	public boolean add(Object obj) {
		// 책방 책 추가
		if (obj instanceof Book) {
			fileRead("book");
			// 기존목록에 같은 등급의 책이있을경우 카운트만 수정
			for (Book b : bList) {
				if (b.equals(obj)) {
					b.setCount(b.getCount() + ((Book) obj).getCount());
					fileWrite("book");
					return true;
				}
			}
			// 기존목록에 없을경우 새로 추가
			bList.add((Book) obj); // bList에 책 추가
			fileWrite("book"); // 추가된 bList로 파일 저장

			// 유저 추가
		} else if (obj instanceof User) {
			fileRead("user"); // 유저목록 읽어오기
			// 동일 아이디 체크
			for (User u : uList) {
				if (u.getId().equals(((User) obj).getId()))
					return false;
			}
			uList.add((User) obj); // uList에 유저 추가
			fileWrite("user"); // 추가된 uList로 파일 저장
			return true;
		}
		return false;
	}

	// 2-2. 조회
	public List load(String list) {
		// 유저 책 목록 조회 경우
		if (list.equals("userbook")) {
			fileRead("user");
			for (User u : uList) {
				if (u.equals(LoginFrame.loginUser))
					return u.getUser_bList();
			}
		}
		// 유저목록, 책목록 조회 경우
		return fileRead(list);
	}

	// 2-3. 삭제
	public void delete(Object obj) {
		if (obj instanceof Book) { // 책방 책 삭제
			bList.remove(obj);
			fileWrite("book");
		}
		if (obj instanceof User) { // 유저 삭제
			uList.remove(obj);
			fileWrite("user");
		}
	}

	// 2-4. 검색
	public List serch(String name) {
		List<Book> serchBook = new ArrayList<Book>(); // 검색한 책 결과 임시저장 리스트
		fileRead("book"); // 현재 책방목록 불러오기
		for (Book b : bList) {
			if (b.getTitle().contentEquals(name)) // 같은 책 제목 검색 
				serchBook.add(b);
		}
		return serchBook;
	}

	// 2-5. 등록 (유저 책 등록)
	public List registration(User user, Book book) {
		boolean flag = true; // 같은책 체크용
		// 책 리스트가 없을 경우 바로등록
		if (user.getUser_bList().size() == 0) {
			user.getUser_bList().add(book);
		} else { // 책 리스트가 있을경우(추가 또는 권수수정) 
			for (Book b : user.getUser_bList()) { // 책 리스트에서 같은 책 확인
				if (b.equals(book)) { // 같은한 책 있을시
					b.setCount(b.getCount() + book.getCount()); // 권수 증가
					flag = false;
					break;
				}
			}
			// 같은 책이 없을시 새책 추가
			if (flag)
				user.getUser_bList().add(book);
		}

		// 유저 책리스트 수정부분 파일쓰기
		userBookListSave(user);

		// 변경된 리스트 리턴
		return user.getUser_bList();
	}

	// 2-6. 구매
	public boolean buy(User user, Book book) {

		// 구매 불가능시 -> 유저 포인트가 구입 포인트 보다 적은경우
		if (user.getPoint() < book.getPoint() * book.getCount())
			return false;

		// 구매 가능시
		// 책방 책 수정
		fileRead("book"); // 책목록 불러오기
		for (Book b : bList) {
			if (b.equals(book)) { // 같은책 접근
				if (b.getCount() != book.getCount()) // 기존 권수와 구입하려는 갯수 확인
					b.setCount(b.getCount() - book.getCount()); // 권수 수정
				else
					delete(book); // 전체 권수 구입시 책목록에서 삭제
				break;
			}
		}
		fileWrite("book"); // 책목록 덮어쓰기
		// 유저 포인트 차감
		user.setPoint(user.getPoint() - book.getPoint() * book.getCount());
		// 유저 책 수정
		bList = registration(user, book);
		// 유저 책리스트 수정부분 파일쓰기
		userBookListSave(user); 
		return true;
	}

	// 2-7. 판매
	public void sell(User user, Book book) {
		// 유저 책 리스트 수정
		fileRead("user"); // 유저목록 불러오기
		for (User u : uList) { // 유저파일에서 로그인 유저부분 접근
			if (u.equals(user)) {
				for (Book b : user.getUser_bList()) { // 유저 책 목록 접근
					if (b.equals(book)) { // 같은 책 접근
						b.setCount(b.getCount() - book.getCount()); // 판매 권수 만큼 수정
						if (b.getCount() == 0)  // 권수만큼 다판경우
							user.getUser_bList().remove(book); // 책삭제
						break;
					}
				}
			}
		}
		// 유저 포인트 추가
		user.setPoint(user.getPoint() + book.getPoint() * book.getCount());
		userBookListSave(user); // 로그인한 유저 책 리스트 수정분 파일저장

		// 책방 리스트 수정
		add(book);
	}

	// 2-8. 로그인유저 책 리스트 수정
	public void userBookListSave(User user) {
		fileRead("user"); // 유저목록 불러오기
		for (User u : uList) { // 유저파일에서 로그인 유저부분 접근
			if (u.equals(user)) {
				u.setUser_bList(user.getUser_bList()); // 로그인한 유저 책리스트 수정분 덮어쓰기
				u.setPoint(user.getPoint()); // 포인트 수정분 덮어쓰기
				fileWrite("user"); // 유저파일 덮어쓰기
				break;
			}
		}
	}
	
	// 2-9. 유저 아이디, 비밀번호 찾기
    public String userInfoFind(String find, String target) {
        fileRead("user"); // 유저 리스트 불러오기

        // 아이디 찾기
        if(target.contentEquals("id")) {
            for(User u : uList)  // 유저리스트에서 해당 이름 찾기
                if(u.getName().contentEquals(find)) 
                    return u.getId(); // 이름이 같으면 id 리턴
        // 비밀번호 찾기
        }else if(target.contentEquals("pwd")) {
            for(User u : uList)  // 유저 리스트에서 해당 id 찾기
                if(u.getId().contentEquals(find)) 
                    return u.getPwd(); // id가 같으면 pwd리턴
        }
        return ""; // 동일한 이름, 아이디 없을경우 ""리턴
    }

}
