package kh.java.gui.util;

import javax.swing.JFrame;
import javax.swing.JPanel;

import kh.java.gui.swing.change.panel.CustomPanel;

public class MyUtil {

	public static void init(JFrame f, int w, int h, String title) {

		f.setTitle(title);
		f.setSize(w, h);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void init2(JFrame f, int w, int h, String title) {

		f.setTitle(title);
		f.setSize(w, h);
		f.setLocation(1000, 250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void changePanel(JFrame parent, CustomPanel current, JPanel next) {
		parent.remove(current);
		parent.add(next);
		
		parent.revalidate(); //container하위 계층구조를 새로고침
		parent.repaint(); //화면다시 그리기
	}
}
