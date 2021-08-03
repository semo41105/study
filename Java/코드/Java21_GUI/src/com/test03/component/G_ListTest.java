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
		JFrame mf = new JFrame("����Ʈ �׽�Ʈ");
		mf.setSize(300,200);
		
		JPanel listPanel = new JPanel();
		JPanel panel = new JPanel();
		
		String[] cities = {"����", "����", "�뱸", "�λ�", "���", "����", "����", "����"};
		
		JList list = new JList(cities);
		
		//����Ʈ�� ��ũ�ѹ� �߰�
		JScrollPane scroller = new JScrollPane(list);
		
		scroller.setPreferredSize(new Dimension(200,50));
		
		//����Ʈ�� ���ø�带 ���� ���� ���� ����
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel label = new JLabel("���õ� �׸�: ");
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
