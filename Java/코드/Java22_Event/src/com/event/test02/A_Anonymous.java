package com.event.test02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A_Anonymous {
	public static void main(String[] args) {
		//익명클래스
		JFrame mf = new JFrame("익명클래스");
		
		mf.setSize(300,200);
		
		JPanel panel = new JPanel();
		JButton btn = new JButton("버튼을 눌러보세요");
		JLabel label = new JLabel("아직 버튼이 눌리지 않았습니다.");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn) {
					label.setText("드디어 버튼이 눌러졌다");
				}
			}
		});
		
		panel.add(btn);
		panel.add(label);
		
		mf.add(panel);
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
