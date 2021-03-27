package bookstore.run;

import bookstore.view.LoginFrame;

/**
 * 실행클래스
 *
 */
public class BookRun {

	public static void main(String[] args) {

		new LoginFrame(500,500,"로그인").setVisible(true);
		System.out.println("확인용");
	}
	
	
	
}
