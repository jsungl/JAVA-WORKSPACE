package bookstore.gui.util;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bookstore.view.CustomPanel;

/**
 * JFrame을 상속한 커스텀 클래스 객체를 전달받아 프레임 그리기
 *
 */
public class MyUtil {

	public static void init(JFrame f, int w, int h, String title) { //로그인화면처리

		f.setTitle(title);
		f.setSize(w, h);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void changePanel(JFrame parent, CustomPanel current, JPanel next) {
		parent.remove(current);
		parent.add(next);
		
		parent.revalidate(); //container하위 계층구조를 새로고침
		parent.repaint(); //화면다시 그리기
	}
}
