package com.test02.layout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_Border extends JFrame{
	
	public A_Border() {
		this.setTitle("BorderLayout");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//size
		this.setBounds(300,200,800,500);
		
		
		//
		JButton north = new JButton("ºÏ");

		JButton south = new JButton("³²");
		JButton east = new JButton("µ¿");
		JButton west = new JButton("¼­");
		JButton center = new JButton("°¡");
		
	
		this.add(south,"South");
		this.add(north,"North");
		//this.add(new JButton("ºÏ"), "North");
		this.add(east,"East");
		this.add(west, "West");
		this.add(center, "Center");
	}
}
