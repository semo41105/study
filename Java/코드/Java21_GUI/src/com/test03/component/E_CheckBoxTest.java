package com.test03.component;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class E_CheckBoxTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		String[] fruits = {"apple", "orange", "banana"};
		
		JCheckBox[] buttons = new JCheckBox[3];
		
		for(int i = 0; i<buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
		}
		
		//여러개의 체크박스를 반복문을 사용하여 부착
		JPanel checkPanel = new JPanel();
		for(int i=0; i<buttons.length; i++) {
			checkPanel.add(buttons[i]);
		}
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("선택한 과일이 없습니다.");
		resultPanel.add(text);
		
		//이벤트 연결
		for(int i=0; i<buttons.length; i++) {
			buttons[i].addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					String result="";
					int cnt = 0;
					
					//체크가 되어 있는 체크박스를 확인
					for(int i=0; i<buttons.length; i++) {
						if(buttons[i].isSelected()){
							result += buttons[i].getText()+" ";
							cnt++;
						}
						text.setText(result);
					}
					
					if(cnt == 0) {
						text.setText("선택한 과일이 없습니다.");
					}
					
				}	
			});
		}

		mf.add(checkPanel, "North");
		mf.add(resultPanel, "Center");
		
		mf.pack();
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
