package com.test02.layout;

import java.awt.Button;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class E_Panel extends JFrame{
	public E_Panel() {
		super("JPanerLayoutTest");
		
		this.setBounds(200,200,500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		System.out.println(this.getLayout());
		
		JLabel lb = new JLabel("이 름: ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		
		JTextField tf = new JTextField(20);
		tf.setLocation(110,100);
		tf.setSize(200,50);
		
		
		JButton btn = new JButton("추가");
		btn.setLocation(550,100);
		btn.setSize(100, 50);
		
		//패널추가
		JPanel panel = new JPanel();
		panel.setSize(500, 500);
		
		panel.setLayout(null);//기본 레이아웃인 플로우 레이아웃을 지움
		System.out.println(panel.getLayout());
		
		panel.add(lb);
		panel.add(tf);
		panel.add(btn);
		panel.setBackground(Color.pink);
		
		//패널을 프레임에 추가
		this.add(panel);
	}
}
