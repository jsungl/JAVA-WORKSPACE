package kh.java.gui.swing.container;

import javax.swing.JFrame;

public class JFrameTest2 extends JFrame {

	//생성자에서 설정
	public JFrameTest2() {
		setTitle("두번쨰 프레임");
		//setSize(300,200);
		//setLocation(200,200);
		setBounds(200,200,300,200); //위 두줄을 한줄로 작성할수있음
		//리사이즈 방지
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		new JFrameTest2();
	}
	

}
