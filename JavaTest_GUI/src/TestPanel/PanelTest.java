package TestPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTest extends JFrame {

	JPanel panel1;
	JPanel panel2;
	Container contentPane;
	JLabel label1;
	JLabel label2;
	
	
	public PanelTest(){
		contentPane = getContentPane();
		contentPane.setLayout(null);
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0, 0, 500, 500);
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(0, 0, 500, 500);
		//panel1.setBackground(Color.green);
		//panel2.setBackground(Color.red);
		label1 = new JLabel("아이디찾기");
		label1.setBounds(150, 150, 100, 50);
		
		label2 = new JLabel("비번찾기");
		label2.setBounds(300, 150, 100, 50);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(100, 100, 100, 50);
		JTextField txt2 = new JTextField();
		txt2.setBounds(100, 100, 100, 50);
		
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(txt1);
		panel2.add(label1);
		panel2.add(label2);
		panel2.add(txt2);
		
		contentPane.add(panel1);
		contentPane.add(panel2);
		
		label1.addMouseListener(new label1Listener());
		label2.addMouseListener(new label2Listener());
		
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public class label1Listener extends MouseAdapter{

		
		@Override
		public void mouseClicked(MouseEvent e) {
			getContentPane().removeAll();
			PanelTest.this.setVisible(false);
			PanelTest.this.setVisible(true);
			getContentPane().add(panel2);
			PanelTest.this.setContentPane(getContentPane());
			
			//contentPane.removeAll();
			//contentPane.add(panel2);
			//setContentPane(contentPane);
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			label1.setForeground(Color.blue);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			label1.setForeground(Color.black);
		}
		
	}
	
	public class label2Listener extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			//getContentPane().removeAll();
			//getContentPane().add(panel1);
			//PanelTest.this.setContentPane(getContentPane());
			contentPane.removeAll();
			PanelTest.this.setVisible(false);
			PanelTest.this.setVisible(true);
			contentPane.add(panel1);
			PanelTest.this.setContentPane(contentPane);
			
			
			//PanelTest.this.revalidate();
			//PanelTest.this.repaint();
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			label2.setForeground(Color.blue);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			label2.setForeground(Color.black);
		}
		
	}
	
	public static void main(String[] args) {
		new PanelTest();
	}
}
