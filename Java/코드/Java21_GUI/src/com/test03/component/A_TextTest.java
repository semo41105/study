package com.test03.component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_TextTest {
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setSize(800,300);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.setSize(800,300);
		
		//글을 입력할 수 있는 텍스트 상자
		JTextField id = new JTextField();
		panel.add(new JLabel("ID"));
		panel.add(id);
		
		//비밀번호를 입력할 수 있는 TextField를 PasswordField라고 한다.
		//입력되는 값을 화면 상에서 볼 수 없으며 한글을 입력할 수도 없다.
		JPasswordField password = new JPasswordField();
		panel.add(new JLabel("PW"));
		panel.add(password);
		
		//여러 줄의 텍스트를 입력할 수 있는 상자를 TextArea라고 한다.
		JTextArea textArea = new JTextArea(10,30);
//		panel.add(textArea);
		textArea.setEditable(false); //readOnly(내용 수정 불가)
		
		JButton btn = new JButton("보내기");
		
		mf.add(panel,BorderLayout.NORTH);
		mf.add(textArea, BorderLayout.CENTER);
		mf.add(btn, BorderLayout.SOUTH);
		
		
//		mf.add(panel);
		
		//보내기 버튼을 눌렀을 때 이벤트 연결
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "id = " + id.getText() + "\n";
				text += "password = " + password.getPassword()+"\n";
				
				//문자 배열에 담아서 출력
				char[] pass = password.getPassword();
				for(int i=0; i<pass.length; i++) {
					System.out.println(pass[i]);
				}
				
				
				textArea.append(text);
			}
			
		});

		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);

	}
}
