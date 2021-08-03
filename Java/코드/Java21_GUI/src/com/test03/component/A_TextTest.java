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
		
		//���� �Է��� �� �ִ� �ؽ�Ʈ ����
		JTextField id = new JTextField();
		panel.add(new JLabel("ID"));
		panel.add(id);
		
		//��й�ȣ�� �Է��� �� �ִ� TextField�� PasswordField��� �Ѵ�.
		//�ԷµǴ� ���� ȭ�� �󿡼� �� �� ������ �ѱ��� �Է��� ���� ����.
		JPasswordField password = new JPasswordField();
		panel.add(new JLabel("PW"));
		panel.add(password);
		
		//���� ���� �ؽ�Ʈ�� �Է��� �� �ִ� ���ڸ� TextArea��� �Ѵ�.
		JTextArea textArea = new JTextArea(10,30);
//		panel.add(textArea);
		textArea.setEditable(false); //readOnly(���� ���� �Ұ�)
		
		JButton btn = new JButton("������");
		
		mf.add(panel,BorderLayout.NORTH);
		mf.add(textArea, BorderLayout.CENTER);
		mf.add(btn, BorderLayout.SOUTH);
		
		
//		mf.add(panel);
		
		//������ ��ư�� ������ �� �̺�Ʈ ����
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "id = " + id.getText() + "\n";
				text += "password = " + password.getPassword()+"\n";
				
				//���� �迭�� ��Ƽ� ���
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
