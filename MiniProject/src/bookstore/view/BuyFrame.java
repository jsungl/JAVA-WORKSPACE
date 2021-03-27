package bookstore.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

import bookstore.controller.BookController;
import bookstore.gui.util.MyUtil;
import bookstore.model.vo.Book;
/**
 * 구매화면
 */

public class BuyFrame extends JFrame{

	private BookController bookCntrl = new BookController(); 
	private JTextField search;
	private List<Book> srchlist;
	private JTable table;
	private DefaultTableModel model;
	private int row = -1; //초기값 -1
	boolean chk = false; //구매버튼클릭시 체크용
	
	public BuyFrame(int w, int h, String title,List<Book> list) {
		MyUtil.init(this, w, h, title);
		
		ImagePanel panel = new ImagePanel("images/background.png"); //배경이미지Panel사용
		panel.setLayout(null);
		
		
		JLabel labelSearch = new JLabel("검색 : "); 
		labelSearch.setBounds(50, 30, 60, 50);
		labelSearch.setFocusable(true); //라벨로 포커스이동
		
		search = new JTextField();  
		search.setBounds(110, 30, 200, 50);
		search.setText("책이름을 정확히 입력해주세요"); //검색필드 초기값설정
		
		
		JButton srchbtn = new JButton("검색"); 
		srchbtn.setBounds(320,30,100,50);
		
		
		//인자로 전달받은 책리스트가 null인 경우(사용자 책이 등록되있지 않은 경우)
		if(list == null)
			list = bookCntrl.loadStoreBookList(); //책방이 가지고있는 책리스트를 저장
		
		
		String[] book = {"이름", "저자", "포인트", "상태", "권수"}; //테이블 컬럼정보
        String[][] contents = new String[list.size()][book.length]; //테이블데이터
        for(int i = 0; i < list.size(); i++) { //책방에 저장되있는 책리스트 크기만큼 반복문 진행
        	Book b = list.get(i); //book객체로 저장
        	//book객체의 각 정보를 받아 column에 맞게 테이블 데이터에 저장
        	contents[i][0] = b.getTitle();
        	contents[i][1] = b.getAuthor();
        	contents[i][2] = Integer.toString(b.getPoint());
        	contents[i][3] = b.getState();
        	contents[i][4] = Integer.toString(b.getCount());        	
        }
        
        model = new DefaultTableModel(contents,book) { //테이블모델에 저장
            public boolean isCellEditable(int i, int c) {
                   return false; //셀편집 못하게 block
               }
       };
        
        table = new JTable(model); //테이블에 모델을 테이블에 올려 생성
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //테이블안에서 여러개 드래그하지 못하게 
        //헤더클릭시 정렬기능
        table.setAutoCreateRowSorter(true);//컬럼정보를 오름차순,내림차순 정렬할수있음
        //view port지정
        table.setPreferredScrollableViewportSize(new Dimension(500,50));//너비높이객체를 전달
        table.setFillsViewportHeight(true);// 컨테이너의 전체 높이를 테이블이 전부 사용하게끔 설정한다.
        JScrollPane scrollPane = new JScrollPane(table);//scrollpane에 추가
        scrollPane.setBounds(50,100,370,300);
		
		
        JButton buyBtn = new JButton("구매"); 
		buyBtn.setBounds(160, 410, 150, 60);
		
		JButton backBtn = new JButton("메인"); 
		backBtn.setBounds(160, 480, 150, 60);
        
        //binding
		srchbtn.addActionListener(new srchbtnListener());
		buyBtn.addActionListener(new buyBtnListener());
		table.addMouseListener(new clickTableListener());
		backBtn.addActionListener(new backBtnListener());
		search.addFocusListener(new srchFocusListener());
		
		panel.add(labelSearch);
		panel.add(search);
		panel.add(srchbtn);
		panel.add(scrollPane);
		panel.add(buyBtn);
		panel.add(backBtn);
		add(panel);
	}
	
