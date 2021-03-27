package kh.java.gui.swing.change.panel;

import java.awt.Color;

import javax.swing.JFrame;

import kh.java.gui.util.MyUtil;

public class MainFrame extends JFrame {
	
	public static CustomPanel[] panels = new CustomPanel[3]; //외부에서 접근가능
	
	public MainFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//panels객체 할당
		panels[0] = new CustomPanel(this,Color.green,"panel0"); //this:panel의부모
		panels[1] = new CustomPanel(this,Color.red,"panel1");
		panels[2] = new CustomPanel(this,Color.yellow,"panel2");
		
		add(panels[0]); //시작페이지
		
	}


}
