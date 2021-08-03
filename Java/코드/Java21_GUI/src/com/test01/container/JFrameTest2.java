package com.test01.container;

import java.awt.Rectangle;

import javax.swing.JFrame;

public class JFrameTest2 {
	//프레임 생성 방법 2
	//JFrame 클래스로 객체 생성 후 해당 프레임객체의 설정값을 변경하는 방법
	//메소드에 객체 생성
	public void mainFrame() {
		
		JFrame main = new JFrame("MyFrame02");
//		main.setTitle("myTitle");
		
		main.setVisible(true);
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Rectangle r = new Rectangle(300,200,800,500);
		main.setBounds(r);
	}
}
