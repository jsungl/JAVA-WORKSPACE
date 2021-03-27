package kh.java.gui.swing.component;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import kh.java.gui.util.MyUtil;

/**
 * JTable(TableModel)
 * 	- TableModel 데이터가 저장되는 객체, 이벤트핸들링도 tableModel에 건다
 * 
 * JScrollPane(JTable)을 추가
 * 	- 헤더부 노출, 스크롤 기능 이용
 *
 */


public class JTableTest extends JFrame {

	List<Member> list = new ArrayList<>();
	
	{
		list.add(new Member("홍길동"	,"서울",24,false));
		list.add(new Member("신사임당","부산",48,true));
		list.add(new Member("세종"	,"서울",67,true));
	}
	
	
	
	
	
	
	public JTableTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
	
		//컬럼정보
		Object[] columnNames = {
				"이름","주소","나이","결혼여부"
		};
		
		
		
		Object[][] rowData = new Object[list.size()][columnNames.length]; //rowData[3][4]
		for(int i = 0; i < list.size(); i++) {
			Member m = list.get(i);
			rowData[i][0] = m.getName();
			rowData[i][1] = m.getAddr();
			rowData[i][2] = m.getAge();
			rowData[i][3] = m.isMarried();
		}
		
/*		
		//행정보(data)
		//활용 : 파일로부터 읽어오기 List<Member>
		Object[][] rowData = {
				{"홍길동"	,"서울",24,false},
				{"신사임당","부산",48,true},
				{"세종"	,"서울",67,true},
				
		};
*/	
		//테이블생성
		JTable table = new JTable(rowData,columnNames);
		
		//헤더클릭시 정렬기능
		table.setAutoCreateRowSorter(true); //컬럼정보를 오름차순,내림차순 정렬할수있음
		
		
		//viewport 지정
		table.setPreferredScrollableViewportSize(new Dimension(500,50)); //너비높이객체를 전달
		
		
		//스크롤페인에 추가
		JScrollPane scrollPane = new JScrollPane(table);
		
		//셀(한칸) 편집시 이벤트 처리하기
		TableModel model = table.getModel();
		model.addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent e) {
				int row = e.getFirstRow(); //바뀐것중에 첫번째행을 가져온다
				int col = e.getColumn();
				//System.out.println(row + ", " + col);
				Object data = model.getValueAt(row, col); //바뀐 데이터를 가져온다
				System.out.println(data);
			}
			
			
		});
		
		
		//하단 저장 버튼
		JButton btn = new JButton("저장");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int rowLen = model.getRowCount(); //실제데이터 몇행인지 알아오기
				int colLen = model.getColumnCount();
				
				List<Member> newList = new ArrayList<>();
				for(int i = 0; i < rowLen; i++) {
					
					Member newMember = new Member();
					
					for(int j = 0; j < colLen; j++) {
						Object data = model.getValueAt(i, j); //테이블에 있는 데이터를 가져온다
						//System.out.println(data);
						switch(j) {
						case 0: newMember.setName((String)data);break; //1열은 이름
						case 1: newMember.setAddr((String)data);break; //2열은 주소
						case 2: newMember.setAge(Integer.parseInt(data.toString()));break; //3열은 나이
						case 3: newMember.setMarried((boolean)data);break; //4열은 불린
						
						}
					}
					newList.add(newMember); //for문이 끝나면 newmemeber추가
				}
				
				for(Member newMember : newList)
					System.out.println(newMember);
				
			}
			
		});
		
		
		add(scrollPane);
		add(btn,BorderLayout.SOUTH);
		//pack();
	}
	
	
	
	public static void main(String[] args) {
		new JTableTest(300,200,"JTable").setVisible(true);
	}

}
