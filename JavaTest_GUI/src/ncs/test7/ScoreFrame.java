package ncs.test7;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class ScoreFrame extends JFrame {

	private JLabel label;
	private JLabel labelJava,labelSql,labelTot,labelAvg;
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	private JButton calcBtn;
	
	
	public ScoreFrame() {
		setTitle("                   문제7");
		setSize(500,500);
		setLocationRelativeTo(null);
		
		
		setLayout(null);
		label = new JLabel("점수를 입력하세요");
		label.setBounds(40, 10, 500, 100);
		Font font = new Font("맑은고딕",Font.PLAIN,50);
		label.setFont(font);
		
		javaScore = new JTextField();
		sqlScore = new JTextField();
		total = new JTextField();
		average = new JTextField();
		calcBtn = new JButton("계산하기");
		labelJava = new JLabel("자바:");
		labelJava.setBounds(40, 100, 50, 50);
		javaScore.setBounds(80, 110, 150, 30);
		labelSql = new JLabel("SQL:");
		labelSql.setBounds(270, 100, 50, 50);
		sqlScore.setBounds(310, 110, 150, 30);
		
		calcBtn.setBounds(200, 200, 100, 30);
		
		
		labelTot = new JLabel("총점:");
		labelTot.setBounds(40, 310, 50, 50);
		total.setBounds(80, 320, 150, 30);
		labelAvg = new JLabel("평균:");
		labelAvg.setBounds(270, 310, 50, 50);
		average.setBounds(310, 320, 150, 30);
		
		calcBtn.addActionListener(new ActionHandler());
		
		
		add(label);
		add(labelJava);
		add(labelSql);
		add(labelTot);
		add(labelAvg);
		add(javaScore);
		add(sqlScore);
		add(total);
		add(average);
		add(calcBtn);
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public class ActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String s1 = javaScore.getText();
			String s2 = sqlScore.getText();
			
			int javaScore = Integer.parseInt(s1);
			int sqlScore = Integer.parseInt(s2);
			
			
			int tot = javaScore + sqlScore;
			int avg = tot / 2;
			
			total.setText(Integer.toString(tot));
			average.setText(Integer.toString(avg));
			
		}
		
	}
	
}
