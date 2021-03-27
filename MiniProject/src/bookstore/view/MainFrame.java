package bookstore.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import bookstore.gui.util.MyUtil;
import bookstore.model.vo.Book;

/**
 * 메인화면
 */
public class MainFrame extends JFrame{
	
	private List<Book> user_bList;
	private List<Book> defaultList;
	private ImagePanel panel;

	public MainFrame(int w, int h, String title, List<Book> list) {
		
		MyUtil.init(this, w, h, title);
		if(list == null)
			list = LoginFrame.loginUser.getUser_bList();
		user_bList = list; //사용자 책리스트를 인자로 받아 저장
		panel = new ImagePanel("images/background.png"); //배경이미지 panel사용
		panel.setLayout(null);
		//버튼에 사용되는 ImageIcon
		ImageIcon registIcon = new ImageIcon("images/regist.png");
		ImageIcon userIcon = new ImageIcon("images/user.png");
		ImageIcon buyIcon = new ImageIcon("images/buy.png");
		ImageIcon sellIcon = new ImageIcon("images/sell.png");
		//버튼을 눌렀을때 사용되는 ImageIcon
		ImageIcon changeRegist = new ImageIcon("images/changeRegist.png");
		ImageIcon changeBuy = new ImageIcon("images/changeBuy.png");
		ImageIcon changeSell = new ImageIcon("images/changeSell.png");
		ImageIcon changeUser = new ImageIcon("images/changeUser.png");
		
		
		JButton registBtn = new JButton(registIcon);
		registBtn.setBounds(70, 70, 150, 150);
		registBtn.setContentAreaFilled(false);
		registBtn.setPressedIcon(changeRegist);
		
		
		JButton infoBtn = new JButton(userIcon);
		infoBtn.setBounds(270, 70, 150, 150);
		infoBtn.setContentAreaFilled(false);
		infoBtn.setPressedIcon(changeUser);
		
		
		JButton buyBtn = new JButton(buyIcon);
		buyBtn.setBounds(60, 290, 150, 150);
		buyBtn.setContentAreaFilled(false);
		buyBtn.setPressedIcon(changeBuy);

		
		JButton sellBtn = new JButton(sellIcon);
		sellBtn.setBounds(270, 290, 150, 150);
		sellBtn.setContentAreaFilled(false);
		sellBtn.setPressedIcon(changeSell);
		
		// binding
		registBtn.addActionListener(new registBtnListener());
		infoBtn.addActionListener(new infoBtnListener());
		buyBtn.addActionListener(new buyBtnListener());
		sellBtn.addActionListener(new sellBtnListener());
		
		//버튼테두리 없애기
		registBtn.setBorderPainted(false); 
        infoBtn.setBorderPainted(false);
        buyBtn.setBorderPainted(false);
        sellBtn.setBorderPainted(false);
		
		
		panel.add(registBtn);
		panel.add(infoBtn);
		panel.add(buyBtn);
		panel.add(sellBtn);
		add(panel);
		
				
	}
	
	// 등록버튼 이벤트
	public class registBtnListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new RegistFrame(500, 600, "등록").setVisible(true); //RegistFrame 호출
		}
		
	}
	
	// 내정보버튼 이벤트
	public class infoBtnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new InfoFrame(500,600,"사용자 정보",user_bList).setVisible(true); //InfoFrame 호출(인자로 사용자책리스트 전달)
		}
		
	}
	
	// 구매버튼 이벤트
	public class buyBtnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new BuyFrame(500, 600, "구매",defaultList).setVisible(true); //BuyFrame 호출(인자로 빈리스트 전달)
		}
		
	}
	
	// 판매버튼 이벤트
	public class sellBtnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(LoginFrame.loginUser.getUser_bList().isEmpty()) //현재 로그인한 유저의 책리스트가 비어있는경우(등록된 책이 없는경우)
				JOptionPane.showMessageDialog(null, "등록한 책이 없습니다. 등록먼저 해주세요"); 
			else {
				dispose();
				new SellFrame(500, 600, "판매").setVisible(true); //SellFrame 호출
			}
		}
	}
	
	
}
