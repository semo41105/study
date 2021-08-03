package com.test03.component;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class F_ComboBoxTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("�޺��ڽ��׽�Ʈ");
		mf.setSize(300,200);
		
		String[] animals = {"cat","dog", "tiger"};
		
		//�޺��ڽ� ����
		JComboBox animalList = new JComboBox(animals);
		
		//ó�� ���õǾ� �ִ� �� ����
		animalList.setSelectedIndex(1);//�迭�� �ε��� ��ȣ�� ���� �켱 ������ ���� ��.
		
		JLabel label = new JLabel();
		
		animalList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//� �޴��� �����ߴ��� ��Ҹ� ������ �´�.
				JComboBox cb = (JComboBox)e.getSource();
				//���õ� �޴��� �ؽ�Ʈ�� ������ �´�.
				String name = (String)cb.getSelectedItem();
				
				//���õ� �̸��� �ش��ϴ� ������ ����ش�.
				Image img = new ImageIcon("images/"+name+".PNG").getImage().getScaledInstance(150, 150, 0);
				label.setIcon(new ImageIcon(img));
			
			}
		});
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		mf.add(animalList, "North");
		mf.add(label, "South");
		
		mf.add(animalList, "North");
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
