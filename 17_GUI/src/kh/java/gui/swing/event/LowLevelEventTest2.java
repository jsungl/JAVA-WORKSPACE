package kh.java.gui.swing.event;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kh.java.gui.util.MyUtil;

public class LowLevelEventTest2 extends JFrame {

	JTextField input;
	JTextArea textArea;
	
	public LowLevelEventTest2(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//top Panel
		initTopPanel();
		
		//centerPanel
		initCenterPanel();
	}
	
	
	private void initTopPanel() {
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("사용자입력 : "));
		input = new JTextField(10);
		panel.add(input);
//		panel.add(new JTextField(10)); //텍스트필드 너비지정(컬럼수로 지정)
		add(panel,BorderLayout.NORTH);
		
		//이벤트 핸들러 추가
		input.addKeyListener(new MykeyListener()); //바인딩
		
	}
	
	private void initCenterPanel() {
		JPanel panel = new JPanel();
		//panel.add(new JTextArea(5,20));
		textArea = new JTextArea(5,20);
		panel.add(textArea);
		add(panel,BorderLayout.CENTER);
	}


	public class MykeyListener implements KeyListener{
		//보통 3개중 1개만 구현
		
		@Override
		public void keyTyped(KeyEvent e) {
			//System.out.println("typed : " + e.getKeyCode() + " " + e.getKeyChar()); //키보드입력값을 가져와 확인가능(키코드출력안됨)
			
		}

		@Override
		public void keyPressed(KeyEvent e) { //키보드눌렀을때
			System.out.println("pressd : " + e.getKeyCode() + " " + e.getKeyChar()); //키코드출력됨
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				//System.out.println("엔터를 입력하셨습니다");
				//엔터를 치면 텍스트필드에 입력되있는 사용자입력값 전체를 JTextArea에 출력
				String s = input.getText(); //JTextField의 값 
				textArea.append(s+"\n"); //개행문자추가
				
				//초기화
				input.setText(""); //JTextField 초기화
			}
		}

		@Override
		public void keyReleased(KeyEvent e) { //키보드 땟을때
			// TODO Auto-generated method stub
			
		}
		
	}



	public static void main(String[] args) {

		new LowLevelEventTest2(300,200,"키이벤트").setVisible(true);
	}

}
