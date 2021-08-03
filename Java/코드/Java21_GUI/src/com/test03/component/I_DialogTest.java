package com.test03.component;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class I_DialogTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("다이얼로그 테스트");

		JPanel panel = new JPanel();
		JButton button1 = new JButton("Simple Dialog");

		// 다이얼로그 설정
		Dialog sd = new Dialog(mf, "Simple Dialog");
		sd.setBounds(150, 250, 150, 150);
		sd.add(new JLabel("simple dialog test"));

		JButton button2 = new JButton("close");
		sd.add(button2, "Center");
		
		
		JButton button3 = new JButton("Input Dialog");
		panel.add(button3);
		

		// 심플 다이얼로그 보여지게 하기
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sd.setVisible(true);
			}
		});
		//close 버튼 누를 때 다이얼로그 닫기
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sd.dispose();
			}
		});
		
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String result = JOptionPane.showInputDialog("내용을 입력하세요");//옵션팬에서 기본으로 제공하는 틀이 있음.
				System.out.println(result);
			}
		});	
		panel.add(button1);
		mf.add(panel);

		mf.pack();
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
