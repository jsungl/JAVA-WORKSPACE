package kh.java.gui.swing.component;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class ImagePanelTest extends JFrame {

	public ImagePanelTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
	
		/*
		//이미지 사용하기
		JLabel container = new JLabel(new ImageIcon("images/cat.PNG")); //이미지자체를 직접올리지않고 라벨에 항상 올려야한다
		add(container);
		pack(); //실제 컴포넌트의 크기에 맞게 컨테이너의 크기를 확대/축소한다 -> 라벨의 크기에 맞춘다
		*/
		
		ImagePanel panel = new ImagePanel("images/background2.png");
		JButton btn = new JButton("안녕");
		btn.setBounds(100, 100, 100, 100);
		panel.setLayout(null);
		panel.add(btn); //패널안에 버튼추가
		
		
		add(panel);
		pack();
	
	
	}
	
	public class ImagePanel extends JPanel {
		
		private BufferedImage image;
		private int w;
		private int h;
		
		public ImagePanel(String fileName) {
			try {
				image = ImageIO.read(new File(fileName)); //이미지 읽어오기
				w = image.getWidth();
				h = image.getHeight();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		//현재 패널크기를 백그라운드 이미지의 크기로 지정
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(w,h);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g); //부모메소드호출
			
			//boolean java.awt.Graphics.drawImage(Image img, int x, int y, ImageObserver observer)
			//img객체를 x,y값만큼 떨어뜨려(offset) 그리기 메소드
			g.drawImage(image, 0, 0, null); //왼쪽 탑부터 그리기
		}
		
		
	}

	public static void main(String[] args) {
		new ImagePanelTest(500,500,"백그라운드 이미지").setVisible(true);
	}
}
