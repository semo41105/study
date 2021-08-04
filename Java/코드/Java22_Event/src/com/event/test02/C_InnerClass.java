package com.event.test02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_InnerClass extends JFrame{
	private JButton button;
	private JLabel label;
	
	public C_InnerClass() {
		
		this.setSize(300,200);
		this.setTitle("내부클래스");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌리지 않았습니다.");
		
		button.addActionListener(new MyEvent());
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	//클래스를 선언할 것. 여기에 선언할 수 있는 클래스를 내부 클래스라고 함.
	//내부클래스
	//private와 public 사용가능
	private class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				label.setText("드디어 버튼이 눌렸습니다!!!!!!!!!");
			}
		}
		
	}
	
	public static void main(String[] args) {
		new C_InnerClass();
	}
}
