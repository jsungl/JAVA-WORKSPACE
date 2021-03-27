package kh.java.gui.swing.container;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * JFrame 객체생성1
 *  - new JFrame() 직접 객체 생성하기
 * JFrame 객체생성2
 *  - JFrame을 상속한 커스텀 클래스 작성후 객체 생성하기
 * 
 * 
 * 
 *
 */
public class JFrameTest1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		//윈도우 크기 지정
		f.setSize(300, 200);
		//위치(기준점)
		//f.setLocation(500, 500);
		
		//스크린 가운데 띄우기
		f.setLocationRelativeTo(null);
		
		//제목지정
		f.setTitle("Hello Swing");
		
		//X버튼 누르면 프로그램 종료되게 설정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//자식컴포넌트 : 컨테이너에 포함된 컴포넌트
		f.add(new JLabel("안녕"));
		
		
		
		
		//시각화처리(맨마지막에 작성)
		f.setVisible(true);
		
		
		
		
		
		
		
		
	}

}
