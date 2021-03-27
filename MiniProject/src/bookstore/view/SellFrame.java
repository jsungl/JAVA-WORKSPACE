package bookstore.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import bookstore.controller.BookController;
import bookstore.gui.util.MyUtil;
import bookstore.model.vo.Book;

/**
 * 판매화면
 */

public class SellFrame extends JFrame {
	
	public JComboBox<Book> bookCombo; //판매시 유저가 가지고있는 책리스트를 보여줄 콤보박스
	private BookController bookCntrl = new BookController(); 
	private Book b;
	private JTextField bookTitle;
	private JTextField bookAuthor;
	private JTextField bookPrice;
	private JTextField bookState;
	private JTextField bookNumber; 

	public SellFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
			
		ImagePanel panel = new ImagePanel("images/background.png");
		panel.setLayout(null);
		
		JLabel labelList = new JLabel(LoginFrame.loginUser.getName() + "님의  책 ");
		labelList.setBounds(180, 50, 100, 30);		
		
		bookCombo = new JComboBox(LoginFrame.loginUser.getUser_bList().toArray());
		bookCombo.setBounds(100, 100, 270, 30);
		
		JLabel labelName = new JLabel("이름 : ");
		labelName.setBounds(50, 150, 50, 30);
		
		bookTitle = new JTextField();
		bookTitle.setBounds(110,150,130,30);
		bookTitle.setEditable(false); 
		
		JLabel labelAuthor = new JLabel("저자 : "); 
		labelAuthor.setBounds(50, 190, 50, 30);
		
		bookAuthor = new JTextField(); 
		bookAuthor.setBounds(110, 190, 130,30);
		bookAuthor.setEditable(false);
		
		JLabel labelPrice = new JLabel("포인트 : "); 
		labelPrice.setBounds(50, 230, 50, 30);
		
		bookPrice = new JTextField(); 
		bookPrice.setBounds(110, 230, 130,30);
		bookPrice.setEditable(false);
		
		JLabel labelState = new JLabel("상태 : "); 
		labelState.setBounds(50, 270,50,30);
		
		bookState = new JTextField();
		bookState.setBounds(110, 270, 130,30);
		bookState.setEditable(false);
		
		JLabel labelNumber = new JLabel("개수 : ");
		labelNumber.setBounds(50, 310, 50, 30);
		
		bookNumber = new JTextField();
		bookNumber.setBounds(110, 310, 130,30);
		
		JButton sellBtn = new JButton("판매"); 
		sellBtn.setBounds(100, 400, 270, 50);
		
		JButton backBtn = new  JButton("메인");
		backBtn.setBounds(100, 480, 270, 50);
		
		//binding
		bookCombo.addActionListener(new bookComboListener());
		sellBtn.addActionListener(new sellBtnListener()); 
		backBtn.addActionListener(new backBtnListener());
		
		panel.add(labelList);
		panel.add(bookCombo);
		panel.add(labelName);
		panel.add(labelAuthor);
		panel.add(labelPrice);
		panel.add(labelState);
		panel.add(labelNumber);
		panel.add(bookTitle);
		panel.add(bookAuthor);
		panel.add(bookPrice);
		panel.add(bookState);
		panel.add(bookNumber);
		
		panel.add(sellBtn);
		panel.add(backBtn);
		add(panel);
	}
	//콤보박스 액션
	public class bookComboListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//콤보박스에서 선택한 값을 읽어와 텍스트필드에 입력
			b = (Book)bookCombo.getSelectedItem();
			bookTitle.setText(b.getTitle());
			bookAuthor.setText(b.getAuthor());
			bookPrice.setText(Integer.toString(b.getPoint()));
			bookState.setText(b.getState());
			bookNumber.setText(Integer.toString(b.getCount()));
		}
	}
	
	//메인버튼 액션
	public class backBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			resetFrame();
			dispose();
			//MainFrame 호출(사용자 책리스트 전달)
			new MainFrame(500, 600, "메인", LoginFrame.loginUser.getUser_bList()).setVisible(true);
		}
		
	}
	
	//판매버튼 액션
	public class sellBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String chk = ((JButton)e.getSource()).getText();
			if(chk.equals("판매")) {  //판매버튼 눌렀을때
				if(b == null){ //선택하지않고 판매버튼 눌렀을경우
					JOptionPane.showMessageDialog(null, "판매할 책을 선택해주세요");
				}else { 
					//판매할 책 개수가 가지고있는 책 개수보다 많은경우 or 0권을 판매하려고 할 경우
					if(Integer.parseInt(bookNumber.getText()) > b.getCount() || Integer.parseInt(bookNumber.getText()) <= 0) {
						JOptionPane.showMessageDialog(null, "판매할 개수를 다시 입력해주세요");
						bookNumber.setText(Integer.toString(b.getCount())); //선택한 책의 개수를 다시 텍스트필드에 입력 
					}else {
						//판매할 책정보를 가진 book객체 생성 
						b = new Book(bookTitle.getText(),bookAuthor.getText(),
								Integer.parseInt(bookPrice.getText()),bookState.getText(),Integer.parseInt(bookNumber.getText()));
						//controller sell메소드에 유저객체와 book객체 전달
						bookCntrl.sell(LoginFrame.loginUser,b);
						JOptionPane.showMessageDialog(null, "판매완료하였습니다");
						resetFrame();
						dispose();
						//sellFrame호출
						new SellFrame(500,600,"판매").setVisible(true);
					}
				}
			}
			
		}
	}
	
	
	//초기화
	public void resetFrame() {
		bookCombo.setSelectedIndex(0);
		bookTitle.setText("");
		bookAuthor.setText("");
		bookPrice.setText("");
		bookState.setText("");
		bookNumber.setText("");
	}
	
}
