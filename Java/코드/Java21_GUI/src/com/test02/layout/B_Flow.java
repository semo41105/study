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

		//FlowLayout ����
//		this.setLayout(new FlowLayout(FlowLayout.CENTER)); //�⺻��
//		this.setLayout(new FlowLayout(FlowLayout.LEFT));		
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		
		this.add(new JButton("1��"));
		this.add(new JButton("2��"));
		this.add(new JButton("3��"));
		this.add(new JButton("4��"));
		this.add(new JButton("5��"));
		this.add(new JButton("6��"));
		this.add(new JButton("7��"));
		this.add(new JButton("8��"));
		this.add(new JButton("9��"));
		this.add(new JButton("10��"));
		this.add(new JButton("11��"));
		this.add(new JButton("12��"));
		this.add(new JButton("13��"));
		this.add(new JButton("14��"));
		this.add(new JButton("15��"));
		this.add(new JButton("16��"));
		this.add(new JButton("17��"));
		this.add(new JButton("18��"));
		this.add(new JButton("19��"));
		this.add(new JButton("20��"));	
	}
}
