package bookstore.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import bookstore.controller.BookController;
import bookstore.gui.util.MyUtil;
import bookstore.model.vo.User;

/**
 * 로그인 화면
 */

public class LoginFrame extends JFrame {
	
	private BookController bookCntrl = new BookController(); 
	//private List<User> checkList = new ArrayList<>(); //빈 리스트(체크용)
	private JTextField id; 
	private JPasswordField pwd;
	public static User loginUser; //로그인한 사용자 user객체
	private JLabel labelSrch;
	
	
	public LoginFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		//이미지 패널(배경화면) 사용		
		ImagePanel panel = new ImagePanel("images/background.png");
		panel.setLayout(null);
		
		JLabel labelId = new JLabel("아이디 : "); 
		labelId.setBounds(50, 100, 60, 50);
		
		id = new JTextField();
		id.setBounds(110, 100, 200, 50);
		
		JLabel labelPwd = new JLabel("비번 : "); 
		labelPwd.setBounds(50, 160, 60, 50);
		
		pwd = new JPasswordField(); 
		pwd.setBounds(110, 160, 200, 50);
		
		JButton loginBtn = new JButton("로그인"); 
		loginBtn.setBounds(320, 100, 100, 110);
		
		JButton joinBtn = new JButton("회원가입"); 
		joinBtn.setBounds(90, 250, 270, 50);
		
		JButton exitBtn = new JButton("종료"); 
		exitBtn.setBounds(90, 320, 270, 50);
		
		labelSrch = new JLabel("아이디 및 비번찾기");
		labelSrch.setBounds(170, 390, 200, 50);
		
		//binding
		loginBtn.addActionListener(new LoginBtnListener());
		joinBtn.addActionListener(new JoinBtnListener());
		exitBtn.addActionListener(new exitBtnListener());
		labelSrch.addMouseListener(new SrchUserListener());
		
		if(bookCntrl.checkBookStore().isEmpty()){ //가입한 유저가 없을경우(처음실행할때 1번실행됨)
			bookCntrl.bookStoreSet(); //책방책리스트 초기값 세팅(초기화)
	    }
		//bookCntrl.checkBookStore().equals(checkList)
		
		panel.add(labelId);
		panel.add(id);
		panel.add(labelPwd);
		panel.add(pwd);
		panel.add(loginBtn);
		panel.add(joinBtn);
		panel.add(exitBtn);
		panel.add(labelSrch);
		add(panel);
		
		
		
	}
	
	//아이디비번찾기 라벨이벤트
	public class SrchUserListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			ResetFrame();
			dispose();
			//UserSrchFrame 호출
			new UserSrchFrame(500,500,"아이디 및 비번찾기").setVisible(true); 
		}
		//라벨 마우스이벤트(마우스를 아이디 및 비번찾기 라벨에 올려놓으면 파란색으로 변경, 해제하면 검정색으로 변경)
		@Override
		public void mouseEntered(MouseEvent e) {
			labelSrch.setForeground(Color.blue);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			labelSrch.setForeground(Color.black);
		}
	}
	
	//종료버튼 이벤트
	public class exitBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//showOptionDialog(부모컴포넌트,메시지,타이틀,선택옵션,메시지타입,선택가능한값,기본선택값)
			int option = JOptionPane.showOptionDialog(LoginFrame.this,"프로그램을 종료하시겠습니까?","프로그램 종료",JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,null,null,null);
			if(option == JOptionPane.YES_OPTION)
				System.exit(0); //프로그램 종료
		}
		
	}
	
	//로그인버튼 이벤트
	public class LoginBtnListener implements ActionListener {
		
		boolean check = false;
		
		@Override
		public void actionPerformed(ActionEvent e) { 			
			String login_id = id.getText(); //아이디
			String login_pwd = new String(pwd.getPassword()); //패스워드
			
			if(login_id.equals("") || login_pwd.equals("")) { //둘중 하나라도 비어있는 경우
				JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 모두 입력하세요");
				ResetFrame();
			}else {
				// 파일에 저장되있는 유저정보와 맞는지 확인(controller 클래스의 loginSet메소드 호출)
				check = bookCntrl.loginSet(login_id, login_pwd); 
				if(check == true) { //리턴값이 true이면(유저정보와 일치할경우)
					JOptionPane.showMessageDialog(null, loginUser.getName() + "님이 로그인하였습니다");
					ResetFrame();
					dispose();
					//MainFrame 호출(사용자 책리스트 전달)
					new MainFrame(500, 600, "메인", loginUser.getUser_bList()).setVisible(true);
				}else {	
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호가 정확하지않습니다 ");
					ResetFrame();
				}
			}
			
		}
		
	}
	
	//가입버튼 이벤트
	public class JoinBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ResetFrame();
			dispose();
			new JoinFrame(500, 600, "회원가입").setVisible(true); //JoinFrame호출

		}
		
	}
	
	//초기화
	public void ResetFrame() {
		id.setText("");
		pwd.setText("");
		id.requestFocus();
	}
	
	
}
