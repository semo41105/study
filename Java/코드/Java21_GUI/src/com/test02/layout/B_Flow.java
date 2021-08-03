package com.test02.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_Flow extends JFrame{
	
	public B_Flow() {
		super("FlowLayout");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setBounds(300,200,800,500);

		//FlowLayout 설정
//		this.setLayout(new FlowLayout(FlowLayout.CENTER)); //기본값
//		this.setLayout(new FlowLayout(FlowLayout.LEFT));		
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		
		this.add(new JButton("1번"));
		this.add(new JButton("2번"));
		this.add(new JButton("3번"));
		this.add(new JButton("4번"));
		this.add(new JButton("5번"));
		this.add(new JButton("6번"));
		this.add(new JButton("7번"));
		this.add(new JButton("8번"));
		this.add(new JButton("9번"));
		this.add(new JButton("10번"));
		this.add(new JButton("11번"));
		this.add(new JButton("12번"));
		this.add(new JButton("13번"));
		this.add(new JButton("14번"));
		this.add(new JButton("15번"));
		this.add(new JButton("16번"));
		this.add(new JButton("17번"));
		this.add(new JButton("18번"));
		this.add(new JButton("19번"));
		this.add(new JButton("20번"));	
	}
}
