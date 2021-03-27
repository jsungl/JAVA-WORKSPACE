package TestPanel;

import javax.swing.JFrame;

public class MyUtil {

	public static void init(JFrame f, int w, int h, String title) { //로그인화면처리

		f.setTitle(title);
		f.setSize(w, h);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
