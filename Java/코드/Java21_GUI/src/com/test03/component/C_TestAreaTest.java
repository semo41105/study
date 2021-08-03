package com.test03.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class C_TestAreaTest {
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		//�Է¿� �ؽ�Ʈ �ʵ�
		JTextField tf = new JTextField(30);
		
		//��¿� �ؽ�Ʈ �����
		JTextArea ta = new JTextArea(10,30);
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				ta.append(text+"\n");
				
				//textfield ����� ��Ŀ�� �̵�
				tf.setText("");
				tf.requestFocus();

			}
			
		});
		
		mf.add(tf, "North");
		mf.add(ta,"Center");
		
		
		//�����̳� ũ�⸦ ���� ��ҵ��� ũ��� ����
		mf.pack();
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
