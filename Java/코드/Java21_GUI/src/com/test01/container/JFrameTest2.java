package com.test01.container;

import java.awt.Rectangle;

import javax.swing.JFrame;

public class JFrameTest2 {
	//������ ���� ��� 2
	//JFrame Ŭ������ ��ü ���� �� �ش� �����Ӱ�ü�� �������� �����ϴ� ���
	//�޼ҵ忡 ��ü ����
	public void mainFrame() {
		
		JFrame main = new JFrame("MyFrame02");
//		main.setTitle("myTitle");
		
		main.setVisible(true);
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Rectangle r = new Rectangle(300,200,800,500);
		main.setBounds(r);
	}
}
