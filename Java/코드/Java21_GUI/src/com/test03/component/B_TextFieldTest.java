package com.test03.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B_TextFieldTest {
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		mf.setSize(300,130);
		mf.setTitle("���� ����ϱ�");
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�⺻���� ���õ�
		
		//�г� ����
		JPanel panel = new JPanel();
		
		//�� �߰�
		panel.add(new JLabel("���� �Է�: "));
		
		//�ؽ�Ʈ�ʵ� �߰�
		JTextField text = new JTextField(15);
		panel.add(text);
		
		//��� ����(��) �߰�
		panel.add(new JLabel("������ ��: "));
		
		JTextField result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		//��ư ����
		JButton btn = new JButton("ok");
		
		//�̺�Ʈ ����
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Ŭ���� �ؽ�Ʈ������ ���� ������ ��� �� result�� ó��
				try {
					int value = Integer.parseInt(text.getText());
					result.setText(value*value+"");//��Ʈ���� �ٿ��� ����� ��Ʈ�� ��Ʈ������ �ٲ��ش�.
				} catch (NumberFormatException e1) {
					System.out.println("���ڸ� �Է����ּ���~~");
				}
				//text�ʵ�� ��Ŀ�� ��������
				text.requestFocus();

			}

		});
		
		//�гο� ��ư ����
		panel.add(btn);
		
		//�����ӿ� �г� ����
		mf.add(panel);	
	}
}
