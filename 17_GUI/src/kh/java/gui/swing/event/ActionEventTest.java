package kh.java.gui.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kh.java.gui.util.MyUtil;

/**
 * LowLevelEventTest 를 쉽게 
 *
 *
 * EventListener를 bind하는 방법
 * 1. 내부클래스를 선언해서 객체생성
 * 2. 익명클래스로 선언과 동시에 객체생성(추상클래스, 인터페이스도 new연산자 사용가능)
 * 3. JFrame 커스텀클래스에서 Listener구현하기
 * 
 */

public class ActionEventTest extends JFrame implements ActionListener {
	
	JTextField input;
	
	public ActionEventTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("사용자 입력 : ");
		input = new JTextField(10);
		
		//input컴포넌트에 ActionEventHandler 바인딩
//		input.addActionListener(new MyActionListener()); //1번쨰 방법

		//2번쨰 방법. 익명클래스 : 클래스선언 + 객체생성
		//지역내부클래스의 파생형
		/*
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, input.getText()); 
				
				//초기화처리
				input.setText(""); //필드접근이 너무쉬워진다(지역변수접근하듯이)
				input.requestFocus(); 
			}
			
		};		
		input.addActionListener(listener);
		*/
		
		
		//3. JFrameCustom클래스가 ActionListener 구현하기
		input.addActionListener(this);
		
		panel.add(label);
		panel.add(input);
		add(panel);
		
	}
/*
	//1. 내부클래스 이용
	public class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) { //엔터를 쳤을때 실행
			System.out.println("actionPerformed");
			JOptionPane.showMessageDialog(null, input.getText()); //메시지다이얼로그에 텍스트필드에입력한 값 출력
			
			//초기화처리
			input.setText(""); //메시지다이얼로그 확인버튼누르면 텍스트필드 초기화
			input.requestFocus(); //바로 입력할수있도록 focus가져오기(이 예제에서는 별차이가없다)
		}
		
	}
*/	
	public static void main(String[] args) {

		new ActionEventTest(300,200,"액션이벤트").setVisible(true);
	}
	
	//3번째 방법
	//JFrame Custom 클래스에서 listener 구현하기
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, input.getText()); 
		
		//초기화처리
		input.setText(""); //필드접근이 너무쉬워진다(지역변수접근하듯이)
		input.requestFocus(); 
		
	}

}
