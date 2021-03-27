package kh.java.gui.swing.container.layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class BorderLayoutTest extends JFrame {
	
	public BorderLayoutTest(int w, int h, String title) {
		MyUtil.init(this,w,h,title); //현재객체,w,h,title 전달
		
		JPanel north = new BorderPanel("복",Color.CYAN);
		JPanel south = new BorderPanel("남",Color.BLUE);
		JPanel east = new BorderPanel("동",Color.darkGray);
		JPanel west = new BorderPanel("서",Color.green);
		JPanel center = new BorderPanel("가운데",Color.ORANGE);
		
		//JFrame객체의 기본 layout은 BorderLayout이다
		add(north,BorderLayout.NORTH); //paenl의 크기는 component의 크기에 따라 정해진다(panel안에 내용을 추가하면 크기는 달라진다)
		add(south,BorderLayout.SOUTH);
		add(east,BorderLayout.EAST);
		add(west,BorderLayout.WEST);
		add(center);
	}
	
	//내부클래스(공통적인것을 처리하기위해)
	//외부클래스에서 자유롭게 가져다 사용할수있다
	//BorderLayoutTest$BorderPanel.class
	public class BorderPanel extends JPanel {
		public BorderPanel(String title, Color c) {
			setBackground(c); //배경색지정
			JLabel label = new JLabel(title); //라벨생성
			add(label); //현재 JPanel객체에 추가
		}
	}

	public static void main(String[] args) {

		new BorderLayoutTest(500,500,"Border LayoutTest").setVisible(true);
		
	}

}
