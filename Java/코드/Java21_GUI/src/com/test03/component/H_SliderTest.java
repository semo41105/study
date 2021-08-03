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
		JFrame mf = new JFrame("슬라이더 테스트");
		mf.setSize(300,300);
		
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("슬라이더를 움직여보세요", JLabel.CENTER);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel1.add(label);
		
		JPanel panel2 = new JPanel();
		JSlider slider = new JSlider(0,30,15);
		
		slider.setMajorTickSpacing(10); // 큰 눈금 간격
		slider.setMinorTickSpacing(1); // 작은눈금 간격
		slider.setPaintTicks(true); //눈금 표시
		slider.setPaintLabels(true);
		
		panel2.add(slider);
		
		JButton button = new JButton("전송");
		panel2.add(button);
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("결과값: ");
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
