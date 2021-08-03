package com.test02.layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_Grid extends JFrame{
	
	public C_Grid() {
		super("GridLayout");
		
		this.setVisible(true);
		this.setBounds(300,200,800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		//GridLayout
		this.setLayout(new GridLayout(5,5,10,10));
		
		for(int i=1; i<26; i++) {
			String str = new Integer(i).toString();
			this.add(new JButton(str));
		}	
	}
}
