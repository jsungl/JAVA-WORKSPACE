package bookstore.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import bookstore.model.vo.Book;
import bookstore.model.vo.User;

/**
 * 회원가입화면
 *
 */

public class JoinFrame extends JFrame {
	
	private JTextField id,name; 
	private JPasswordField pwd;
	private BookController bookCntrl = new BookController();
	
	
	public JoinFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
				
		ImagePanel panel = new ImagePanel("images/background.png"); //배경이미지 panel 사용
		panel.setLayout(null);
		
		JLabel labelName = new JLabel("이름 : ");
		labelName.setBounds(100, 50, 60, 50);
	
		name = new JTextField();
		name.setBounds(170,50,200,50);
		
		JLabel labelId = new JLabel("아이디 : "); 
		labelId.setBounds(100, 120, 60, 50);
		
		id = new JTextField(); 
		id.setBounds(170, 120, 200, 50);
		
		JLabel labelPwd = new JLabel("비번 : "); 
		labelPwd.setBounds(100, 180, 60, 50);
		
		pwd = new JPasswordField(); 
		pwd.setBounds(170, 190, 200, 50);

		JButton joinBtn = new JButton("회원가입"); 
		joinBtn.setBounds(100, 300, 270, 50);
		
		JButton backBtn = new JButton("취소");
		backBtn.setBounds(100, 370, 270, 50);
		
		
		joinBtn.addActionListener(new JoinBtnListener());  
		backBtn.addActionListener(new backBtnListener()); 
		
		
		panel.add(labelName);
		panel.add(name);
		panel.add(labelId);
		panel.add(id);
		panel.add(labelPwd);
		panel.add(pwd);
		panel.add(joinBtn);
		panel.add(backBtn);
		add(panel);

	}
	
	//메인버튼 이벤트
	public class backBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			resetFrame();
			dispose();
			new LoginFrame(500,500,"로그인").setVisible(true);
			
		}
		
	}
	
	//가입버튼 이벤트
	public class JoinBtnListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String join_name = name.getText();
			String join_id = id.getText();
			String join_pwd = new String(pwd.getPassword());
			boolean check; // 회원 아이디 중복 체크 용
			
			//비어있는 칸이 있는경우
			if(join_name.equals("") || join_id.equals("") || join_pwd.equals("")) {
				JOptionPane.showMessageDialog(null, "빈칸없이 모두 입력해주세요");
			}else {
				LoginFrame.loginUser = new User(join_name,join_id,join_pwd,50000); //초기포인트 50000

				// bookCtrl에서 아이디 중복체크후 결과 리턴받음 -> check
				check = bookCntrl.addUser(LoginFrame.loginUser);
				// 아이디 중복이 아닐경우
				if (check) {
					// 완료됐다는 메시지
					JOptionPane.showMessageDialog(null, "환영합니다 가입축하 50000포인트가 충전되었습니다");
					resetFrame();
					dispose();
					//MainFrame호출(인자로 사용자책리스트 전달)
					new MainFrame(500, 600, "메인",LoginFrame.loginUser.getUser_bList()).setVisible(true); 
				}else { //중복일 경우(이미 가입되어있는 경우)
					JOptionPane.showMessageDialog(null, "이미가입된 아이디입니다");
					resetFrame();
				}
			}
		}
		
	}
	
	
	// 초기화
	public void resetFrame() {
		name.setText("");
		id.setText("");
		pwd.setText("");
	}
	
	
	
}
