package com.test01.container;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest extends JFrame{
	//�������� �����ϴ� ���1
	//javax.swing.JFreame Ŭ���� ��� �� �����ڿ� ������ ���� ����
	//��� �Ŀ� ��ü ����
	
	public JFrameTest() {
		//������ ũ�� ����
//		this.setLocation(300,200);
//		this.setSize(800,500);
	
		//��ġ�� ũ�⸦ �ѹ��� ����
		this.setBounds(300,200,800,500);
		
		//�������� ���������� �ش� �޼ҵ� ����
		this.setVisible(true);
		
		//�ݱ� ��ư ������ �� ���μ��� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//������ ��ܿ� �̸� �����ϱ�
		this.setTitle("MyFrame");
		
		//������ ��ܿ� �̹��� �����ϱ�
		try {
			this.setIconImage(ImageIO.read(new File("images/hobbangman.jpeg")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//������ ������ ���� ��Ȱ��ȭ
		this.setResizable(false);

	}
}
