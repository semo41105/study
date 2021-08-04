package com.event.test03;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	private JPanel panel;
	
	public MainFrame() {
		this.setSize(300,200);
		
		panel = this.callPanel1();
		
		panel.addMouseListener(new MyMouseAdapter());
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//내부클래스
	class MyMouseAdapter extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			replace();
		}
	}
	
	public JPanel callPanel1() {
		panel = new Panel1();
		return panel;
	}
	
	public JPanel callPanel2() {
		panel = new Panel2();
		return panel;
	}
	
	public void replace() {
		this.remove(panel);
		this.panel = callPanel2();
		this.add(panel);
		this.repaint();
	}
}
