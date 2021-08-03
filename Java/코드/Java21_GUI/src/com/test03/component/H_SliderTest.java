package com.test03.component;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class H_SliderTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("�����̴� �׽�Ʈ");
		mf.setSize(300,300);
		
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("�����̴��� ������������", JLabel.CENTER);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel1.add(label);
		
		JPanel panel2 = new JPanel();
		JSlider slider = new JSlider(0,30,15);
		
		slider.setMajorTickSpacing(10); // ū ���� ����
		slider.setMinorTickSpacing(1); // �������� ����
		slider.setPaintTicks(true); //���� ǥ��
		slider.setPaintLabels(true);
		
		panel2.add(slider);
		
		JButton button = new JButton("����");
		panel2.add(button);
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("�����: ");
		resultPanel.add(text);
		
		
		mf.add(panel1, "North");
		mf.add(panel2, "Center");
		mf.add(resultPanel, "South");
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText(slider.getValue()+"");
			}
		});
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
