package kh.java.gui.swing.container.layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import kh.java.gui.util.MyUtil;

public class NullLayoutTest extends JFrame{
	
	private JTextField id; //내부클래스에서도 접근할수있도록 전역변수로 지정
	private JPasswordField pwd;

	public NullLayoutTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//layout 무효화
		setLayout(null);
		
		JLabel labelId = new JLabel("아이디 : "); //아이디라벨
		labelId.setBounds(50, 100, 60, 50);
		
		id = new JTextField(); //아이디 텍스트필드
		id.setBounds(110, 100, 200, 50);
		
		JLabel labelPwd = new JLabel("비번 : "); //비밀번호 라벨
		labelPwd.setBounds(50, 160, 60, 50);
		
		pwd = new JPasswordField(); //비밀번호 텍스트필드
		pwd.setBounds(110, 160, 200, 50);
		
		JButton loginBtn = new JButton("로그인"); //로그인 버튼
		loginBtn.setBounds(320, 100, 100, 110);
		
		
		//사용자가 로그인버튼을 클릭했을때 입력한 id,pwd를 가져오기
		//사용자 Event + EventHandling
		//1. 이벤트처리객체 생성(클래스작성)
		//2. btn컴포넌트와 연결(binding)
		loginBtn.addActionListener(new LoginBtnListener());
		
		add(labelId);
		add(id);
		add(labelPwd);
		add(pwd);
		add(loginBtn);
	}
	
	/*
	 * JButton용 action event handler클래스 생성
	 * 
	 * event handler
	 * =event listener
	 */
	public class LoginBtnListener implements ActionListener {
		//내부클래스 1. 이벤트처리객체생성(클래스작성)
		
		//JButton의 ActionEvent가 발생시 자동호출되는 메소드
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("버튼을 클릭하셨습니다");
			//사용자입력 id,pwd가져오기
			System.out.println("id : " + id.getText());
			System.out.println("pwd : " + new String(pwd.getPassword()));
			//dispose(); //해당프레임 종료
			
		}
		
	}
	
	
	
	public static void main(String[] args) {

		new NullLayoutTest(500,500,"로그인").setVisible(true);
	}

}
