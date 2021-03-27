package kh.java.gui.swing.container.layout;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest(int w,int h, String title) {
		MyUtil.init(this,w,h,title);
		//JPanel panel1 = new FlowPanel("test",Color.blue);
		//add(panel1);
		
		//JPanel의 기본 Layout객체 FlowLayout
		JPanel panel = new JPanel();
		//정렬기준 제시 : LEFT,RIGHT,CENTER
		//버튼이 왼쪽으로 정렬
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		for(int i = 0; i < 15; i++) {
			panel.add(new JButton((i + 1) + "번"));
		}
		
		
		
		add(panel);
	
	
	
	}
	
	public class FlowPanel extends JPanel {
		public FlowPanel(String title, Color c) {
			setBackground(c); //배경색지정
			JLabel label = new JLabel(title); //라벨생성
			add(label); //현재 JPanel객체에 추가
		}
	}
	
	public static void main(String[] args) {

		new FlowLayoutTest(500,500,"Flow LayoutTest").setVisible(true);
	}

}
