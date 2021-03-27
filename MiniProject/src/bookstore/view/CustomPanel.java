package bookstore.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bookstore.controller.BookController;
import bookstore.gui.util.MyUtil;


public class CustomPanel extends JPanel{

	private JFrame parent;
	public JLabel labelId = new JLabel("아이디 찾기");
	public JLabel labelPwd = new JLabel("비번 찾기");
	JTextField textName = new JTextField("가입된 이름");
	JTextField textId = new JTextField("가입된 아이디");
	JButton idBtn = new JButton("아이디 찾기");
	JButton pwdBtn = new JButton("비번 찾기");
	JButton backBtn = new JButton("돌아가기");
	private BookController cntrl = new BookController();
	
	public CustomPanel(JFrame parent, String title) {
	
		
		this.parent = parent;
		setLayout(null);
		add(new JLabel(title));
		ImagePanel linkPanel = new ImagePanel("images/background.png");
		linkPanel.setBounds(0, 0, 500, 500);
		linkPanel.setLayout(null);
		

		
		labelId.setBounds(100, 50, 100, 30);
		Font font1 = new Font("맑은고딕",Font.BOLD,15);
		labelId.setFont(font1);
		labelPwd.setBounds(210, 50, 100, 30);
		Font font2 = new Font("맑은고딕",Font.BOLD,15);
		labelPwd.setFont(font2);
		
		labelId.setFocusable(true); //라벨로 포커스이동
		
		if(title.equals("아이디찾기")) { //아이디찾기 패널일때
			textName.setBounds(100,110,260,50);
			idBtn.setBounds(150,200 , 150, 50);
			backBtn.setBounds(150, 270, 150, 50);
			linkPanel.add(labelId);
			linkPanel.add(labelPwd);
			linkPanel.add(textName);
			linkPanel.add(idBtn);
			linkPanel.add(backBtn);
			
		}else if(title.equals("비번찾기")) { //비번찾기 패널일때
			textId.setBounds(100,110,260,50);
			pwdBtn.setBounds(150,200 , 150, 50);
			backBtn.setBounds(150, 270, 150, 50);
			linkPanel.add(labelId);
			linkPanel.add(labelPwd);
			linkPanel.add(textId);
			linkPanel.add(pwdBtn);
			linkPanel.add(backBtn);
		}
		
		
		add(linkPanel); 
		
		labelPwd.addMouseListener(new srchPwdListener());
		labelId.addMouseListener(new srchIdListener());
		backBtn.addActionListener(new backBtnListener());
		textName.addFocusListener(new NameFoucsListener());
		textId.addFocusListener(new IdFocusListener());
		idBtn.addActionListener(new idBtnListener());
		pwdBtn.addActionListener(new pwdBtnListener());
		
	}
	//아이디찾기 버튼 이벤트
	public class idBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(textName.getText().equals("") || textName.getText().equals("가입된 이름")) {
				JOptionPane.showMessageDialog(null, "가입된 이름을 입력해주세요");
				textName.setText("가입된 이름");
			}else {
				//controller클래스의 userIdFind메소드에 가입된 이름을 인자로 보내고 리턴값을 받는다
				String findId = cntrl.userIdFind(textName.getText()); 
				if(findId.equals(""))
					JOptionPane.showMessageDialog(null, "가입된 정보가 없습니다");
				else
					JOptionPane.showMessageDialog(null, findId);
				textName.setText("가입된 이름");
			}
		}
		
	}
	//비번찾기 버튼 이벤트
	public class pwdBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(textId.getText().equals("") || textId.getText().equals("가입된 아이디")) {
				JOptionPane.showMessageDialog(null, "가입된 아이디를 입력해주세요");
				textId.setText("가입된 아이디");
			}else {
				//controller클래스의 userPwdFind메소드에 가입된 아이디를 인자로 보내고 리턴값을 받는다
				String findPwd = cntrl.userPwdFind(textId.getText());
				if(findPwd.equals(""))
					JOptionPane.showMessageDialog(null, "가입된 아이디가 없습니다");
				else
					JOptionPane.showMessageDialog(null, findPwd);
				textId.setText("가입된 아이디");
			}
		}
		
	}
	
	//텍스트필드 이벤트
	public class IdFocusListener implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			textId.setText(""); //포커스를 얻으면 아이디를 입력받을 준비
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			
		}
		
	}
	
	//텍스트필드 이벤트
	public class NameFoucsListener implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			textName.setText(""); //포커스를 얻으면 이름을 입력받을 준비
		}

		@Override
		public void focusLost(FocusEvent e) {
			
		}
		
	}
	
	//취소버튼 이벤트
	public class backBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			parent.dispose();
			new LoginFrame(500,500,"로그인").setVisible(true); //LoginFrame호출
			
		}
		
	}
	
	//패스워드찾기 라벨 이벤트
	public class srchPwdListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			JPanel nextPanel = UserSrchFrame.panels[1]; //패스워드 찾기 패널
			MyUtil.changePanel(parent,CustomPanel.this, nextPanel); //패널교체
			textName.setText("가입된 이름");
			
		}
		//라벨 마우스이벤트(마우스를 라벨에 놓으면 색변경,라벨에서 벗어나면 원래색으로 변경)
		@Override
		public void mouseEntered(MouseEvent e) {
			labelPwd.setForeground(Color.blue); 
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			labelPwd.setForeground(Color.black);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			labelPwd.setForeground(Color.black);
		}
	}
	
	//아이디찾기 라벨 이벤트
	public class srchIdListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			JPanel nextPanel = UserSrchFrame.panels[0]; //아이디찾기 패널
			MyUtil.changePanel(parent,CustomPanel.this, nextPanel); //패널교체
			textId.setText("가입된 아이디");
			
		}
		//라벨 마우스이벤트(마우스를 라벨에 놓으면 색변경,라벨에서 벗어나면 원래색으로 변경)
		@Override
		public void mouseEntered(MouseEvent e) {
			labelId.setForeground(Color.blue);
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			labelId.setForeground(Color.black);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			labelId.setForeground(Color.black);
		}
	}
	

}
