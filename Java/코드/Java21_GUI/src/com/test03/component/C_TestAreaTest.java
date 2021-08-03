package com.test03.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class C_TestAreaTest {
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		//입력용 텍스트 필드
		JTextField tf = new JTextField(30);
		
		//출력용 텍스트 에어리어
		JTextArea ta = new JTextArea(10,30);
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				ta.append(text+"\n");
				
				//textfield 지우고 포커스 이동
				tf.setText("");
				tf.requestFocus();

			}
			
		});
		
		mf.add(tf, "North");
		mf.add(ta,"Center");
		
		
		//컨테이너 크기를 구성 요소들의 크기로 설정
		mf.pack();
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
