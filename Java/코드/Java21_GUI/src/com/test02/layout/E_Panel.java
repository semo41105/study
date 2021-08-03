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
		
		JLabel lb = new JLabel("�� ��: ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		
		JTextField tf = new JTextField(20);
		tf.setLocation(110,100);
		tf.setSize(200,50);
		
		
		JButton btn = new JButton("�߰�");
		btn.setLocation(550,100);
		btn.setSize(100, 50);
		
		//�г��߰�
		JPanel panel = new JPanel();
		panel.setSize(500, 500);
		
		panel.setLayout(null);//�⺻ ���̾ƿ��� �÷ο� ���̾ƿ��� ����
		System.out.println(panel.getLayout());
		
		panel.add(lb);
		panel.add(tf);
		panel.add(btn);
		panel.setBackground(Color.pink);
		
		//�г��� �����ӿ� �߰�
		this.add(panel);
	}
}
