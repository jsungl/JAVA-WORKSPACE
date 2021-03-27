package kh.java.gui.swing.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class CheckBoxTest extends JFrame {
	
	JLabel resultLabel;

	public CheckBoxTest(int w, int h, String title) {
		
		MyUtil.init(this, w, h, title);
		
		topPanel();
		selectPanel();
		resultPanel();
		
	}
	
	
	private void topPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("과일을 선택하세요");
		panel.add(label);
		add(panel,BorderLayout.NORTH);
	}
	
	private void selectPanel() {
		JPanel panel = new JPanel();
		JCheckBox[] chks = {
				new JCheckBox("바나나"),
				new JCheckBox("딸기"),
				new JCheckBox("아보카도")
		};
		
		
		
		//이벤트핸들러 처리
		for(JCheckBox chk: chks) {
			//각 checkbox객체에 이벤트리스너 바인딩
			chk.addActionListener(new ActionListener() { //변수에 안담고 바로 전달(actionListener가 3개만들어진걸로 이해)
				@Override
				public void actionPerformed(ActionEvent e) { //체크박스 체크 및 해제 이벤트
					//System.out.println("actionPerformed!");
					List<String> checkedList = new ArrayList<>();
					for(JCheckBox chk : chks) {
						if(chk.isSelected()) //체크되있다면
							checkedList.add(chk.getText()); //리스트에 추가
					}
					
					if(checkedList.isEmpty()) //체크리스트에 아무것도 없으면
						resultLabel.setText("아무것도 선택하지 않았습니다");
					else  //체크리스트에 하나라도  있으면
						resultLabel.setText(checkedList + "를 선택하셨습니다");
					
				}
			});
		}
		
		for(JCheckBox chk : chks)
			panel.add(chk);
		
		add(panel);
		
	}
	
	private void resultPanel() {
		JPanel panel = new JPanel();
//		resultLabel = new JLabel("사이즈를 선택하세요");
		this.resultLabel = new JLabel("아무것도 선택하지 않았습니다");
		panel.add(resultLabel);
		add(panel,BorderLayout.SOUTH);
	}
	

		






	public static void main(String[] args) {
		new CheckBoxTest(300,200,"체크박스").setVisible(true);
	}
	
	
	

}
