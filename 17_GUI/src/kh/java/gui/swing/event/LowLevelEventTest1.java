package kh.java.gui.swing.event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

/**
 * Event 
 * 컴퓨터(프로그램)와 사용자간의 상호작용
 * 
 * event -> os -> jvm -> event분배쓰레드 -> 각 component event handler메소드 호출
 *
 * 1. 저수준 이벤트
 * 		- key event
 * 		- mouse event
 * 		- focus event
 * 		- window event...
 * 
 * 2. 고수준 semantic 이벤트
 * 		- action event
 * 		- item event
 * 		- adjustment event
 *
 */
public class LowLevelEventTest1 extends JFrame {

	public LowLevelEventTest1(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("패널");
		panel.add(label);
		
//		MyMouseListener listener = new MyMouseListener();
//		panel.addMouseListener(listener);
//		panel.addMouseWheelListener(listener);
//		panel.addMouseMotionListener(listener);
		
		//Mouse Adapter Listener
		panel.addMouseListener(new MyMouseListener2());

		add(panel);
	}
	
	public class MyMouseListener implements MouseListener, MouseWheelListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("mouse cliked" + e); //클릭정보(좌표,키보드입력이있는지없는지,이벤트발생한것이 무엇인지 등등)
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("mouse pressed");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("mouse released");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("mouse entered");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("mouse exited");
		}

		//마우스휠 이벤트
		
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) { 
			System.out.println("mouseWheelMoved");
		}

		// mouse motion event
		
		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println("mouse dragged");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println(e.getX() + ", " + e.getY()); //패널에서 좌표출력
		}
		
	}
	
	public class MyMouseListener2 extends MouseAdapter { //내가 원하는 메소드만 구현
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("mouse cliked"); 
		}
	}
	
	
	public static void main(String[] args) {

		new LowLevelEventTest1(300,200,"저수준 이벤트").setVisible(true);
	}

}