	//검색필드 이벤트
	public class srchFocusListener implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			search.setText(""); //검색필드에 포커스 이동시 기본값삭제
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	//메인버튼 이벤트
	public class backBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//초기화
			search.setText("");
			dispose();
			//MainFrame호출(인자로 사용자책리스트 전달)
			new MainFrame(500,600,"메인화면",LoginFrame.loginUser.getUser_bList()).setVisible(true); 
		}
		
	}
	
	
	
	//검색버튼 이벤트
	public class srchbtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String srch = search.getText(); //찾으려는 책을 텍스트필드에서 읽어와 저장
			if(srch.equals("책이름을 정확히 입력해주세요") || srch.equals("")) {
				JOptionPane.showMessageDialog(null, "찾으시는 책 이름을 입력해주세요");
				search.setText("책이름을 정확히 입력해주세요");
			}else {
			//찾으려는 책을 controller 클래스의 bookSerch메소드에 인자로 전달(책방리스트에서 있는지 찾는다)
				srchlist = bookCntrl.bookSerch(srch); 
				if(srchlist.isEmpty()) { //리턴값으로 받은 리스트(찾으려는 책)가 없는경우
					JOptionPane.showMessageDialog(null, "찾으시는 책이 없습니다");
					search.setText("책이름을 정확히 입력해주세요");
				}else {
					search.setText("");
					dispose();
					//BuyFrame 호출(인자로 찾은 책리스트를 전달)
					new BuyFrame(500,600,"구매 프레임",srchlist).setVisible(true); 
					
				}
				
			}	 
		}
		
	}
	
	//테이블 클릭 이벤트
	public class clickTableListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			row = table.getSelectedRow(); //테이블에서 선택한 row를 저장 
		}

		
	}
	
	//구매버튼 이벤트
	public class buyBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Book buyBook = new Book();
			//초기화
			String title = "";
			String author = "";
			String state = "";
			int price = 0;
			int count = 0;
			if(row == -1) { //테이블에서 선택하지않고 구매버튼을 누르는경우
				JOptionPane.showMessageDialog(null, "구매할 책을 선택하세요");
			}else {
				for(int i = 0; i < table.getColumnCount(); i++) { //테이블 column개수 만큼 반복문 진행
					switch(i){
						case 0 : title = (String)table.getModel().getValueAt(row, i);break; //1번째 열(책이름)
						case 1 : author = (String)table.getModel().getValueAt(row, i);break; //2번째 열(저자)
						case 2 : price = Integer.parseInt(table.getModel().getValueAt(row, i).toString());break;//3번째열(포인트)
						case 3 : state = (String)table.getModel().getValueAt(row, i);break;//4번째 열(상태)
						case 4 : count = Integer.parseInt(table.getModel().getValueAt(row, i).toString());break;//5번째열(개수)
					}
				}
				//SpinnerModel(초기값,최소값,최대값,증가값)
				SpinnerModel numberModel = new SpinnerNumberModel(1, 1, count, 1); //최대 책개수만큼 선택가능 
				JSpinner spinner = new JSpinner(numberModel);
				int option = JOptionPane.showOptionDialog(null,spinner,"구매개수확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
				if(option == JOptionPane.OK_OPTION) { //확인버튼
					int chkCount = Integer.parseInt(spinner.getModel().getValue().toString()); //spinner에서 선택한 값(판매할개수)
					buyBook.setTitle(title);
					buyBook.setAuthor(author);
					buyBook.setPoint(price);
					buyBook.setState(state);
					buyBook.setCount(chkCount);
					chk = bookCntrl.buy(LoginFrame.loginUser, buyBook); //controller에 buy메소드 호출(user객체,구매하려는 book객체)
					if(chk == true) { //구매확인이 되면
						JOptionPane.showMessageDialog(null, "구매완료하였습니다. 감사합니다");	
						//초기화
						search.setText("");
						dispose();
						//BuyFrame호출(책방책리스트 전달)
						new BuyFrame(500,600,"판매",bookCntrl.loadStoreBookList()).setVisible(true);
					}else 
						JOptionPane.showMessageDialog(null, "포인트가 부족합니다");
								
				}
							
							
			}
						
		
		}
	
	}
	
	
}
