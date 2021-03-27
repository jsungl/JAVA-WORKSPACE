package kh.java.gui.swing.container;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelTest extends JFrame {

	//800*500 가운데 위치시키기
	public JPanelTest() {
		setSize(800, 500); //Frame크기
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JFrame의 기본 LayoutManager객체는 BorderLayout이다
		//setLayout(new BorderLayout()); 가 생략된것
		//null layout : layout manager 객체를 사용하지않고 직접 좌표를 지정함(직관적)
		setLayout(null);
		
		
		//자식컴포넌트 추가
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.GREEN);
//		panel1.setBackground(new Color(255,0,0)); //색깔지정(color객체 생성)
		JLabel label1 = new JLabel("panel1");
		panel1.setBounds(100, 50, 300, 400);
		panel1.add(label1); //패널에 라벨을 추가
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.BLACK);
		JLabel label2 = new JLabel("panel2");
		panel2.setBounds(400, 50, 300, 400);
		panel2.add(label2);
		
		
		
		
		
		
		//프레임에 패널을 추가
//		add(panel1,BorderLayout.NORTH); //BorderLayout이용하여 2개의 Panel을 다 보여준다 
		add(panel1);
		add(panel2);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new JPanelTest();
		
	}
	
	

}
