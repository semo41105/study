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
		JFrame mf = new JFrame("콤보박스테스트");
		mf.setSize(300,200);
		
		String[] animals = {"cat","dog", "tiger"};
		
		//콤보박스 생성
		JComboBox animalList = new JComboBox(animals);
		
		//처음 선택되어 있는 값 지정
		animalList.setSelectedIndex(1);//배열의 인덱스 번호에 따라 우선 지정할 것이 뜸.
		
		JLabel label = new JLabel();
		
		animalList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//어떤 메뉴를 선택했는지 요소를 가지고 온다.
				JComboBox cb = (JComboBox)e.getSource();
				//선택된 메뉴의 텍스트를 가지고 온다.
				String name = (String)cb.getSelectedItem();
				
				//선택된 이름에 해당하는 사진을 띄워준다.
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
