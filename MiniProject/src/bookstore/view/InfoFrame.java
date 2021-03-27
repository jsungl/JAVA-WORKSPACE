package bookstore.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import bookstore.gui.util.MyUtil;
import bookstore.model.vo.Book;
import bookstore.view.InfoFrame.backBtnListener;
import bookstore.view.InfoFrame.logoutBtnListener;

/**
 * 사용자정보 화면
 */
public class InfoFrame extends JFrame {

	private JTable table;
	private List<Book> user_bList;
	private DefaultTableModel model;
	
	public InfoFrame(int w, int h, String title,List<Book> list) {
		MyUtil.init(this, w, h, title);
		ImagePanel panel = new ImagePanel("images/background.png");
		panel.setLayout(null);
		
		user_bList = list; //사용자책리스트 받아옴
		
		JLabel labelName = new JLabel("이름 : "); 
		labelName.setBounds(190, 10, 50, 50);
		
		JLabel UserName = new JLabel(LoginFrame.loginUser.getName()); 
		UserName.setBounds(240, 10, 200, 50);
		
		JLabel labelId = new JLabel("아이디 : "); 
		labelId.setBounds(190, 40, 50, 50);
		
		JLabel UserId = new JLabel(LoginFrame.loginUser.getId()); 
		UserId.setBounds(240, 40, 200, 50);
		
//		JLabel labelPwd = new JLabel("비번 : "); 
//		labelPwd.setBounds(190, 70, 50, 50);
//		
//		JLabel UserPwd = new JLabel(LoginFrame.loginUser.getPwd());
//		UserPwd.setBounds(240, 70, 200, 50);
//		
		JLabel labelBalance = new JLabel("포인트 : "); 
		labelBalance.setBounds(190, 70, 50, 50);
		//190 100 50 50
		JLabel UserBalance = new JLabel(Integer.toString(LoginFrame.loginUser.getPoint())); 
		UserBalance.setBounds(240, 70, 200, 50);
		//240 100 200 50
		
		String[] book = {"이름", "저자", "포인트", "상태", "권수"}; //테이블 컬럼정보
        String[][] contents = new String[user_bList.size()][book.length];
        for(int i = 0; i < user_bList.size(); i++) {
        	Book b = user_bList.get(i);
        	contents[i][0] = b.getTitle();
        	contents[i][1] = b.getAuthor();
        	contents[i][2] = Integer.toString(b.getPoint());
        	contents[i][3] = b.getState();
        	contents[i][4] = Integer.toString(b.getCount());        	
        }
        
        model = new DefaultTableModel(contents,book) {
            public boolean isCellEditable(int i, int c) {
                   return false;
               }
       };
        table = new JTable(model); 
        //헤더클릭시 정렬기능
        table.setAutoCreateRowSorter(true);//컬럼정보를 오름차순,내림차순 정렬할수있음
        table.setPreferredScrollableViewportSize(new Dimension(500,50)); //view port지정
        table.setFillsViewportHeight(true);// 컨테이너의 전체 높이를 테이블이 전부 사용하게끔 설정한다.
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//테이블안에서 여러개 드래그하지 못하게 설정
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50,150,370,200);

        JButton backBtn = new  JButton("메인"); 
        backBtn.setBounds(160, 450, 150, 60);
    
        JButton logoutBtn = new JButton("로그아웃"); 
		logoutBtn.setBounds(160, 370, 150, 60);
		        
		logoutBtn.addActionListener(new logoutBtnListener());
		backBtn.addActionListener(new backBtnListener());
		
		panel.add(labelName);
		panel.add(UserName);
		panel.add(labelId);
		panel.add(UserId);
		//panel.add(labelPwd);
		//panel.add(UserPwd);
		panel.add(labelBalance);
		panel.add(UserBalance);
		
		panel.add(scrollPane);
		
		panel.add(logoutBtn);
		panel.add(backBtn);
		add(panel);
	}
	
	//로그아웃버튼 액션
	public class logoutBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new LoginFrame(500,500,"로그인").setVisible(true); //LoginFrame호출
		}
		
	}
	
	//메인버튼 액션
	public class backBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new MainFrame(500,600,"메인",user_bList).setVisible(true); //MainFrame호출(사용자책리스트 전달)
		}
		
	}
}
