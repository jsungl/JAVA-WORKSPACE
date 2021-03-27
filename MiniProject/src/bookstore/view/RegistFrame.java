package bookstore.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bookstore.controller.BookController;
import bookstore.gui.util.MyUtil;
import bookstore.model.vo.Book;

/**
 * 등록화면
 */

public class RegistFrame extends JFrame {
	public JTextField bookTitle;
	public JTextField bookAuthor;
	public JTextField bookPrice;
	public JTextField bookState;
	public JTextField bookNumber;  
	public JComboBox statesCombo; //등록시 책상태 콤보박스
	private List<Book> list;
	private BookController bookCntrl = new BookController();
	private String selectState;

	public RegistFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
				
		ImagePanel panel = new ImagePanel("images/background.png");
		panel.setLayout(null);
		
		JLabel labelTitle = new JLabel("이름 : ");
		labelTitle.setBounds(100, 40, 60, 50);
	
		bookTitle = new JTextField();
		bookTitle.setBounds(160,40,200,50);
		
		JLabel labelAuthor = new JLabel("저자 : "); 
		labelAuthor.setBounds(100, 100, 60, 50);
		
		bookAuthor = new JTextField(); 
		bookAuthor.setBounds(160, 100, 200, 50);
		
		JLabel labelPrice = new JLabel("포인트 : "); 
		labelPrice.setBounds(100, 160, 60, 50);
		
		bookPrice = new JTextField(); 
		bookPrice.setBounds(160, 160, 200, 50);
		
		JLabel labelState = new JLabel("상태 : "); 
		labelState.setBounds(100, 220, 60, 50);
		
		String[] states = { "등급","최상급","상급", "중급", "하급"};
		statesCombo = new JComboBox(states);
		selectState = states[0]; 
		statesCombo.setBounds(160, 220, 200, 50);
		
		JLabel labelNumber = new JLabel("개수 : ");
		labelNumber.setBounds(100, 280, 60, 50);
		
		bookNumber = new JTextField();
		bookNumber.setBounds(160, 280, 200, 50);
				
		
		JButton registBtn2 = new JButton("등록"); 
		registBtn2.setBounds(100, 350, 270, 50);
		
		JButton backBtn = new JButton("메인"); 
		backBtn.setBounds(100, 420, 270, 50);
		
		//binding
		statesCombo.addActionListener(new statesComboListener()); 
		registBtn2.addActionListener(new registBtnListener());
		backBtn.addActionListener(new backBtnListener());
		
		panel.add(labelTitle);
		panel.add(labelAuthor);
		panel.add(labelPrice);
		panel.add(labelState);
		panel.add(labelNumber);
		panel.add(bookTitle);
		panel.add(bookAuthor);
		panel.add(bookPrice);
		panel.add(statesCombo);
		panel.add(bookNumber);
		panel.add(registBtn2);
		panel.add(backBtn);
		add(panel);
	}
	
	//상태 콤보박스 이벤트
	public class statesComboListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//상태콤보박스에서 선택한 값을 저장
			selectState = (String)statesCombo.getSelectedItem();
		}
		
	}
	
	//메인버튼 이벤트
	public class backBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			resetFrame();
			dispose();
			//MainFrame 호출(유저책리스트전달)
			new MainFrame(500, 600, "메인", list).setVisible(true);
			
		}
		
	}
	
		
	//등록버튼 이벤트
	public class registBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String chk = ((JButton)e.getSource()).getText();
			if(chk.equals("등록")) { 
				//등록시 빈칸이 하나라도 있을경우(+상태 콤보박스에서 아무것도 선택하지않았을경우)	
				if(bookTitle.getText().equals("") || bookAuthor.getText().equals("") || bookPrice.getText().equals("")
						|| bookNumber.getText().equals("")|| selectState.equals("등급"))
					JOptionPane.showMessageDialog(null, "모두 입력 및 선택해주세요");
				else {
					//등록하려는 책 정보를 받아 book객체 생성
					Book book = new Book(bookTitle.getText(),bookAuthor.getText(),
							Integer.parseInt(bookPrice.getText()),selectState,
							Integer.parseInt(bookNumber.getText()));
					//controller에 addBook메소드 호출(인자로 사용자객체와 book객체 전달)
					list = bookCntrl.addBook(LoginFrame.loginUser,book); 
						
					JOptionPane.showMessageDialog(null, "등록완료하였습니다");						
					resetFrame();
					dispose();
					//registFrame호출(사용자책리스트 전달)
					new RegistFrame(500,600,"등록").setVisible(true);
				}
			}
		}
	}
	
	//초기화
	public void resetFrame() {
		bookTitle.setText("");
		bookAuthor.setText("");
		bookPrice.setText("");
		statesCombo.setSelectedIndex(0);
		bookNumber.setText("");
	}
	
	
		
		
}
