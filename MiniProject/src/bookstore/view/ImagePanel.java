package bookstore.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * 배경이미지로 쓰일 이미지panel
 *
 */
public class ImagePanel extends JPanel{

	private BufferedImage image;
	private int w;
	private int h;
	
	public ImagePanel(String fileName) {
		try {
			image = ImageIO.read(new File(fileName)); //이미지 읽어오기
			w = image.getWidth(); //가로
			h = image.getHeight(); //세로
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
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
	

