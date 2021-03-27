package bookstore.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bookstore.gui.util.MyUtil;
/**
 * 유저의 아이디 및 비번찾기 화면
 */

public class UserSrchFrame extends JFrame {

	JPanel srchId;
	JPanel srchPwd;
	public static CustomPanel[] panels = new CustomPanel[2];
	
	
	public UserSrchFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//커스텀 패널(아이디찾기,비번찾기) 객체생성
		panels[0] = new CustomPanel(this,"아이디찾기"); 
		panels[1] = new CustomPanel(this,"비번찾기");
		
		add(panels[0]); //시작페이지(아이디찾기패널)
		
		
	}
	
	
}
