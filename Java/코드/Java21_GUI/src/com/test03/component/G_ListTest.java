package com.test03.component;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class G_ListTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("리스트 테스트");
		mf.setSize(300,200);
		
		JPanel listPanel = new JPanel();
		JPanel panel = new JPanel();
		
		String[] cities = {"서울", "대전", "대구", "부산", "경기", "전주", "광주", "제주"};
		
		JList list = new JList(cities);
		
		//리스트에 스크롤바 추가
		JScrollPane scroller = new JScrollPane(list);
		
		scroller.setPreferredSize(new Dimension(200,50));
		
		//리스트의 선택모드를 단일 선택 모드로 변경
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel label = new JLabel("선택된 항목: ");
		JTextField selected = new JTextField(10);
		selected.setEditable(false);
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				selected.setText((String)list.getSelectedValue());
			}
		});
		
		panel.add(label);
		panel.add(selected);
		listPanel.add(scroller);
		
		listPanel.add(scroller);
		
		mf.add(listPanel, "North");
		mf.add(panel, "Center");
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
